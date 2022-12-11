package TheBusiness.DB4OUtil;

import TheBusiness.ConfigureSystem;
import TheBusiness.Ecosystems;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author karthik
 * 
 */


public class DB4OUtil {

   // path to the data store
    private static final String FILE_NAME = Paths.get("Databank.db4o").toAbsolutePath().toString();
    
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
           
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(Ecosystems.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILE_NAME);
            
            return db;
            
            
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        
        return null;
        
    }

    public synchronized void storeSystem(Ecosystems system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public Ecosystems retrieveSystem(){
        ObjectContainer conn = createConnection();
        
        // Change to the object you want to save
        ObjectSet<Ecosystems> systems = conn.query(Ecosystems.class); 
        Ecosystems system;
        // If there's no System in the record, create a new one
        if (systems.size() == 0){
            system = ConfigureSystem.configure();  
        }
        else{
            system = systems.get(systems.size()-1);
        }
        conn.close();
        return system;
    }
}
