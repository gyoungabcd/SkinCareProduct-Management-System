package forProject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import SkinCareProduct.JapanProduct;
import SkinCareProduct.KoreaProduct;
import SkinCareProduct.MadeIn;
import SkinCareProduct.ProductInput;
import SkinCareProduct.UsaProduct;

public class SkinCareProductManager implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3146469726622892599L;
	ArrayList<ProductInput> skinCareProducts = new ArrayList<ProductInput>();
	transient Scanner input;
	SkinCareProductManager(Scanner input) {
		this.input = input;
	}

	public void addSkinCareProduct() {
		int country=0;
		ProductInput productInput;
		while(country < 1 || country > 3) {
			try {						
				System.out.println("1 for Korea");
				System.out.println("2 for Usa"); 
				System.out.println("3 for Japan");
				System.out.print("Select num 1, 2, or 3 for skinCareProduct country:"); 
				country=input.nextInt();
				if(country==1) {
					productInput = new KoreaProduct(MadeIn.Korea);
					productInput.getUserInput(input);
					skinCareProducts.add(productInput);
					break;
				}
				else if(country==2) {
					productInput = new UsaProduct(MadeIn.Usa);
					productInput.getUserInput(input);
					skinCareProducts.add(productInput);
					break;
				}
				else if(country==3) {
					productInput = new JapanProduct(MadeIn.Japan);
					productInput.getUserInput(input);
					skinCareProducts.add(productInput);
					break;
				}
				else {
					System.out.println("Select num 1, 2, or 3 for skinCareProduct country:");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				country = -1;

			}
		}
	}


	public void deleteSkinCareProduct() {
		System.out.print("Product Name:");
		String productName = input.next();
		int index = findIndex(productName);
		removefromProducts(index, productName);
	}

	public int findIndex(String productName) {
		int index = -1;
		for (int i = 0; i<skinCareProducts.size(); i++) {

			if (skinCareProducts.get(i).getName().equals(productName)) {
				index = i;
				break; 
			}
		}
		return index;
	}		

	public int removefromProducts(int index, String productName) {
		if (index >= 0) {
			skinCareProducts.remove(index);
			System.out.println(productName + " is deleted");
			return 1;
		}
		else {
			System.out.println("the product has not been registered");
			return -1;
		}		
	}

	public void editSkinCareProduct() {
		System.out.print("SkinCareProduct Name:");
		String productName = input.next();
		for (int i = 0; i<skinCareProducts.size(); i++) {
			ProductInput product = skinCareProducts.get(i);
			if (product.getName().equals(productName)) {

				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						product.setProductName(input);	
						break;
					case 2:
						product.setProductPrice(input);
						break;
					case 3:
						product.setProductExpirationDate(input);
						break;
					case 4:
						product.setProductEffect(input);
						break;
					default:
						continue;
					}
				} // while
				break;
			} // if
		} // for
	}

	public void viewSkinCareProducts() {
		for (int i = 0; i<skinCareProducts.size(); i++) {
			skinCareProducts.get(i).printInfo();

		}
	}





	public void showEditMenu() {
		System.out.println("** SkinCareProduct Info Edit Menu **");
		System.out.println(" 1. Edit Name");
		System.out.println(" 2. Edit price");
		System.out.println(" 3. Edit expirationDate");
		System.out.println(" 4. Edit effect");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5:");

	}
}
