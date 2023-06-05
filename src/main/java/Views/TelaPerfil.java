/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

/**
 *
 * @author Gusta
 */
public class TelaPerfil extends javax.swing.JFrame {

    /**
     * Creates new form TelaPerfil
     */
    public TelaPerfil() {
        super ("Health Care");
        initComponents();
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alterarButton = new javax.swing.JButton();
        voltarMenuButton = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        emailPerfil = new javax.swing.JLabel();
        idadeLabel = new javax.swing.JLabel();
        idadePerfil = new javax.swing.JLabel();
        sexoLabel = new javax.swing.JLabel();
        sexoPerfil = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        nomePerfil = new javax.swing.JLabel();
        TituloPerfil = new javax.swing.JLabel();
        imagemFundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Perfil HealthCare");
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        alterarButton.setBackground(new java.awt.Color(0, 0, 0));
        alterarButton.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        alterarButton.setForeground(new java.awt.Color(255, 255, 255));
        alterarButton.setText("ALTERAR DADOS");
        alterarButton.setBorder(null);
        alterarButton.setContentAreaFilled(false);
        alterarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alterarButton.setName("alterarButton"); // NOI18N
        alterarButton.setOpaque(true);
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(alterarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 170, 40));

        voltarMenuButton.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        voltarMenuButton.setText("VOLTAR");
        voltarMenuButton.setContentAreaFilled(false);
        voltarMenuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarMenuButton.setName("voltarMenuButton"); // NOI18N
        voltarMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarMenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, -1));

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(153, 153, 153));
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel.setText("''");
        getContentPane().add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 190, 390, -1));

        emailPerfil.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        emailPerfil.setForeground(new java.awt.Color(153, 153, 153));
        emailPerfil.setText("EMAIL");
        getContentPane().add(emailPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        idadeLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        idadeLabel.setForeground(new java.awt.Color(153, 153, 153));
        idadeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idadeLabel.setText("00");
        getContentPane().add(idadeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 120, -1));

        idadePerfil.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        idadePerfil.setForeground(new java.awt.Color(153, 153, 153));
        idadePerfil.setText("IDADE");
        getContentPane().add(idadePerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        sexoLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sexoLabel.setForeground(new java.awt.Color(153, 153, 153));
        sexoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sexoLabel.setText("''");
        sexoLabel.setToolTipText("");
        getContentPane().add(sexoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 60, -1));

        sexoPerfil.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        sexoPerfil.setForeground(new java.awt.Color(153, 153, 153));
        sexoPerfil.setText("SEXO");
        getContentPane().add(sexoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        nomeLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(153, 153, 153));
        nomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeLabel.setLabelFor(nomeLabel);
        nomeLabel.setText("''");
        nomeLabel.setAlignmentY(0.0F);
        nomeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(nomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 400, -1));

        nomePerfil.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        nomePerfil.setForeground(new java.awt.Color(153, 153, 153));
        nomePerfil.setText("NOME");
        getContentPane().add(nomePerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        TituloPerfil.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        TituloPerfil.setText("Perfil");
        getContentPane().add(TituloPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        imagemFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/TelaPerfil.jpg"))); // NOI18N
        getContentPane().add(imagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TelaPerfil.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void alterarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarButtonActionPerformed

    }//GEN-LAST:event_alterarButtonActionPerformed

    private void voltarMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarMenuButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloPerfil;
    private javax.swing.JButton alterarButton;
    public static javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailPerfil;
    public static javax.swing.JLabel idadeLabel;
    private javax.swing.JLabel idadePerfil;
    private javax.swing.JLabel imagemFundo;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel nomePerfil;
    public static javax.swing.JLabel sexoLabel;
    private javax.swing.JLabel sexoPerfil;
    private javax.swing.JButton voltarMenuButton;
    // End of variables declaration//GEN-END:variables
}
