import java.util.Scanner;
import java.util.Stack;

//Create a class name
public class BrowserHistory{
	public static void main(String[] args){
		Stack<String>history = new Stack < > ();
		Scanner scanner = new Scanner(System.in);//Create a scanner object that user input
		int choice;

//Use do-while to know the History pick
		do{

			System.out.println("\n---Browser History---");//Display the menu
			System.out.println("1. Visit New History");
			System.out.println("2. Go Back to Last Page");
			System.out.println("3. Delete All History");
			System.out.println("4. Exit");
			System.out.println("Enter the next choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();//To consume a newline


switch(choice){//To choose the number of the history browser
		case 1://The url page
		System.out.println("Enter URL page: ");
		String url = scanner.nextLine();
		history.push(url);
		System.out.println("The page is added to the history");
		break;

		case 2://Visited Page
		if(!history.isEmpty()){
			System.out.println("Last Page Visited history");
		}else{
			System.out.println("No page is added history available");
		}
		break;

		case 3://History Deleted
		history.clear();
		System.out.println("The history deleted");
		break;

		case 4://Exit
		System.out.println("Exit");
		break;
		default:
		System.out.println("Invalid,Try Again!");
	}
	System.out.println();
}while(choice != 4);//loop until the user's choice

}
}
