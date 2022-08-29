import java.util.Scanner;

public class Addition {
	public static void main (String[] args) {
		
		Scanner myObj = new Scanner (System.in);
	
		System.out.println ("Type your first number.");
		int firstNumber = myObj.nextInt();
		
		System.out.println("Type your second number.");
		int secondNumber = myObj.nextInt();
		
		System.out.println("Type your function: +, -, *, or /");
		myObj.nextLine();
		String function = myObj.nextLine();
		
		switch (function) {
		case "+":
			System.out.println("The sum is:" + '\n' + (firstNumber +secondNumber));
		break;
		case "-":
			System.out.println("The sum is:" + '\n' + (firstNumber -secondNumber));
		break;
		case "*":
			System.out.println("The sum is:" + '\n' + (firstNumber *secondNumber));
		break;
		case "/":
			System.out.println("The sum is:" + '\n' + (firstNumber /secondNumber));
		break;
		default:
			System.out.println ("Input Error!");
		}
	}
}
