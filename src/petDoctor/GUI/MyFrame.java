package petDoctor.GUI;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		createFrame();
	}

	private void createFrame() {
		setTitle("KISÁLLAT KLINIKA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		
		setJMenuBar(createMenuBar());
		setVisible(true);
	}

	private JMenuBar createMenuBar() {

		JMenuBar menuBar = new JMenuBar();		//menüsor
		JMenu fileMenu = new JMenu("Fájl");
		JMenu searchMenu = new JMenu("Keresés");
		JMenu deleteMenu = new JMenu("Törlés");
		JMenu exportMenu = new JMenu("Exportálás");
		
		JMenuItem newOwner = new JMenuItem("Új gazdi felvitele");
		JMenuItem newPet = new JMenuItem("Új kisállat felvitele");
		JMenuItem newVacc = new JMenuItem("Új oltás felvitele");
		
		JMenuItem searchOwner = new JMenuItem("Gazdi keresése");
		JMenuItem searchPet = new JMenuItem("Kisállat keresése");
		JMenuItem searchVacc = new JMenuItem("Oltás keresése");
		
		newOwner.addActionListener(a -> new MyDialog(this));
		newPet.addActionListener(e -> new MyDialog(this));
		newVacc.addActionListener(v -> new MyDialog(this));
	//	deleteMenu.addActionListener(d -> new MyDialog(this));

		fileMenu.add(newOwner);
		fileMenu.add(newPet);
		fileMenu.add(newVacc);
		
		searchMenu.add(searchOwner);
		searchMenu.add(searchPet);
		searchMenu.add(searchVacc);

		menuBar.add(fileMenu);
		menuBar.add(searchMenu);
		menuBar.add(deleteMenu);
		menuBar.add(exportMenu);

		return menuBar;
	}
}
