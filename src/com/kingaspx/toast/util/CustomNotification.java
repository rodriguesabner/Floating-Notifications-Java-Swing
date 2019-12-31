package com.kingaspx.toast.util;

public class CustomNotification extends javax.swing.JDialog {

    public CustomNotification(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroudPanel = new keeptoo.KGradientPanel();
        logoWhatsapp_lbl = new javax.swing.JLabel();
        game_lbl = new javax.swing.JLabel();
        friend_lbl = new javax.swing.JLabel();
        title_icon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        kGradientPanel1 = new keeptoo.KGradientPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroudPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroudPanel.setkEndColor(new java.awt.Color(255, 255, 255));
        backgroudPanel.setkStartColor(new java.awt.Color(255, 255, 255));
        backgroudPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoWhatsapp_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoWhatsapp_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/icons8_steam_20px.png"))); // NOI18N
        backgroudPanel.add(logoWhatsapp_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 40));

        game_lbl.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        game_lbl.setForeground(new java.awt.Color(75, 75, 75));
        game_lbl.setText("Counter Strike - Global Offensive");
        backgroudPanel.add(game_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 410, 20));

        friend_lbl.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        friend_lbl.setText("Your Friend");
        backgroudPanel.add(friend_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 410, 20));

        title_icon.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        title_icon.setForeground(new java.awt.Color(69, 90, 100));
        title_icon.setText("Steam Notification");
        backgroudPanel.add(title_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 40));

        jSeparator1.setBackground(new java.awt.Color(234, 234, 234));
        jSeparator1.setForeground(new java.awt.Color(234, 234, 234));
        backgroudPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 430, 10));

        kGradientPanel1.setkEndColor(new java.awt.Color(64, 128, 159));
        kGradientPanel1.setkFillBackground(false);
        kGradientPanel1.setkStartColor(new java.awt.Color(69, 90, 100));
        kGradientPanel1.setOpaque(false);
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        backgroudPanel.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 100));

        getContentPane().add(backgroudPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 100));

        pack();
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomNotification dialog = new CustomNotification(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel friend_lbl;
    private javax.swing.JLabel game_lbl;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel logoWhatsapp_lbl;
    private javax.swing.JLabel title_icon;
    // End of variables declaration//GEN-END:variables
}
