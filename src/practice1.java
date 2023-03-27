import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		int number=0; 
		String suncream="suncream"; String pimple_balm="pimple_balm"; String moisture_cream="moisture_cream"; 
		Scanner sc=new Scanner(System.in);
		
		while(number!=6) {
			System.out.println("1. Edit SkinCare");
			System.out.println("2. Effect SkinCare");
			System.out.println("3. Price SkinCare");
			System.out.println("4. Expiration date of SkinCare");
			System.out.println("5. Back to menu");
			System.out.println("6. Exit");
			System.out.println("choose the number between 1~6:");
			number=sc.nextInt();
			switch(number) {
			case 1:
				System.out.print("Which do you want to edit?:");
				String goods=sc.next();
				break;
				
			case 2:
				System.out.print("Which goods's effect do you want?(Choose between suncream,pimple_balm,and moisture_cream):");
				String kind1=sc.next();
				
				if(kind1.equals(suncream)) {
					System.out.println("It protects your skin from the sun's UV rays");
				}else if(kind1.equals(pimple_balm)) {
					System.out.println("It relieves pimples");
				}else if(kind1.equals(moisture_cream)) {
					System.out.println("It provides moisture on your skin to prevent aging");
				}else{
					System.out.println("Back to menu!");
				}break;
				
			case 3:
				System.out.print("Which goods's price do you want?(Choose between suncream,pimple_balm,and moisture_cream):");
				String kind2=sc.next();
			
				if(kind2.equals(suncream)) {
					System.out.println("Its average price is 13000won");
				}else if(kind2.equals(pimple_balm)) {
					System.out.println("Its average price is 12000won");
				}else if(kind2.equals(moisture_cream)) {
					System.out.println("Its average price is 18000won");
				}else{
					System.out.println("Back to menu!");
				}break;
				
			case 4:
				System.out.print("Which goods's expiration date do you want?(Choose between suncream,pimple_balm,and moisture_cream):");
				String kind3=sc.next();
				
				if(kind3.equals(suncream)) {
					System.out.println("Its expiration date is 2026/01/30");
				}else if(kind3.equals(pimple_balm)) {
					System.out.println("Its expiration date is 2025/12/09");
				}else if(kind3.equals(moisture_cream)) {
					System.out.println("Its expiration date is 2026/02/09");
				}else{
					System.out.println("Back to menu!");
				}break;
			}
		}sc.close();	
	}
}
