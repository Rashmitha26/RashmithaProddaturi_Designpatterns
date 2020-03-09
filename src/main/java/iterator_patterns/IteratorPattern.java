package iterator_patterns;
import java.util.*;
public class IteratorPattern {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		AppCollection appCollection=new AppCollection();
		System.out.println("Enter the number of apps");
		int number=scanner.nextInt();
		System.out.println("Enter the names of apps");
		for(int i=0;i<number;i++)
			appCollection.addItem(scanner.next());
        AppBuilder nb = new AppBuilder(appCollection); 
        nb.printNamesOfApps(); 
        scanner.close();
	}

}
