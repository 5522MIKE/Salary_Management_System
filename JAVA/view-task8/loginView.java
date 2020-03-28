package com.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 登录页面
 * @author MikyMing
 * @data 2020/3/26 - 19:15
 */
public class loginView extends JFrame {

    private JPanel contentPane;
    private JTextField userName;
    private JPasswordField userPsw;

    /**
     * Launch the application.
     */
//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    loginView frame = new loginView();
//                    frame.setVisible(true);
//                    frame.setLocationRelativeTo(null);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }

    //构建视图
    public loginView() {
        setTitle("\u6B22\u8FCE\u767B\u9646");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 444, 251);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel label = new JLabel("用户名");
        label.setBounds(60, 30, 80, 20);
        contentPane.add(label);

        JLabel label_1 = new JLabel("密码");
        label_1.setBounds(60, 90, 80, 20);
        contentPane.add(label_1);

        userName = new JTextField();
        userName.setBounds(150, 30, 145, 28);
        contentPane.add(userName);
        userName.setColumns(10);

        userPsw = new JPasswordField();
        userPsw.setBounds(150, 90, 145, 28);
        contentPane.add(userPsw);

        //登录按钮
        JButton textFile = new JButton("登录");
        textFile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = userName.getText();
                //只要name不为空就打开主窗口
                if(name != "")
                {
                    mainView  fram = new mainView();
                    fram.setLocationRelativeTo(null);
                    fram.setVisible(true);
                }

            }
        });

        //退出
        textFile.setBounds(108, 152, 69, 29);
        contentPane.add(textFile);

        JButton button_1 = new JButton("取消");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        button_1.setBounds(215, 152, 81, 29);
        contentPane.add(button_1);
    }
}
