/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.ConnectionDatabase;
import Model.UsuarioRead;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author thaina.matos
 */
public class DAO2 {
    public List<UsuarioRead> read(){
        
        ArrayList<UsuarioRead> lista = new ArrayList<>();
        
        try {
            Connection conn = ConnectionDatabase.getConnection();
            PreparedStatement ps = null;
            ResultSet rs = null;
            

            ps = conn.prepareStatement(" SELECT * FROM Pessoa");
            rs = ps.executeQuery();
            
            while(rs.next()){
                UsuarioRead usuarioRead = new UsuarioRead();
                usuarioRead.setIdPessoa(rs.getInt("IdPessoa"));
                usuarioRead.setNome(rs.getString("Nome"));
                usuarioRead.setEmail(rs.getString("Email"));
                usuarioRead.setDataNascimento(rs.getString("dataNascimento"));
//                usuarioRead.setSexo(rs.getString("Sexo"));
                usuarioRead.setSenha(rs.getString("Senha"));


                
                lista.add(usuarioRead);
            }
        } 
        catch(Exception e){
            e.printStackTrace();
        }
        return lista;
        
    }
    
}

