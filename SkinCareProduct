package SkinCareProduct;
import java.io.Serializable;
import java.util.Scanner;

import exception.ExpirationDateFormatException;

public abstract class SkinCareProduct implements ProductInput,Serializable {
   /**
	 * 
	 */
	private static final long serialVersionUID = 2743517969790244345L;
	
	protected MadeIn country=MadeIn.Korea;
    protected String name;
    protected String price;
    protected String expirationDate;
    protected String effect;
    protected String packDate;
    
    public SkinCareProduct() {
    }
    
    public SkinCareProduct(MadeIn country) {
       this.country=country;
    }
    
    public SkinCareProduct(String name) {
       this.name = name;
    }
    public SkinCareProduct(MadeIn country, String name) {
       this.country=country;
       this.name=name;
    }
    public SkinCareProduct(String name, String price) {
       this.name=name;
       this.price=price;
    }
    
    public SkinCareProduct(MadeIn country, String name, String price) {
       this.country=country;
       this.name=name;
       this.price=price;
    }
    public SkinCareProduct(MadeIn country, String name, String price, String expirationDate) {
       this.country=country;
       this.name=name;
       this.price=price;
       this.expirationDate=expirationDate;
    }
    
    public SkinCareProduct(String name, String price, String expirationDate, String effect) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.effect = effect;
    }
    public SkinCareProduct(MadeIn country, String name, String price, String expirationDate, String effect) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.effect = effect;
    }
    public SkinCareProduct(String name, String price, String expirationDate, String effect, String packDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.effect = effect;
        this.packDate=packDate;
    }
    public SkinCareProduct(MadeIn country, String name, String price, String expirationDate, String effect, String packDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.effect = effect;
        this.packDate=packDate;
    }
    
    
    public MadeIn getCountry() {
      return country;
   }
   public void setCountry(MadeIn country) {
      this.country = country;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getPrice() {
      return price;
   }
   public void setPrice(String price) {
      this.price = price;
   }
   public String getExpirationDate() {
      return expirationDate;
   }
   public void setExpirationDate(String expirationDate) throws ExpirationDateFormatException {
      if (!expirationDate.contains("/") && !expirationDate.equals("")) {
         throw new ExpirationDateFormatException();
      }      
      this.expirationDate = expirationDate;
   }
   public String getPackDate() {
      return packDate;
   }
   public void setPackDate(String packDate) {
      this.packDate = packDate;
   }
   public String getEffect() {
      return effect;
   }
   public void setEffect(String effect) {
      this.effect = effect;
   }
   
   
    public abstract void printInfo();
    
    public void setProductName(Scanner input) {
      System.out.print("Product Name:");
      String name = input.next();
      this.setName(name);
   }
   
   public void setProductPrice(Scanner input) {
      System.out.print("Product Price:");
      String price = input.next();
      this.setPrice(price);
   }
   
   public void setProductExpirationDate(Scanner input) {
      String expirationDate = "";
      while (!expirationDate.contains("/")) {      
         System.out.print("Product Expiration Date:");
         expirationDate = input.next();
         try {
            this.setExpirationDate(expirationDate);
         } catch (ExpirationDateFormatException e) {
            System.out.println("Incorrect Expiration Format. put the expiration date that contains /");
         }
      }
   }
   
   public void setProductEffect(Scanner input) {
      System.out.print("Product effect:");
      String effect = input.next();
      this.setEffect(effect); 
   }
   
   public void setPackDate(Scanner input) {
       System.out.print("Pack Date:");
       String packDate = input.next();
       this.setPackDate(packDate);
   }
   
   public String getCountryString() {
      String scountry="none";
       switch(this.country) {
       case Korea:
          scountry="Kor.";
          break;
       case Usa:
          scountry="Us.";
          break;
       case Norway:
          scountry="Nor.";
          break;
       case Japan:
          scountry="Jap.";
          break;
       default:          
       }
       return scountry;
   }
}
