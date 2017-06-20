import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        String answer, answer1, answer2, answer3, answer4;
	        
	        System.out.println("How is the weather?");
	        
	        answer = sc.nextLine();
	        answer = sc.next("Enjoy your day");
	        answer1 = sc.next("rain");
	        answer2 = sc.next("windy");
	        answer3 = sc.next("snow");
	        answer4 = sc.next("stormy");
	        
	        if (answer == "rain")
	            System.out.println("Take your umbrella!");
	        else if (answer == "windy")
	            System.out.println("Wear your jacket!");
	        else if (answer == "snow" )
	            System.out.println("Wear a coat and take a shovel!");
	        else if (answer == "stormy")
	        	System.out.println("You should stay inside");
	        else
	            System.out.println("Enjoy your day!");

	}

}
