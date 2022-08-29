import java.util.Scanner;

public class Veggies {
	
	public static void main(String[] args) {
		System.out.println ("Days!");
		int i = 0;
		String day= "Day ";
		while (i < 7) {
			System.out.println (day+ (i+1));
			i++;
		}
		
		System.out.println(" " + '\n' +"Communication Channels");
		String [] communicationChannels = { "IRC", "Discord", "Facebook", "Telegram", "Signal", "Viber" };
		int c = 0;
		while (c <6) {
			System.out.println ((c+1)+ "." + communicationChannels[c]);  
			c++;
		}
		
	}
}
