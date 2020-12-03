import java.util.Scanner;

public class workingWithGit {

	public static void main(String[] args) {
		System.out.println("Java vas pita kako se zovete");
		
		Scanner input = new Scanner(System.in);
		
		String response = input.nextLine();

		System.out.println("Welcome to Java World " + response);
		
		System.out.println("Do you like Java?");

	}

}
