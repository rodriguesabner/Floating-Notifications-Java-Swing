package com.kingaspx.toast.util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JLabel;
import keeptoo.KGradientPanel;

public class Toast {

    public static int LONG_DELAY = 3500; // 3.5 seconds
    public static int SHORT_DELAY = 2000; // 2 seconds

    public static class ToastSuccessful extends JDialog {

        int miliseconds;

        public ToastSuccessful(String toastString, int time) {
            this.miliseconds = time;
            setUndecorated(true);
            getContentPane().setLayout(new BorderLayout(0, 0));

            KGradientPanel panel = new KGradientPanel();
            panel.setkStartColor(new Color(0, 176, 155));
            panel.setkEndColor(new Color(150, 201, 61));

            panel.setOpaque(false);
            getContentPane().add(panel, BorderLayout.CENTER);
            setBackground(new Color(0, 0, 0, 0));

            JLabel toastLabel = new JLabel("");
            toastLabel.setText(toastString);
            toastLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
            toastLabel.setForeground(Color.WHITE);

            setBounds(100, 100, toastLabel.getPreferredSize().width + 30, 31);

            setAlwaysOnTop(true);

            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            int y = dim.height / 2 - getSize().height / 2;
            int half = y / 2;
            setLocation(dim.width / 2 - getSize().width / 2, y + half);

            panel.add(toastLabel);
            setVisible(false);

            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(miliseconds);
                        dispose();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }

    public static class ToastWarning extends JDialog {

        int miliseconds;

        public ToastWarning(String toastString, int time) {
            this.miliseconds = time;
            setUndecorated(true);
            getContentPane().setLayout(new BorderLayout(0, 0));

            KGradientPanel panel = new KGradientPanel();
            panel.setkStartColor(new Color(222, 222, 106));
            panel.setkEndColor(new Color(202, 197, 49));
            panel.setOpaque(false);
            getContentPane().add(panel, BorderLayout.CENTER);
            setBackground(new Color(0, 0, 0, 0));

            JLabel toastLabel = new JLabel("");
            toastLabel.setText(toastString);
            toastLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
            toastLabel.setForeground(Color.WHITE);

            setBounds(100, 100, toastLabel.getPreferredSize().width + 30, 31);

            setAlwaysOnTop(true);

            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            int y = dim.height / 2 - getSize().height / 2;
            int half = y / 2;
            setLocation(dim.width / 2 - getSize().width / 2, y + half);

            panel.add(toastLabel);
            setVisible(false);

            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(miliseconds);
                        dispose();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }

    public static class ToastError extends JDialog {

        int miliseconds;

        public ToastError(String toastString, int time) {
            this.miliseconds = time;
            setUndecorated(true);
            getContentPane().setLayout(new BorderLayout(0, 0));

            KGradientPanel panel = new KGradientPanel();
            panel.setkStartColor(new Color(235, 33, 57));
            panel.setkEndColor(new Color(149, 41, 31));
            panel.setOpaque(false);
            getContentPane().add(panel, BorderLayout.CENTER);
            setBackground(new Color(0, 0, 0, 0));

            JLabel toastLabel = new JLabel("");
            toastLabel.setText(toastString);
            toastLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
            toastLabel.setForeground(Color.WHITE);

            setBounds(100, 100, toastLabel.getPreferredSize().width + 30, 31);

            setAlwaysOnTop(true);

            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            int y = dim.height / 2 - getSize().height / 2;
            int half = y / 2;
            setLocation(dim.width / 2 - getSize().width / 2, y + half);

            panel.add(toastLabel);
            setVisible(false);

            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(miliseconds);
                        dispose();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }

    public static class ToastCustom extends JDialog {

        int miliseconds;

        public ToastCustom(String toastString, int time, Color startColor, Color endColor, int marginHorizontal, int marginVertical, String customFont, int styleFont, int sizeFont, Color colorFont) {
            this.miliseconds = time;
            setUndecorated(true);
            getContentPane().setLayout(new BorderLayout(0, 0));

            KGradientPanel panel = new KGradientPanel();
            panel.setkStartColor(startColor);
            panel.setkEndColor(endColor);
            panel.setOpaque(false);
            getContentPane().add(panel, BorderLayout.CENTER);
            setBackground(new Color(0, 0, 0, 0));

            JLabel toastLabel = new JLabel("");
            toastLabel.setText(toastString);
            toastLabel.setFont(new Font(customFont, styleFont, sizeFont));
            toastLabel.setForeground(colorFont);

            setBounds(100, 100, toastLabel.getPreferredSize().width + marginHorizontal, marginVertical);

            setAlwaysOnTop(true);

            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            int y = dim.height / 2 - getSize().height / 2;
            int half = y / 2;
            setLocation(dim.width / 2 - getSize().width / 2, y + half);

            panel.add(toastLabel);
            setVisible(false);

            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(miliseconds);
                        dispose();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }

}
