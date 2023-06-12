package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import SkinCareProduct.ProductInput;
import forProject.SkinCareProductManager;



public class SkinCareProductViewer extends JPanel {
	
	WindowFrame frame;
	
	SkinCareProductManager skinCareProductManager;

    public SkinCareProductViewer(WindowFrame frame,SkinCareProductManager skinCareProductManager) {
	   
	  this.frame=frame;
	  this.skinCareProductManager=skinCareProductManager;
	  
	  System.out.println("***"+skinCareProductManager.size()+"***");
	  
      DefaultTableModel model = new DefaultTableModel();
      model.addColumn("NAME");
      model.addColumn("PRICE");
      model.addColumn("EXPIRATION DATE");
      model.addColumn("EFFECT");
      
      for(int i=0;i<skinCareProductManager.size();i++) {
    	  Vector row=new Vector();
    	  ProductInput si=skinCareProductManager.get(i);
    	  row.add(si.getName());
    	  row.add(si.getPrice());
    	  row.add(si.getExpirationDate());
    	  row.add(si.getEffect());
    	  model.addRow(row);
      }
      
      JTable table = new JTable(model);
      JScrollPane sp = new JScrollPane(table);
   
       
      this.add(sp);
   }
}
