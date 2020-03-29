package viewtem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

/**
 * 主界面改进版
 * @author JYF
 *
 */

public class mainFram extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFram frame = new mainFram();
					//frame.add();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainFram() {
		setTitle("程序主界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel infoView = new JPanel();		
		tabbedPane.addTab("用户信息", null, infoView, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("工资查询", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("工资发放", null, panel_2, null);	
		
		userManagerFrame panel_3 = new userManagerFrame();
		tabbedPane.addTab("用户管理", null, panel_3, null);
	}

}
