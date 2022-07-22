package SingeltonPattern;


class ConfigurationFile {
    //Create Private instance
    private static ConfigurationFile instance;

    //Create private constructor
    private ConfigurationFile(){
    }

    public static ConfigurationFile getInstance(){
        if(instance == null) {
            instance = new ConfigurationFile();
        }
        return instance;
    }

    public void printMessage(){
      System.out.println("Hello from Singleton object!!!");
   }


}
