package com.kingaspx.toast.util;

import com.kingaspx.util.RoundFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class NotificationSucesso extends javax.swing.JDialog {

    public NotificationSucesso(java.awt.Frame parent, boolean modal, int miliseconds, String title, String msg) {
        super(parent, modal);
        initComponents();

    }

    private NotificationSucesso(JFrame jFrame, boolean b) {
        initComponents();
        new RoundFrame().corner(this, 450, 100, 10, 10);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int y = dim.height / 2 - getSize().height / 2;
        int half = y / 2;
        setLocation(dim.width / 2 - getSize().width / 2, y + half);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroudPanel = new keeptoo.KGradientPanel();
        logoWhatsapp_lbl = new javax.swing.JLabel();
        campoMsg_txt = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        kGradientPanel1 = new keeptoo.KGradientPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroudPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroudPanel.setkEndColor(new java.awt.Color(255, 255, 255));
        backgroudPanel.setkStartColor(new java.awt.Color(255, 255, 255));
        backgroudPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoWhatsapp_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoWhatsapp_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/icons8_notification_20px_1.png"))); // NOI18N
        backgroudPanel.add(logoWhatsapp_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 40));

        campoMsg_txt.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        campoMsg_txt.setForeground(new java.awt.Color(75, 75, 75));
        backgroudPanel.add(campoMsg_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 410, 20));

        campoTitulo.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        campoTitulo.setText("Sucesso");
        backgroudPanel.add(campoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 410, 20));

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(181, 181, 181));
        jLabel1.setText("Nova Notificação");
        backgroudPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 40));

        jSeparator1.setBackground(new java.awt.Color(234, 234, 234));
        jSeparator1.setForeground(new java.awt.Color(234, 234, 234));
        backgroudPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 430, 10));

        kGradientPanel1.setkEndColor(new java.awt.Color(62, 213, 140));
        kGradientPanel1.setkFillBackground(false);
        kGradientPanel1.setkStartColor(new java.awt.Color(64, 142, 105));
        kGradientPanel1.setOpaque(false);
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        backgroudPanel.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 100));

        getContentPane().add(backgroudPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 100));

        setBounds(0, 0, 450, 100);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NotificationSucesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotificationSucesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotificationSucesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotificationSucesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NotificationSucesso dialog = new NotificationSucesso(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel backgroudPanel;
    private javax.swing.JLabel campoMsg_txt;
    private javax.swing.JLabel campoTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel logoWhatsapp_lbl;
    // End of variables declaration//GEN-END:variables
}
