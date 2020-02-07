package mavenexample;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws NullPointerException{
		Scanner sc = new Scanner(System.in);
		Gifts g = new Gifts();
		boolean flag = true;
		do {
			// Reading input
			System.out.println("Press 1 to add chocolate"
					+ "Press 2 to add sweet to stop adding candies");
			int choice = sc.nextInt();
			
			// Add item to gift
			switch(choice) {
			
			case 1:
				//adding chocolates
				System.out.println("Enter varient");
				String varient = sc.next() + sc.nextLine();
				System.out.println("Enter manufacturer");
				String manufacturer = sc.nextLine();
				g.addCandy(new Chocolates(varient,manufacturer));
				break;
			case 2:
				//add sweets
				System.out.println("Enter varient");
				varient = sc.next() + sc.nextLine();
				System.out.println("Enter manufacturer");
				manufacturer = sc.nextLine();
				g.addCandy(new Sweets(varient,manufacturer));
				break;
			case 3:
				flag = false;
				break;
			default:
				System.out.println("Enter  valid choice");
				break;
			}
		}while(flag);
		System.out.println("Number of items in gift : " + g.getNumberOfCandies());
		for(Candy c : g.getAllCandies()) {
			c.mygift();
		}
	}
}
