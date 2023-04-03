import java.util.Scanner;

public class SkinCareManager {
	static String suncream = "suncream"; static String pimple_balm = "pimple_balm"; static String moisture_cream = "moisture_cream";

	public static void main(String[] args) {
		
		int number=0; 
		Scanner sc = new Scanner(System.in);

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
				    editSkinCare();
				    break;
			    case 2:
				    effectSkinCare();
				    break;
			    case 3:
				    priceSkinCare();
				    break;
			    case 4:
				    expirationDateOfSkinCare();
				    break;
			}
		}
	}
			
	
	public static void editSkinCare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which do you want to edit?:");
		
		String editItem = sc.nextLine();
		System.out.println(editItem);
	}
        public static void effectSkinCare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which goods's effect do you want?(Choose between suncream,pimple_balm,and moisture_cream):");
		
		String effectItem = sc.nextLine();
		if(effectItem.equals(suncream)) {
			System.out.println("It protects your skin from the sun's UV rays");
		}else if(effectItem.equals(pimple_balm)) {
			System.out.println("It relieves pimples");
		}else if(effectItem.equals(moisture_cream)) {
			System.out.println("It provides moisture on your skin to prevent aging");
		}else{
			System.out.println("Back to menu!");
		}
	}
	public static void priceSkinCare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which goods's price do you want?(Choose between suncream,pimple_balm,and moisture_cream):");
		
		String priceItem = sc.nextLine();
		if(priceItem.equals(suncream)) {
			System.out.println("Its average price is 13000won");
		}else if(priceItem.equals(pimple_balm)) {
			System.out.println("Its average price is 12000won");
		}else if(priceItem.equals(moisture_cream)) {
			System.out.println("Its average price is 18000won");
		}else{
			System.out.println("Back to menu!");
		}
	}
	public static void expirationDateOfSkinCare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which goods's expiration date do you want?(Choose between suncream,pimple_balm,and moisture_cream):");
		
		String expirationDateOfItem = sc.nextLine();
		if(expirationDateOfItem.equals(suncream)) {
			System.out.println("Its expiration date is 2026/01/30");
		}else if(expirationDateOfItem.equals(pimple_balm)) {
			System.out.println("Its expiration date is 2025/12/09");
		}else if(expirationDateOfItem.equals(moisture_cream)) {
			System.out.println("Its expiration date is 2026/02/09");
		}else{
			System.out.println("Back to menu!");
		}
	}
}
