public class App {
     public static String appName;

     public App(String appName){
         this.appName = appName;
     }

     public void runApp(){
         System.out.println("Application "+appName+" is running.");
     }
}
