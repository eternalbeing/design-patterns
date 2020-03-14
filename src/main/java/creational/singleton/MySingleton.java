package creational.singleton;

public class MySingleton {

    private MySingleton(){

    }

    private static MySingleton instance;
    /**
     * has to be a volatile instance variable to prevent cache incoherence issue.
     */
    private static volatile MySingleton dclInstance;

    /**
     * Thread safe but synchronization overhead
     * @return
     */
    public static synchronized MySingleton getInstance(){
        if(instance == null){
            instance = new MySingleton();
        }
        return instance;
    }

    /**
     * Thread safe and no synchronisaction overhead
     * @return
     */
    public static MySingleton getDCLSingleton(){
        if(dclInstance == null){
            synchronized (MySingleton.class){
                if(dclInstance == null){
                    dclInstance = new MySingleton();
                }
            }
        }
        return dclInstance;
    }


}
