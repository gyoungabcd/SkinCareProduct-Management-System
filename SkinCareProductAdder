package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTextField;

class SkinCareProductAdder extends JFrame {

    public SkinCareProductAdder() {
        JPanel panel = new JPanel(new SpringLayout());

        JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
        JTextField fieldName = new JTextField(10);
        labelName.setLabelFor(fieldName);
        panel.add(labelName);
        panel.add(fieldName);

        JLabel labelPrice = new JLabel("Price: ", JLabel.TRAILING);
        JTextField fieldPrice = new JTextField(10);
        labelPrice.setLabelFor(fieldPrice);
        panel.add(labelPrice);
        panel.add(fieldPrice);

        JLabel labelExpirationDate = new JLabel("ExpirationDate: ", JLabel.TRAILING);
        JTextField fieldExpirationDate = new JTextField(10);
        labelExpirationDate.setLabelFor(fieldExpirationDate);
        panel.add(labelExpirationDate);
        panel.add(fieldExpirationDate);

        JLabel labelEffect = new JLabel("Effect: ", JLabel.TRAILING);
        JTextField fieldEffect = new JTextField(10);
        labelEffect.setLabelFor(fieldEffect);
        panel.add(labelEffect);
        panel.add(fieldEffect);

        panel.add(new JButton("save"));
        panel.add(new JButton("cancel"));

        SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);

        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.setVisible(true);
    }

   private JLabel JLabel(String string, int trailing) {
      // TODO Auto-generated method stub
      return null;
   }

}
