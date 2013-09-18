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
import java.awt.Panel;
import java.awt.TextArea;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;


public class BAM {

	private JFrame frmBam;
	private JTextArea txtrChrome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BAM window = new BAM();
					window.frmBam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
		frmBam.setBounds(100, 100, 450, 300);
		frmBam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtrChrome = new JTextArea();
		txtrChrome.setLineWrap(true);
		txtrChrome.setEditable(false);
		txtrChrome.setText("Chrome");
		txtrChrome.setForeground(new Color(230, 230, 250));
		txtrChrome.setBackground(new Color(0, 100, 0));
		GroupLayout groupLayout = new GroupLayout(frmBam.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addComponent(txtrChrome, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(320, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(41)
					.addComponent(txtrChrome, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(156, Short.MAX_VALUE))
		);
		frmBam.getContentPane().setLayout(groupLayout);
	}
	
	public void updateAvailableChrome(String newVersion)
	{
		txtrChrome.setText(txtrChrome.getText()+newVersion);
	}
	
	public void updateChrome(String newVersion)
	{
		txtrChrome.setText("Chrome\n"+newVersion);
	}
}
