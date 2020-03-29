package viewtem;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JSplitPane;

import viewtem.userTree;


/**
 * 用户管理窗口
 * @author JYF
 *
 */
public class userManagerFrame extends JPanel {

	/**
	 * Create the panel.
	 */
	JSplitPane splitPane;
	
	public userManagerFrame() {
		setLayout(new BorderLayout(0, 0));
		
		splitPane = new JSplitPane();
		splitPane.setLeftComponent(new myTree());
		splitPane.setRightComponent(new userInfoCreat());
		add(splitPane, BorderLayout.CENTER);

	}
	class myTree extends userTree{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			
			splitPane.setLeftComponent(new myTree());	
			
		}

		@Override
		public void leftNodeSelected() {
			// TODO 自动生成的方法存根
			
			System.out.println("叶子节点被选中了！");
			
			
		}
	}

}
