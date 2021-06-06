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
		setTitle("KIS�LLAT KLINIKA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		
		setJMenuBar(createMenuBar());
		setVisible(true);
	}

	private JMenuBar createMenuBar() {

		JMenuBar menuBar = new JMenuBar();		//men�sor
		JMenu fileMenu = new JMenu("F�jl");
		JMenu searchMenu = new JMenu("Keres�s");
		JMenu deleteMenu = new JMenu("T�rl�s");
		JMenu exportMenu = new JMenu("Export�l�s");
		
		JMenuItem newOwner = new JMenuItem("�j gazdi felvitele");
		JMenuItem newPet = new JMenuItem("�j kis�llat felvitele");
		JMenuItem newVacc = new JMenuItem("�j olt�s felvitele");
		
		JMenuItem searchOwner = new JMenuItem("Gazdi keres�se");
		JMenuItem searchPet = new JMenuItem("Kis�llat keres�se");
		JMenuItem searchVacc = new JMenuItem("Olt�s keres�se");
		
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
