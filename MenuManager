package forProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger=new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		SkinCareProductManager skinCareProductManager = getObject("skinCareProductManager.ser");
		if(skinCareProductManager==null) {
			skinCareProductManager=new SkinCareProductManager(input);
		}
		
		WindowFrame frame=new WindowFrame(skinCareProductManager);
		selectMenu(input, skinCareProductManager);
		putObject(skinCareProductManager,"skinCareProductManager.ser");
	}

	public static void selectMenu(Scanner input, SkinCareProductManager skinCareProductManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					skinCareProductManager.addSkinCareProduct();
					logger.log("add a SkinCareProduct");
					break;
				case 2:
					skinCareProductManager.deleteSkinCareProduct();
					logger.log("delete a SkinCareProduct");
					break;
				case 3:
					skinCareProductManager.editSkinCareProduct();
					logger.log("edit a SkinCareProduct");
					break;
				case 4:
					skinCareProductManager.viewSkinCareProducts();
					logger.log("view a SkinCareProduct");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;				
			}
		}		
	}

	public static void showMenu() {
		System.out.println("*** SkinCareProduct Management System Menu ***");
		System.out.println(" 1. Add SkinCareProduct");
		System.out.println(" 2. Delete SkinCareProduct");
		System.out.println(" 3. Edit SkinCareProduct");
		System.out.println(" 4. View SkinCareProduct");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5:");

	}
	
	public static SkinCareProductManager getObject(String filename) {
		SkinCareProductManager skinCareProductManager=null;
		
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			skinCareProductManager=(SkinCareProductManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return skinCareProductManager;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return skinCareProductManager;
	}
	
	public static void putObject(SkinCareProductManager skinCareProductManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(skinCareProductManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
