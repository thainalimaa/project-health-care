package Views;

import Views.TelaEsqueceuSenha;
import Utils.ValidEmailAddress;
import DAO.DAO;
import Model.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thaina.matos
 */
public class TelaInicialLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaInicialLogin() {
        super("Tela de Login");
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

        LoginButton = new javax.swing.JButton();
        LoginTitulo = new javax.swing.JLabel();
        LoginDescription = new javax.swing.JLabel();
        PasswordName = new javax.swing.JLabel();
        emailName = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        emailTextField = new javax.swing.JTextField();
        ExitButton = new javax.swing.JButton();
        senhaPasswordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        ImageFundo = new javax.swing.JLabel();
        LoginDescription1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginButton.setBackground(new java.awt.Color(0, 0, 0));
        LoginButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Entrar");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 130, 40));

        LoginTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        LoginTitulo.setForeground(new java.awt.Color(51, 51, 51));
        LoginTitulo.setText("Login");
        getContentPane().add(LoginTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        LoginDescription.setFont(new java.awt.Font("Heiti TC", 0, 13)); // NOI18N
        LoginDescription.setForeground(new java.awt.Color(153, 153, 153));
        LoginDescription.setText("Informe seus dados para continuar");
        getContentPane().add(LoginDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        PasswordName.setFont(new java.awt.Font("Heiti TC", 0, 13)); // NOI18N
        PasswordName.setForeground(new java.awt.Color(102, 102, 102));
        PasswordName.setText("SENHA");
        getContentPane().add(PasswordName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        emailName.setFont(new java.awt.Font("Heiti TC", 0, 13)); // NOI18N
        emailName.setForeground(new java.awt.Color(102, 102, 102));
        emailName.setText("EMAIL");
        getContentPane().add(emailName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 245, 237));
        jButton2.setFont(new java.awt.Font("Heiti TC", 0, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Esqueceu sua senha?");
        jButton2.setToolTipText("");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusCycleRoot(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        emailTextField.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 290, 40));

        ExitButton.setBackground(new java.awt.Color(153, 0, 51));
        ExitButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Fechar");
        ExitButton.setAutoscrolls(true);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 130, 40));

        senhaPasswordField.setBackground(new java.awt.Color(204, 204, 204));
        senhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(senhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 290, 40));

        jButton1.setBackground(new java.awt.Color(255, 245, 237));
        jButton1.setFont(new java.awt.Font("Heiti TC", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Cadastrar-se");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusCycleRoot(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        ImageFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TelaLogin.jpg"))); // NOI18N
        getContentPane().add(ImageFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        LoginDescription1.setFont(new java.awt.Font("Heiti TC", 0, 13)); // NOI18N
        LoginDescription1.setForeground(new java.awt.Color(153, 153, 153));
        LoginDescription1.setText("Informe seus dados para continuar");
        getContentPane().add(LoginDescription1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        //pega o email do usuário
        String email =  emailTextField.getText();
        
        //pega a senha do usuário como char[] e converte para String
        String senha = new String (senhaPasswordField.getPassword());
        
        //verifica se o login é válido
        ValidEmailAddress ValidEmail = new ValidEmailAddress();
        
        TelaMenu telaMenu = new TelaMenu(); 
        TelaMenuAdmin telaMenuAdmin = new TelaMenuAdmin(); 


        if (!((ValidEmail.isValidEmailAddress(email)))) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um email válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                
                Usuario usuario = new Usuario (email, senha);
                DAO dao = new DAO();
                if (!(dao.existeEmail(usuario))) {
                    JOptionPane.showMessageDialog(null, "O email que você inseriu não possui cadastro.", "Ops, sinto muito.",
                    JOptionPane.ERROR_MESSAGE);
                }
                else {
                    if (!(dao.existeUsuario(usuario))) {
                        JOptionPane.showMessageDialog(null, "A senha inserida está incorreta.", "Ops, tente novamente.",
                        JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        
                        if (email.equals("admin@gmail.com")){
                            telaMenuAdmin.setVisible(true);
                            this.dispose();
                        }
                        else{
                            telaMenu.setVisible(true);
                            this.dispose();
                        }
                    }
                }
            }
                
            catch (Exception e) {
                JOptionPane.showMessageDialog (null, "ups, tente mais tarde");
                e.printStackTrace();
            }
        } 
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaCadastro telaCadastro = new TelaCadastro(); 
        telaCadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaEsqueceuSenha telaSenha = new TelaEsqueceuSenha(); 
        telaSenha.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
           
        this.dispose();
        
        /*String email = TelaInicialLogin.emailTextField.getText();
        String senha =  new String (TelaInicialLogin.senhaPasswordField.getPassword());
        
        Usuario usuario = new Usuario(email, senha);
        DAO dao = new DAO();

        try {
            dao.logar(usuario);
        } catch (Exception ex) {
            Logger.getLogger(TelaInicialLogin.class.getName()).log(Level.SEVERE, null, ex);
     */  

    }//GEN-LAST:event_ExitButtonActionPerformed

    private void senhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaPasswordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicialLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel ImageFundo;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginDescription;
    private javax.swing.JLabel LoginDescription1;
    private javax.swing.JLabel LoginTitulo;
    private javax.swing.JLabel PasswordName;
    private javax.swing.JLabel emailName;
    public static javax.swing.JTextField emailTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JPasswordField senhaPasswordField;
    // End of variables declaration//GEN-END:variables
}
