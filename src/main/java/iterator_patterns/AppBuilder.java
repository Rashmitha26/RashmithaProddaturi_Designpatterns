package iterator_patterns;

public class AppBuilder {
	AppCollection appCollection;
	  
    public AppBuilder(AppCollection appCollection) 
    { 
        this.appCollection=appCollection;
    } 
  
    public void printNamesOfApps() 
    { 
        Iterator iterator = appCollection.createIterator(); 
        System.out.println("List of names of Apps are"); 
        while (iterator.hasNext()) 
        { 
            App n = (App)iterator.next(); 
            System.out.println("Name of the app: "+n.getAppName()); 
        } 
    } 

}
