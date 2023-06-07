/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import DAO.DAO;
import Model.Usuario;
import static Views.TelaInicialLogin.emailTextField;
import static Views.TelaInicialLogin.senhaPasswordField;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gusta
 */
public class TelaAlterarSenha extends javax.swing.JFrame {

    /**
     * Creates new form TelaAlterarSenha
     */
    public TelaAlterarSenha() {
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

        TituloPerfil = new javax.swing.JLabel();
        SalvarButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        emailPerfil = new javax.swing.JLabel();
        emailPerfil1 = new javax.swing.JLabel();
        novaSenha = new javax.swing.JPasswordField();
        senhaAtual = new javax.swing.JPasswordField();
        FundoTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloPerfil.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TituloPerfil.setForeground(new java.awt.Color(51, 51, 51));
        TituloPerfil.setText("Alterar Senha");
        getContentPane().add(TituloPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        SalvarButton.setBackground(new java.awt.Color(0, 0, 0));
        SalvarButton.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        SalvarButton.setForeground(new java.awt.Color(255, 255, 255));
        SalvarButton.setText("SALVAR");
        SalvarButton.setBorder(null);
        SalvarButton.setContentAreaFilled(false);
        SalvarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalvarButton.setName("SalvarButton"); // NOI18N
        SalvarButton.setOpaque(true);
        SalvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SalvarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 170, 40));

        voltarButton.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        voltarButton.setForeground(new java.awt.Color(51, 51, 51));
        voltarButton.setText("VOLTAR");
        voltarButton.setContentAreaFilled(false);
        voltarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarButton.setName("voltarButton"); // NOI18N
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        emailPerfil.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        emailPerfil.setForeground(new java.awt.Color(153, 153, 153));
        emailPerfil.setText("NOVA SENHA");
        getContentPane().add(emailPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, -1, 20));

        emailPerfil1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        emailPerfil1.setForeground(new java.awt.Color(153, 153, 153));
        emailPerfil1.setText("SENHA ATUAL");
        getContentPane().add(emailPerfil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, 20));
        getContentPane().add(novaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 220, 30));
        getContentPane().add(senhaAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 220, 30));

        FundoTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tela alterar senha.jpg"))); // NOI18N
        getContentPane().add(FundoTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarButtonActionPerformed

        String email = emailTextField.getText();
        String senha = new String (novaSenha.getPassword());
        
        Usuario usuario = new Usuario(email, senha);
        DAO dao = new DAO();
        
        if(senhaAtual.getText().equals(senhaPasswordField.getText())){
            
            if(novaSenha.getText().isEmpty() == false) {
        try {
            dao.atualizarSenhaPerfil(usuario);
        } catch (Exception ex) {
            Logger.getLogger(TelaAlterarSenha.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível alterar a senha.", "Error", JOptionPane.ERROR_MESSAGE);
        }
            } else {
            JOptionPane.showMessageDialog(null, "Necessário o preenchimento do campo nova senha!!", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } else {
                        JOptionPane.showMessageDialog(null, "Senha atual incorreta, tente novamente!!", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_SalvarButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlterarSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FundoTela;
    private javax.swing.JButton SalvarButton;
    private javax.swing.JLabel TituloPerfil;
    private javax.swing.JLabel emailPerfil;
    private javax.swing.JLabel emailPerfil1;
    private javax.swing.JPasswordField novaSenha;
    public static javax.swing.JPasswordField senhaAtual;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
