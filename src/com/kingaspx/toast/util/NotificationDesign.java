package com.kingaspx.toast.util;

import com.kingaspx.util.RoundFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class NotificationDesign extends javax.swing.JDialog {

    public NotificationDesign(java.awt.Frame parent, boolean modal, int miliseconds, String title, String msg) {
        super(parent, modal);
        initComponents();

    }

    private NotificationDesign(JFrame jFrame, boolean b) {
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
        campoTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoMsg_txt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        vermsg_btn = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroudPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroudPanel.setkEndColor(new java.awt.Color(255, 255, 255));
        backgroudPanel.setkStartColor(new java.awt.Color(255, 255, 255));
        backgroudPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoWhatsapp_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoWhatsapp_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/icons8_whatsapp_20px.png"))); // NOI18N
        backgroudPanel.add(logoWhatsapp_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        campoTitulo.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        campoTitulo.setText("Abner Rodrigues");
        backgroudPanel.add(campoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 410, 20));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        campoMsg_txt.setColumns(20);
        campoMsg_txt.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        campoMsg_txt.setLineWrap(true);
        campoMsg_txt.setRows(5);
        campoMsg_txt.setText("adsklaksçldkçlsakdçlkasd");
        campoMsg_txt.setDisabledTextColor(new java.awt.Color(75, 75, 75));
        campoMsg_txt.setEnabled(false);
        jScrollPane1.setViewportView(campoMsg_txt);

        backgroudPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 410, 30));

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(181, 181, 181));
        jLabel1.setText("WhatsApp");
        backgroudPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        jSeparator1.setBackground(new java.awt.Color(234, 234, 234));
        jSeparator1.setForeground(new java.awt.Color(234, 234, 234));
        backgroudPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 430, 10));

        vermsg_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/icons8_filled_circle_15px.png"))); // NOI18N
        vermsg_btn.setToolTipText("Mais");
        vermsg_btn.setContentAreaFilled(false);
        vermsg_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vermsg_btn.setFocusPainted(false);
        vermsg_btn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        backgroudPanel.add(vermsg_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 40, 30));

        kGradientPanel1.setkFillBackground(false);
        kGradientPanel1.setOpaque(false);
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
            java.util.logging.Logger.getLogger(NotificationDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotificationDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotificationDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotificationDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NotificationDesign dialog = new NotificationDesign(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextArea campoMsg_txt;
    private javax.swing.JLabel campoTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel logoWhatsapp_lbl;
    private javax.swing.JButton vermsg_btn;
    // End of variables declaration//GEN-END:variables
}
