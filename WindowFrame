 package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import forProject.SkinCareProductManager;

public class WindowFrame extends JFrame{
	
	SkinCareProductManager skinCareProductManager;
	MenuSelection menuselection;
	SkinCareProductAdder skincareproductadder;
	SkinCareProductViewer skincareproductviewer;
	
	
	public WindowFrame(SkinCareProductManager skinCareProductManager) {
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.skinCareProductManager=skinCareProductManager;
		this.menuselection = new MenuSelection(this);
		this.skincareproductadder = new SkinCareProductAdder(this);
		this.skincareproductviewer = new SkinCareProductViewer(this,this.skinCareProductManager);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public SkinCareProductAdder getSkincareproductadder() {
		return skincareproductadder;
	}

	public void setSkincareproductadder(SkinCareProductAdder skincareproductadder) {
		this.skincareproductadder = skincareproductadder;
	}

	public SkinCareProductViewer getSkincareproductviewer() {
		return skincareproductviewer;
	}

	public void setSkincareproductviewer(SkinCareProductViewer skincareproductviewer) {
		this.skincareproductviewer = skincareproductviewer;
	}
}
