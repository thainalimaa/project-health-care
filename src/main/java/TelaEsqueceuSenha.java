
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author thaina.matos
 */
public class TelaEsqueceuSenha extends javax.swing.JFrame {

    /**
     * Creates new form TelaEsqueceuSenha
     */
    public TelaEsqueceuSenha() {
        super("Tela de esquecimento de senha");
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

        SenhaDescription = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        EmailText = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        TelaSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SenhaDescription.setFont(new java.awt.Font("Heiti TC", 0, 13)); // NOI18N
        SenhaDescription.setForeground(new java.awt.Color(102, 102, 102));
        SenhaDescription.setText("Insira seu email para redefinir sua conta. ");
        getContentPane().add(SenhaDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Esqueceu a senha?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        EmailText.setBackground(new java.awt.Color(204, 204, 204));
        EmailText.setFont(new java.awt.Font("Heiti TC", 0, 13)); // NOI18N
        EmailText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(EmailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 430, 50));

        resetButton.setBackground(new java.awt.Color(0, 0, 0));
        resetButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("Redefinir senha ");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 230, 50));

        jButton1.setText("VOLTAR");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusCycleRoot(true);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        TelaSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TelaEsqueceuSenha.jpg"))); // NOI18N
        getContentPane().add(TelaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        
        String email =  EmailText.getText();
        
        try {
            SendEmail sendMsg = new SendEmail();
            String senha =  sendMsg.getTemporaryPassword();
            Usuario usuario = new Usuario (email, senha);
            DAO dao = new DAO();
            if (!(dao.existeEmail(usuario))) {
                JOptionPane.showMessageDialog(null, "O email que você inseriu não possui cadastro.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{ 
                sendMsg.SendEmail(email);
                JOptionPane.showMessageDialog(null, "Nova senha enviada para seu email.", 
                        "Uhuuul", JOptionPane.INFORMATION_MESSAGE);
                dao.apagarSenha(usuario);
                dao.adicionarSenha(usuario);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_resetButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEsqueceuSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEsqueceuSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEsqueceuSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEsqueceuSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEsqueceuSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailText;
    private javax.swing.JLabel SenhaDescription;
    private javax.swing.JLabel TelaSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
}
