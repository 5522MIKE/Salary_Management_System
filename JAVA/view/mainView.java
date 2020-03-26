package com.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * 系统主页面
 * @author MikyMing
 * @data 2020/3/26 - 19:20
 */
public class mainView extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//                    mainView frame = new mainView();
//					//frame.add();
//					frame.setVisible(true);
//					frame.setLocationRelativeTo(null);
//
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

    //构建视图
    public mainView() {
        setTitle("\u7A0B\u5E8F\u4E3B\u754C\u9762");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 910, 635);
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
    }

}
