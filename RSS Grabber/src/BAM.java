import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import java.awt.Color;

import net.miginfocom.swing.MigLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;

import java.awt.Desktop;
import java.awt.Panel;
import java.awt.TextArea;

import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class BAM {

	private JFrame frmBam;
	private JTextArea txtrChrome;
	private JTextArea txtrFirefox;
	private JTextArea txtrSafari;
	private JTextArea txtrOpera;
	private JTextArea txtrSkype;
	
	JButton btnChrome;
	
	JButton btnFirefox;
	
	JButton btnSafari;
	
	JButton btnSkype;
	
	JButton btnOpera;

	/**
	 * Launch the application.
	 */
	public static BAM gogogo() {
		final BAM window = new BAM();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					window.frmBam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		return window;
	}

	/**
	 * Create the application.
	 */
	public BAM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBam = new JFrame();
		frmBam.setTitle("BAM");
		frmBam.setBounds(100, 100, 616, 441);
		frmBam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtrChrome = new JTextArea();
		txtrChrome.setLineWrap(true);
		txtrChrome.setEditable(false);
		txtrChrome.setText("Chrome");
		txtrChrome.setForeground(new Color(230, 230, 250));
		txtrChrome.setBackground(new Color(0, 100, 0));
		
		txtrFirefox = new JTextArea();
		txtrFirefox.setText("Firefox");
		txtrFirefox.setLineWrap(true);
		txtrFirefox.setForeground(new Color(230, 230, 250));
		txtrFirefox.setEditable(false);
		txtrFirefox.setBackground(new Color(0, 100, 0));
		
		txtrSafari = new JTextArea();
		txtrSafari.setText("Safari");
		txtrSafari.setLineWrap(true);
		txtrSafari.setForeground(new Color(230, 230, 250));
		txtrSafari.setEditable(false);
		txtrSafari.setBackground(new Color(0, 100, 0));
		
		txtrOpera = new JTextArea();
		txtrOpera.setText("Opera");
		txtrOpera.setLineWrap(true);
		txtrOpera.setForeground(new Color(230, 230, 250));
		txtrOpera.setEditable(false);
		txtrOpera.setBackground(new Color(0, 100, 0));
		
		txtrSkype = new JTextArea();
		txtrSkype.setText("Skype");
		txtrSkype.setLineWrap(true);
		txtrSkype.setForeground(new Color(230, 230, 250));
		txtrSkype.setEditable(false);
		txtrSkype.setBackground(new Color(0, 100, 0));
		
		btnChrome = new JButton("Download Chrome");
		
		btnChrome.setVisible(false);
		btnFirefox = new JButton("Download Firefox");
		
		btnFirefox.setVisible(false);
		btnSafari = new JButton("Download Safari");
		btnSafari.setVisible(false);
		btnSkype = new JButton("Download Skype");
		btnSkype.setVisible(false);
		btnOpera = new JButton("Download Opera");
		btnOpera.setVisible(false);
		
		GroupLayout groupLayout = new GroupLayout(frmBam.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrChrome, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrOpera, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(btnChrome))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(btnOpera, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)))
					.addGap(65)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(btnSkype, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(txtrSkype, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
								.addGap(231))
							.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(txtrFirefox, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(10)
										.addComponent(btnFirefox, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(10)
										.addComponent(btnSafari, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
									.addComponent(txtrSafari, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
								.addGap(30)))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrChrome, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrFirefox, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrSafari, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnChrome)
						.addComponent(btnFirefox)
						.addComponent(btnSafari))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtrOpera, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrSkype, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSkype)
						.addComponent(btnOpera))
					.addContainerGap(95, Short.MAX_VALUE))
		);
		frmBam.getContentPane().setLayout(groupLayout);
	}
	
	public void updateAvailable(JTextArea textArea, JButton button, String newVersion)
	{
		textArea.setText(textArea.getText()+"\nNew version available: "+newVersion);
		textArea.setBackground(new Color(230, 20, 25));
		
		button.setVisible(true);
	}
	
	public void updateAvailable(Application app, String newVersion, String link){
		switch(app.getTitle()){
		case "Chrome" : 
			updateAvailable(txtrChrome, btnChrome, newVersion);
			setupButton(app, btnChrome, newVersion, link);
			break;
		case "Firefox" : 
			updateAvailable(txtrFirefox, btnFirefox, newVersion);
			setupButton(app, btnFirefox, newVersion, link);
			break;
		case "Safari" : 
			updateAvailable(txtrSafari, btnSafari, newVersion);
			setupButton(app, btnSafari, newVersion, link);
			break;
		case "Opera" : 
			updateAvailable(txtrOpera, btnOpera, newVersion);
			setupButton(app, btnOpera, newVersion, link);
			break;
		case "Skype" : 
			updateAvailable(txtrSkype, btnSkype, newVersion);
			setupButton(app, btnSkype, newVersion, link);
			break;
		
		
		}
		
	}
	
	private void setupButton(final Application app, JButton button, final String newVersion, final String link)
	{
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openWebsite(link);
				finaliseUpdate(app, newVersion);
			}
		});
	}
	
	public void finaliseUpdate(Application app, String newVersion)
	{
		switch(app.getTitle()){
		case "Chrome" : 
			finaliseUpdate(txtrChrome, btnChrome, "Chrome", newVersion);
			
			break;
		case "Firefox" : 
			finaliseUpdate(txtrFirefox, btnFirefox, "Firefox",newVersion);
			break;
		case "Safari" : 
			finaliseUpdate(txtrSafari, btnSafari, "Safari",newVersion);
			break;
		case "Opera" : 
			finaliseUpdate(txtrOpera, btnOpera, "Opera",newVersion);
			break;
		case "Skype" : 
			finaliseUpdate(txtrSkype, btnSkype, "Skype",newVersion);
			break;
		
		
		}
		
		app.setVersion(newVersion);
	}
	
	private void finaliseUpdate(JTextArea textArea, JButton button, String name, String newVersion)
	{
		textArea.setText(name+"\n"+newVersion);
		textArea.setBackground(new Color(0, 100, 0));
		button.setVisible(false);
		
	}
	
	public void openWebsite(String site)
	{
		// Create Desktop object 
		Desktop d=Desktop.getDesktop(); 
		// Browse a URL, say google.com 
		try {
			d.browse(new URI(site));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //- See more at: http://java-demos.blogspot.co.uk/2012/10/open-url-in-java.html#sthash.Qgcr9Z3J.dpuf
		
	}
}
