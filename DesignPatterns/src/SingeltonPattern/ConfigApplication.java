package SingeltonPattern;

public class ConfigApplication {

    public static void main(String[] args){
        ConfigurationFile configurationFile1 = ConfigurationFile.getInstance();

        configurationFile1.printMessage();
        System.out.println(configurationFile1.hashCode()) ;

        ConfigurationFile configurationFile2= ConfigurationFile.getInstance();
        System.out.println(configurationFile2.hashCode()) ;
}

}
