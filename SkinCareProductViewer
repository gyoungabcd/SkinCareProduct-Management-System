package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;



public class SkinCareProductViewer extends JFrame {

   public SkinCareProductViewer() {
      DefaultTableModel model = new DefaultTableModel();
      model.addColumn("NAME");
      model.addColumn("PRICE");
      model.addColumn("EXPIRATION DATE");
      model.addColumn("EFFECT");
      JTable table = new JTable(model);
       JScrollPane sp = new JScrollPane(table);
   
       
       this.add(sp);
      this.setSize(300, 300);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);   
   }

}
