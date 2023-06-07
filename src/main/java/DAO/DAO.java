package DAO;


import Model.RegistroCorporal;
import Model.Usuario;
import Connection.ConnectionDatabase;
import Model.UsuarioRead;
import Views.TelaDePerfil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class DAO {

    public boolean existeUsuario (Usuario usuario) throws Exception {
        String sql = "select * from Pessoa where email = ? and senha = ?";
        try (Connection conn = ConnectionDatabase.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, usuario.getEmail());
            ps.setString(2, usuario.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();         
                }
        }
    }
        
    public boolean existeEmail (Usuario usuario) throws Exception {
        String sql = "select * from Pessoa where email = ?";
        try (Connection conn = ConnectionDatabase.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, usuario.getEmail());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
        
    }
    public static void atualizarSenha(Usuario usuario) throws Exception {
        String sql = "UPDATE Pessoa SET senha = ? WHERE email = ?; ";

        try (Connection conn = ConnectionDatabase.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, usuario.getSenha());
            ps.setString(2, usuario.getEmail());

            
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected > 0) {
                System.out.println("Atualizado a senha usuario");
            } else{
                System.out.println("Erro durante a atualização da nova senha.");
            }
        } 
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void AdicionarRegistro(RegistroCorporal registro){
        String sql = "INSERT INTO RegistroCorporal(peso, altura) values (?, ?); ";

        try (Connection conn = ConnectionDatabase.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setDouble(1, registro.getPeso());
            ps.setDouble(2, registro.getAltura());

            
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Dados registrados com sucesso.", 
                        "Informação:", JOptionPane.INFORMATION_MESSAGE);            
            } else{
                JOptionPane.showMessageDialog(null, "Erro no cadastramento dos registros corporais.", 
                        "Opss, algo deu errado:", JOptionPane.ERROR_MESSAGE);  
            }
        } 
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public List<RegistroCorporal> read(){
        
        ArrayList<RegistroCorporal> lista = new ArrayList<>();
        
        try {
            Connection conn = ConnectionDatabase.getConnection();
            PreparedStatement ps = null;
            ResultSet rs = null;
            

            ps = conn.prepareStatement(" SELECT * FROM RegistroCorporal");
            rs = ps.executeQuery();
            
            while(rs.next()){
                RegistroCorporal registro = new RegistroCorporal();
                registro.setIdPessoa(rs.getInt("IdPessoa"));
                registro.setIdRegistro(rs.getInt("IdRegistro"));
                registro.setPeso(rs.getDouble("Peso"));
                registro.setAltura(rs.getDouble("Altura"));
                registro.setData(rs.getTimestamp("Data"));
                
                
                lista.add(registro);
            }
        } 
        catch(Exception e){
            e.printStackTrace();
        }
        return lista;
        
    }
    
    public void AtualizarRegistro(RegistroCorporal registro){
        String sql = "UPDATE RegistroCorporal SET peso = ?, altura = ? WHERE idRegistro = ?; ";
        try (Connection conn = ConnectionDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setDouble(1, registro.getPeso());
            ps.setDouble(2, registro.getAltura());
            ps.setInt(3, registro.getIdRegistro());

            
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso.", 
                        "Informação:", JOptionPane.INFORMATION_MESSAGE);            
            } else{
                JOptionPane.showMessageDialog(null, "Erro ao atualizar os registros corporais.", 
                        "Opss, algo deu errado:", JOptionPane.ERROR_MESSAGE);  
            }
        } 
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void removerRegistro(RegistroCorporal registro){
        String sql = "DELETE FROM RegistroCorporal WHERE idRegistro = ?; ";
        try (Connection conn = ConnectionDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, registro.getIdRegistro());
            
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Dado excluido com sucesso.", 
                        "Informação:", JOptionPane.INFORMATION_MESSAGE);            
            } else{
                JOptionPane.showMessageDialog(null, "Erro tentar excluir um registro corporal.", 
                        "Opss, algo deu errado:", JOptionPane.ERROR_MESSAGE);  
            }
        } 
        catch(Exception e){
            e.printStackTrace();
        }
    } 
    
    public void cadastrar(Usuario usuario) throws Exception {
        String sql = "INSERT INTO Pessoa (nome, email, senha, dataNascimento, sexo) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConnectionDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setString(1, usuario.getNome());
                ps.setString(2, usuario.getEmail());
                ps.setString(3, usuario.getSenha());
                ps.setString(4, usuario.getDataNascimento());
                ps.setString(5, usuario.getSexo());

            
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Dados cadastrais registrado com sucesso.", 
                        "Informação:", JOptionPane.INFORMATION_MESSAGE);            
            } else{
                JOptionPane.showMessageDialog(null, "Erro no cadastramento do usuario", 
                        "Opss, algo deu errado:", JOptionPane.ERROR_MESSAGE);  
            }
        } 
        catch(Exception e){
            e.printStackTrace();
        }       
    }
    
      public void logar(Usuario usuario) throws Exception{
        
       String sql = "select * from Pessoa where email = ? and senha = ?";
       try (Connection conn = ConnectionDatabase.getConnection();
       PreparedStatement ps = conn.prepareStatement(sql)){
               
       ps.setString(1, usuario.getEmail());
       ps.setString(2, usuario.getSenha());
       
       ResultSet rs = ps.executeQuery();
       
       if(rs.next()){
           
           String perfil = " ";
           
           if(perfil.equals("admin")){
           //TelaPerfil telaPerfil = new TelaPerfil();
           //telaPerfil.setVisible(true);
           } else {
            TelaDePerfil telaPerfil = new TelaDePerfil();
             telaPerfil.setVisible(true);
             TelaDePerfil.nomeLabel.setText(rs.getString(2));
             TelaDePerfil.emailLabel.setText(rs.getString(3));
             TelaDePerfil.sexoLabel.setText(rs.getString(6));
           }
           
       } else {
         JOptionPane.showMessageDialog(null, "Usuario e/ou senha inválido(s)!");

       }
       }
      }
      
      public static void atualizarSenhaPerfil(Usuario usuario) throws Exception {
        String sql = "UPDATE Pessoa SET senha = ? WHERE email = ?; ";

        try (Connection conn = ConnectionDatabase.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, usuario.getSenha());
            ps.setString(2, usuario.getEmail());

            
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected > 0) {
                System.out.println("Atualizado a senha usuario");
            } else{
                System.out.println("Erro durante a atualização da nova senha.");
            }
        } 
        catch(Exception e){
            e.printStackTrace();
        }
    }
      
     public void removerPessoa(UsuarioRead usuario){
        String sql = "DELETE FROM Pessoa WHERE idPessoa = ?; ";
        try (Connection conn = ConnectionDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, usuario.getIdPessoa());
            
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Dado excluido com sucesso.", 
                        "Informação:", JOptionPane.INFORMATION_MESSAGE);            
            } else{
                JOptionPane.showMessageDialog(null, "Erro tentar excluir um registro corporal.", 
                        "Opss, algo deu errado:", JOptionPane.ERROR_MESSAGE);  
            }
        } 
        catch(Exception e){
            e.printStackTrace();
        }
    } 
}
