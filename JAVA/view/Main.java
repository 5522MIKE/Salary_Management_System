package com.view;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    loginView frame = new loginView();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
