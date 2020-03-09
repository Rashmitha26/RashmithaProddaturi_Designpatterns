package iterator_patterns;

public class AppCollection implements Collections {

	static final int MAX_ITEMS = 30; 
    int numberOfItems = 0; 
    App[] AppList; 
  
    public AppCollection() 
    { 
        AppList = new App[MAX_ITEMS]; 
        
    } 
  
    public void addItem(String str) 
    { 
        App app=new App(str); 
        if (numberOfItems >= MAX_ITEMS) 
            System.err.println("You've reached the maximum limit. The new app cannot be added"); 
        else
        { 
            AppList[numberOfItems] =app; 
            numberOfItems = numberOfItems + 1; 
        } 
    } 
  
    public Iterator createIterator() 
    { 
        return new AppIterator(AppList); 
    } 
    
     

}
