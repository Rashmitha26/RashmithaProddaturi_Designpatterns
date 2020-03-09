package iterator_patterns;

public class AppIterator implements Iterator {

	App[] AppList; 
	int pos = 0; 
    public  AppIterator (App[] AppList) 
    { 
        this.AppList=AppList;
    } 
  
    public Object next() 
    { 
    	App app=AppList[pos++];
        return app; 
    } 
  
    public boolean hasNext() 
    { 
        if (pos >= AppList.length || 
            AppList[pos] == null) 
            return false; 
        else
            return true; 
    } 

}
