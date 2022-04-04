/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo;

/**
 *
 * @author yunus
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    String name;
    int dimension;

    public Home() {
        initComponents();
        setLocationRelativeTo(null);
        lbl_warning1.setVisible(false);

    }

    public String getName() {
        return name;
    }

    public int getDimension() {
        return dimension;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_play = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbl_gif = new javax.swing.JLabel();
        lbl_warning1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_dimension = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        btn_play.setBackground(new java.awt.Color(255, 255, 153));
        btn_play.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_play.setForeground(new java.awt.Color(0, 0, 0));
        btn_play.setText("LET'S PLAY");
        btn_play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_playActionPerformed(evt);
            }
        });
        jPanel1.add(btn_play);
        btn_play.setBounds(400, 540, 270, 120);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("UserName:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(410, 380, 100, 40);

        lbl_gif.setBackground(new java.awt.Color(204, 255, 204));
        lbl_gif.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lbl_gif.setForeground(new java.awt.Color(102, 255, 102));
        lbl_gif.setIcon(new javax.swing.ImageIcon("C:\\Users\\yunus\\Downloads\\giphy (2).gif")); // NOI18N
        lbl_gif.setText("GIF");
        lbl_gif.setMaximumSize(new java.awt.Dimension(45, 35));
        lbl_gif.setMinimumSize(new java.awt.Dimension(45, 35));
        lbl_gif.setOpaque(true);
        lbl_gif.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(lbl_gif);
        lbl_gif.setBounds(160, 70, 700, 300);

        lbl_warning1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbl_warning1.setForeground(new java.awt.Color(255, 0, 0));
        lbl_warning1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_warning1.setText("Warnings");
        jPanel1.add(lbl_warning1);
        lbl_warning1.setBounds(310, 680, 420, 18);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("enter dimension:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(380, 440, 120, 40);
        jPanel1.add(txt_dimension);
        txt_dimension.setBounds(500, 450, 170, 30);
        jPanel1.add(txt_name);
        txt_name.setBounds(500, 390, 170, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("--");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 905, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1000, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\yunus\\Downloads\\background.jpg")); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(1000, 800));
        jLabel4.setMinimumSize(new java.awt.Dimension(1000, 800));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(1000, 800));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 1000, 800);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(Home.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked
    int xx, xy;
    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        setOpacity((float) 0.5);
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased
        // TODO add your handling code here:
        setOpacity((float) 1.0);
    }//GEN-LAST:event_jPanel2MouseReleased

    private void btn_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_playActionPerformed

        if (txt_name.getText().isEmpty() || txt_dimension.getText().isEmpty() || Integer.parseInt(txt_dimension.getText()) < 6) {
            lbl_warning1.setVisible(true);
            lbl_warning1.setText("Please fill blank before start");
        } else {
            name = txt_name.getText();
            dimension = Integer.parseInt(txt_dimension.getText());
            Game game = new Game(name, dimension);
            game.setVisible(true);
            game.pack();
            game.setLocationRelativeTo(null);
            game.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(false);
        }


    }//GEN-LAST:event_btn_playActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_play;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_gif;
    private javax.swing.JLabel lbl_warning1;
    private javax.swing.JTextField txt_dimension;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
