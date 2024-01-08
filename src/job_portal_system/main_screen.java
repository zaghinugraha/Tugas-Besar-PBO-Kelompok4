package job_portal_system;
import javax.swing.ImageIcon;

public class main_screen extends javax.swing.JFrame {
    
    ImageIcon image = new ImageIcon("pic1.PNG");

    public main_screen() { 
        initComponents();
        imagelabel.setIcon(image);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        imagelabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        regjsbutton = new javax.swing.JMenuItem();
        loginjsbutton = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        regcbutton = new javax.swing.JMenuItem();
        logincbutton = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        loginabutton = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to the Job Portal System");

        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jMenu1.setText("Job Seeker");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(10, 10, 5, 10));

        regjsbutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        regjsbutton.setText("Register Job Seeker");
        regjsbutton.setMargin(new java.awt.Insets(10, 10, 10, 10));
        regjsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regjsbuttonActionPerformed(evt);
            }
        });
        jMenu1.add(regjsbutton);

        loginjsbutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginjsbutton.setText("Login Job Seeker");
        loginjsbutton.setMargin(new java.awt.Insets(5, 10, 5, 10));
        loginjsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginjsbuttonActionPerformed(evt);
            }
        });
        jMenu1.add(loginjsbutton);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem2.setText("Update Resume");
        jMenuItem2.setMargin(new java.awt.Insets(5, 10, 10, 10));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Company");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(10, 10, 10, 10));

        regcbutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        regcbutton.setText("Register Company");
        regcbutton.setMargin(new java.awt.Insets(10, 10, 5, 10));
        regcbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regcbuttonActionPerformed(evt);
            }
        });
        jMenu2.add(regcbutton);

        logincbutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logincbutton.setText("Login Company");
        logincbutton.setMargin(new java.awt.Insets(5, 10, 10, 10));
        logincbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logincbuttonActionPerformed(evt);
            }
        });
        jMenu2.add(logincbutton);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Admin");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu3.setMargin(new java.awt.Insets(10, 10, 10, 10));

        loginabutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginabutton.setText("Login Admin");
        loginabutton.setMargin(new java.awt.Insets(10, 10, 10, 10));
        loginabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginabuttonActionPerformed(evt);
            }
        });
        jMenu3.add(loginabutton);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(imagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(imagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regjsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regjsbuttonActionPerformed
        // TODO add your handling code here:
        regjobseeker c = new regjobseeker();
        c.setVisible(true);
        c.setLocationRelativeTo(null);
        c.setDefaultCloseOperation(DISPOSE_ON_CLOSE  );
    }//GEN-LAST:event_regjsbuttonActionPerformed

    private void loginjsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginjsbuttonActionPerformed
        // TODO add your handling code here:
        loginjobseeker c = new loginjobseeker();
        c.setVisible(true);
        c.setLocationRelativeTo(null);
        c.setDefaultCloseOperation(DISPOSE_ON_CLOSE  );
    }//GEN-LAST:event_loginjsbuttonActionPerformed

    private void regcbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regcbuttonActionPerformed
        // TODO add your handling code here:
        regcompany c = new regcompany();
        c.setVisible(true);
        c.setLocationRelativeTo(null);
        c.setDefaultCloseOperation(DISPOSE_ON_CLOSE  );
    }//GEN-LAST:event_regcbuttonActionPerformed

    private void logincbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logincbuttonActionPerformed
        // TODO add your handling code here:
        logincompany l = new logincompany();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        l.setDefaultCloseOperation(DISPOSE_ON_CLOSE  );
    }//GEN-LAST:event_logincbuttonActionPerformed

    private void loginabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginabuttonActionPerformed
        // TODO add your handling code here:
        loginadmin l = new loginadmin();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        l.setDefaultCloseOperation(DISPOSE_ON_CLOSE  );
    }//GEN-LAST:event_loginabuttonActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        updateresumejobseeker l =  new updateresumejobseeker();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        l.setDefaultCloseOperation(DISPOSE_ON_CLOSE  );
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(main_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagelabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem loginabutton;
    private javax.swing.JMenuItem logincbutton;
    private javax.swing.JMenuItem loginjsbutton;
    private javax.swing.JMenuItem regcbutton;
    private javax.swing.JMenuItem regjsbutton;
    // End of variables declaration//GEN-END:variables
}
