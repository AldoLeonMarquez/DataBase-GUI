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
public class play extends javax.swing.JFrame {

    /**
     * Creates new form play
     */
    public play() {
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

        clock = new javax.swing.JButton();
        drivenum = new javax.swing.JButton();
        defensepoints = new javax.swing.JButton();
        offense = new javax.swing.JButton();
        defense = new javax.swing.JButton();
        offensepoin = new javax.swing.JButton();
        playtype = new javax.swing.JButton();
        down = new javax.swing.JButton();
        distance = new javax.swing.JButton();
        gamecod = new javax.swing.JButton();
        spot = new javax.swing.JButton();
        playnum = new javax.swing.JButton();
        year = new javax.swing.JButton();
        periodnum = new javax.swing.JButton();
        driveplay = new javax.swing.JButton();
        excute = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clock.setText("Clock");
        clock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockActionPerformed(evt);
            }
        });

        drivenum.setText("Drive Number");
        drivenum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drivenumActionPerformed(evt);
            }
        });

        defensepoints.setText("Defense Points");
        defensepoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defensepointsActionPerformed(evt);
            }
        });

        offense.setText("Offense Team Code");
        offense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offenseActionPerformed(evt);
            }
        });

        defense.setText("Defense Team Code");
        defense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defenseActionPerformed(evt);
            }
        });

        offensepoin.setText("Offense Points");
        offensepoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offensepoinActionPerformed(evt);
            }
        });

        playtype.setText("Play Type");
        playtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playtypeActionPerformed(evt);
            }
        });

        down.setText("Down");
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downActionPerformed(evt);
            }
        });

        distance.setText("Distance");
        distance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distanceActionPerformed(evt);
            }
        });

        gamecod.setText("Game Code");
        gamecod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamecodActionPerformed(evt);
            }
        });

        spot.setText("Spot");
        spot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spotActionPerformed(evt);
            }
        });

        playnum.setText("Play Number");
        playnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playnumActionPerformed(evt);
            }
        });

        year.setText("Year");
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        periodnum.setText("Period Number");
        periodnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodnumActionPerformed(evt);
            }
        });

        driveplay.setText("Drive Play");
        driveplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driveplayActionPerformed(evt);
            }
        });

        excute.setText("Execute");
        excute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excuteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(offense)
                            .addComponent(gamecod)
                            .addComponent(down))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(defense)
                            .addComponent(distance)
                            .addComponent(playnum)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(drivenum)
                        .addGap(84, 84, 84)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spot)
                            .addComponent(offensepoin)
                            .addComponent(periodnum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playtype, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(defensepoints, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(driveplay)
                        .addGap(61, 61, 61)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(excute)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clock, defense, defensepoints, distance, down, drivenum, driveplay, gamecod, offense, offensepoin, periodnum, playnum, playtype, spot, year});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gamecod)
                    .addComponent(playnum)
                    .addComponent(periodnum)
                    .addComponent(clock))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(offense)
                    .addComponent(defense)
                    .addComponent(offensepoin)
                    .addComponent(defensepoints))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(down)
                    .addComponent(distance)
                    .addComponent(spot)
                    .addComponent(playtype))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(driveplay)
                    .addComponent(drivenum)
                    .addComponent(year))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(excute)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {clock, defense, defensepoints, distance, down, drivenum, driveplay, gamecod, offense, offensepoin, periodnum, playnum, playtype, spot, year});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clockActionPerformed

    private void drivenumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drivenumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drivenumActionPerformed

    private void defensepointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defensepointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_defensepointsActionPerformed

    private void offenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_offenseActionPerformed

    private void defenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_defenseActionPerformed

    private void offensepoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offensepoinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_offensepoinActionPerformed

    private void playtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playtypeActionPerformed

    private void downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downActionPerformed

    private void distanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_distanceActionPerformed

    private void gamecodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamecodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gamecodActionPerformed

    private void spotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spotActionPerformed

    private void playnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playnumActionPerformed

    private void periodnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periodnumActionPerformed

    private void driveplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driveplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driveplayActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void excuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excuteActionPerformed
        // TODO add your handling code here:
        firstframe s=new firstframe();
        s.setVisible(true);
    }//GEN-LAST:event_excuteActionPerformed

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
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new play().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clock;
    private javax.swing.JButton defense;
    private javax.swing.JButton defensepoints;
    private javax.swing.JButton distance;
    private javax.swing.JButton down;
    private javax.swing.JButton drivenum;
    private javax.swing.JButton driveplay;
    private javax.swing.JButton excute;
    private javax.swing.JButton gamecod;
    private javax.swing.JButton offense;
    private javax.swing.JButton offensepoin;
    private javax.swing.JButton periodnum;
    private javax.swing.JButton playnum;
    private javax.swing.JButton playtype;
    private javax.swing.JButton spot;
    private javax.swing.JButton year;
    // End of variables declaration//GEN-END:variables
}
