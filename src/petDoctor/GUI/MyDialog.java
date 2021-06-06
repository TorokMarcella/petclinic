package petDoctor.GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyDialog extends JDialog{
	
	private MyFrame frame;
	
	public MyDialog(MyFrame frame) {
		this.frame = frame;
	//	torlesPanel();
		createDialog();
	//	allatDialog();
	}

	private void createDialog() {
		setTitle("Gazdi hozz�ad�sa");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setLayout(new BorderLayout());
		add(gazdiPanel(), BorderLayout.CENTER);
		add(adGombPanel(), BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setPreferredSize(new Dimension(400,200));
		
		pack();
		
		setVisible(true);
	}
		
//	private void allatDialog() {
//		setTitle("Kis�llat hozz�ad�sa");
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//		
//		setLayout(new BorderLayout());
//		add(kisallatPanel(), BorderLayout.CENTER);
//		add(adGombPanel(), BorderLayout.SOUTH);
//		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//		this.setPreferredSize(new Dimension(400,200));
//		
//		pack();
//		
//		setVisible(false);
//		
//	}

	private JPanel gazdiPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,20));
		
		JLabel nevLabel = new JLabel("N�v");
		JLabel azonositoLabel = new JLabel("Azonos�t�");
		JLabel emailLabel = new JLabel("E-mail");
		JLabel telefonLabel = new JLabel("Telefonsz�m");
		JLabel kisallatLabel = new JLabel("Kis�llat neve");
		
		JTextField nevTf = new JTextField(10);
		JTextField azonositoTf = new JTextField(10);
		JTextField emailTf = new JTextField(10);
		JTextField telefonTf = new JTextField(10);
		JTextField kisallTf = new JTextField();
		
		panel.add(nevLabel);
		panel.add(nevTf);
		panel.add(azonositoLabel);
		panel.add(azonositoTf);
		panel.add(emailLabel);
		panel.add(emailTf);
		panel.add(telefonLabel);
		panel.add(telefonTf);
		panel.add(kisallatLabel);
		panel.add(kisallTf);
		
		return panel;
	}
	
	private JPanel kisallatPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,3));
		
		JLabel nevLabel = new JLabel("N�v");
		JLabel fajtaLabel = new JLabel("Fajta");
		JLabel tipusLabel = new JLabel("T�pus");
		JLabel szinLabel = new JLabel("Sz�n");
		JLabel szulLabel = new JLabel("Sz�let�si d�tum");
		JLabel sulyLabel = new JLabel("S�ly");
		JLabel chipLabel = new JLabel("Chipsz�m");
		
		JTextField nevTf = new JTextField(10);
		JTextField fajtaTf = new JTextField(10);
		JTextField tipusTf = new JTextField(10);
		JTextField szinTf = new JTextField(10);
		JTextField szulTf = new JTextField(10);
		JTextField sulyTf = new JTextField(10);
		JTextField chipTf = new JTextField(10);
		
		panel.add(nevLabel);
		panel.add(nevTf);
		panel.add(fajtaLabel);
		panel.add(fajtaTf);
		panel.add(tipusLabel);
		panel.add(tipusTf);
		panel.add(szinLabel);
		panel.add(szinTf);
		panel.add(szulLabel);
		panel.add(szulTf);
		panel.add(sulyLabel);
		panel.add(sulyTf);
		panel.add(chipLabel);
		panel.add(chipTf);
		
		return panel;
	}
	
	private JPanel oltasPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,3));
		
		JLabel nevLabel = new JLabel("Kis�llat neve");
		JLabel datumLabel = new JLabel("Olt�s ideje");
		JLabel ervenyessegLabel = new JLabel("Olt�s �rv�nyess�ge");
		JLabel tipusLabel = new JLabel("Olt�s t�pusa");
		
		JTextField nevTf = new JTextField(10);
		JTextField datumTf = new JTextField(10);
		JTextField ervenyessegTf = new JTextField(10);
		JTextField tipusTf = new JTextField(10);
		
		panel.add(nevLabel);
		panel.add(nevTf);
		panel.add(datumLabel);
		panel.add(datumTf);
		panel.add(ervenyessegLabel);
		panel.add(ervenyessegTf);
		panel.add(tipusLabel);
		panel.add(tipusTf);
		
		return panel;
		
	}
	
	private JPanel gazdiKeresPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,3));
		
		JLabel nevLabel = new JLabel("Gazda neve");
		JLabel azonositoLabel = new JLabel("Gazda azonos�t�ja");
		
		JTextField nevTf = new JTextField(10);
		JTextField azonositoTf = new JTextField(10);
		
		panel.add(nevLabel);
		panel.add(nevTf);
		panel.add(azonositoLabel);
		panel.add(azonositoTf);
		panel.add(keresGombPanel());
		
		return panel;
	}
	
	private JPanel allatKeresPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,3));
		
		JLabel nevLabel = new JLabel("Kis�llat neve");
		JLabel chipLabel = new JLabel("Kis�llat chipsz�ma");
		
		JTextField nevTf = new JTextField(10);
		JTextField chipTf = new JTextField(10);
		
		panel.add(nevLabel);
		panel.add(nevTf);
		panel.add(chipLabel);
		panel.add(chipTf);
		panel.add(keresGombPanel());
		
		return panel;
	}
	
	private JPanel oltasKeresPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,3));
		
		JLabel oltasLabel = new JLabel("Olt�s neve");
		
		JTextField oltasTf = new JTextField(10);
		
		panel.add(oltasLabel);
		panel.add(oltasTf);
		panel.add(keresGombPanel());
		
		return panel;
	}
	
	private JPanel torlesPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,3));
		
		JButton torlesGomb = new JButton("T�RL�S");
		JButton kilepButton = new JButton("KIL�P�S");
		
		kilepButton.addActionListener(e -> this.dispose());
		
		JLabel allatLabel = new JLabel("Kis�llat neve");
		JLabel gazdiLabel = new JLabel("Gazda azonos�t�ja");
		
		JTextField allatTf = new JTextField(10);
		JTextField gazdiTf = new JTextField(10);
		
		panel.add(allatLabel);
		panel.add(allatTf);
		panel.add(gazdiLabel);
		panel.add(gazdiTf);
		panel.add(torlesGomb);
		panel.add(kilepButton);
		
		return panel;
	}
	
	private JPanel adGombPanel() {
		JPanel panel = new JPanel();
		
		JButton adButton = new JButton("HOZZ�AD");
		JButton kilepButton = new JButton("KIL�P�S");
		
		kilepButton.addActionListener(e -> this.dispose());
		
		panel.add(adButton);
		panel.add(kilepButton);
		
		return panel;
	}

	private JPanel keresGombPanel() {
		JPanel panel = new JPanel();
		
		JButton keresButton = new JButton("KERES�S");
		JButton kilepButton = new JButton("KIL�P�S");
		
		kilepButton.addActionListener(e -> this.dispose());
		
		panel.add(keresButton);
		panel.add(kilepButton);
		
		return panel;
	}
}
