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
public class pass extends javax.swing.JFrame {

    /**
     * Creates new form pass
     */
    public pass() {
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

        receiver = new javax.swing.JButton();
        attempt = new javax.swing.JButton();
        firstdown = new javax.swing.JButton();
        completion = new javax.swing.JButton();
        year = new javax.swing.JButton();
        touchdown = new javax.swing.JButton();
        gamecode = new javax.swing.JButton();
        yards = new javax.swing.JButton();
        interception = new javax.swing.JButton();
        playnum = new javax.swing.JButton();
        teamcode = new javax.swing.JButton();
        passerplay = new javax.swing.JButton();
        excute = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        receiver.setText("Receiver");
        receiver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiverActionPerformed(evt);
            }
        });

        attempt.setText("Attempt");
        attempt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attemptActionPerformed(evt);
            }
        });

        firstdown.setText("1st Down");
        firstdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstdownActionPerformed(evt);
            }
        });

        completion.setText("Completion");
        completion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completionActionPerformed(evt);
            }
        });

        year.setText("Year");
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        touchdown.setText("Touchdown");
        touchdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                touchdownActionPerformed(evt);
            }
        });

        gamecode.setText("Game Code");
        gamecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamecodeActionPerformed(evt);
            }
        });

        yards.setText("Yards");
        yards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yardsActionPerformed(evt);
            }
        });

        interception.setText("Interception");
        interception.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interceptionActionPerformed(evt);
            }
        });

        playnum.setText("Play Number");
        playnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playnumActionPerformed(evt);
            }
        });

        teamcode.setText("Team Code");
        teamcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamcodeActionPerformed(evt);
            }
        });

        passerplay.setText("Passer Play");
        passerplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passerplayActionPerformed(evt);
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
                    .addComponent(gamecode, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receiver, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yards, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(playnum, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(attempt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(interception, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(completion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(touchdown, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstdown, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teamcode, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passerplay, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(excute)
                .addGap(80, 80, 80))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {attempt, completion, firstdown, gamecode, interception, passerplay, playnum, receiver, teamcode, touchdown, yards, year});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gamecode)
                    .addComponent(playnum)
                    .addComponent(passerplay)
                    .addComponent(teamcode))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receiver)
                    .addComponent(completion)
                    .addComponent(touchdown)
                    .addComponent(attempt))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstdown)
                    .addComponent(year)
                    .addComponent(yards)
                    .addComponent(interception))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(excute)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {attempt, completion, firstdown, gamecode, interception, passerplay, playnum, receiver, teamcode, touchdown, yards, year});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void receiverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receiverActionPerformed

    private void attemptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attemptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attemptActionPerformed

    private void firstdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstdownActionPerformed

    private void completionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_completionActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void touchdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_touchdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_touchdownActionPerformed

    private void gamecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamecodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gamecodeActionPerformed

    private void yardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yardsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yardsActionPerformed

    private void interceptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interceptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_interceptionActionPerformed

    private void playnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playnumActionPerformed

    private void teamcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamcodeActionPerformed

    private void passerplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passerplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passerplayActionPerformed

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
            java.util.logging.Logger.getLogger(pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attempt;
    private javax.swing.JButton completion;
    private javax.swing.JButton excute;
    private javax.swing.JButton firstdown;
    private javax.swing.JButton gamecode;
    private javax.swing.JButton interception;
    private javax.swing.JButton passerplay;
    private javax.swing.JButton playnum;
    private javax.swing.JButton receiver;
    private javax.swing.JButton teamcode;
    private javax.swing.JButton touchdown;
    private javax.swing.JButton yards;
    private javax.swing.JButton year;
    // End of variables declaration//GEN-END:variables
}
