/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author NADA
 */
public class joint extends javax.swing.JFrame {

    /**
     * Creates new form joint
     */
    public joint() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playercode = new javax.swing.JButton();
        attempt = new javax.swing.JButton();
        year = new javax.swing.JButton();
        playnum = new javax.swing.JButton();
        firstdown = new javax.swing.JButton();
        gamecod = new javax.swing.JButton();
        yard = new javax.swing.JButton();
        touchdown = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        playercode.setText("Player Code");
        playercode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playercodeActionPerformed(evt);
            }
        });

        attempt.setText("Attempt");
        attempt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attemptActionPerformed(evt);
            }
        });

        year.setText("Year");
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        playnum.setText("Play Number");
        playnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playnumActionPerformed(evt);
            }
        });

        firstdown.setText("1st Down");
        firstdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstdownActionPerformed(evt);
            }
        });

        gamecod.setText("Game Code");
        gamecod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamecodActionPerformed(evt);
            }
        });

        yard.setText("Yards");
        yard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yardActionPerformed(evt);
            }
        });

        touchdown.setText("Touchdown");
        touchdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                touchdownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(attempt)
                    .addComponent(gamecod)
                    .addComponent(playnum)
                    .addComponent(touchdown))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(year)
                        .addComponent(firstdown)
                        .addComponent(yard))
                    .addComponent(playercode))
                .addGap(135, 135, 135))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {attempt, firstdown, gamecod, playercode, playnum, touchdown, yard, year});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gamecod, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(attempt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(yard, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playnum, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstdown, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playercode, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(touchdown, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {attempt, firstdown, gamecod, playercode, playnum, touchdown, yard, year});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playercodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playercodeActionPerformed
        // TODO add your handling code here:
        joint2 j=new joint2();
        j.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_playercodeActionPerformed

    private void attemptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attemptActionPerformed
        // TODO add your handling code here:
        joint2 j=new joint2();
        j.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_attemptActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
        joint2 j=new joint2();
        j.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_yearActionPerformed

    private void playnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playnumActionPerformed
        // TODO add your handling code here:
        joint2 j=new joint2();
        j.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_playnumActionPerformed

    private void firstdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstdownActionPerformed
        // TODO add your handling code here:
        joint2 j=new joint2();
        j.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_firstdownActionPerformed

    private void gamecodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamecodActionPerformed
        // TODO add your handling code here:
        joint2 j=new joint2();
        j.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_gamecodActionPerformed

    private void yardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yardActionPerformed
        // TODO add your handling code here:
       joint2 j=new joint2();
        j.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_yardActionPerformed

    private void touchdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_touchdownActionPerformed
        // TODO add your handling code here:
        joint2 j=new joint2();
        j.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_touchdownActionPerformed

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
            java.util.logging.Logger.getLogger(joint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(joint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(joint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(joint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new joint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attempt;
    private javax.swing.JButton firstdown;
    private javax.swing.JButton gamecod;
    private javax.swing.JButton playercode;
    private javax.swing.JButton playnum;
    private javax.swing.JButton touchdown;
    private javax.swing.JButton yard;
    private javax.swing.JButton year;
    // End of variables declaration//GEN-END:variables
}
