package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dominio.Post;
import connection.ConnectionFactory;


public class PostDAO {
    public void create(Post post){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("insert into post(datap, texto, idPessoa) values(?, ?, ?)");
            stmt.setString(1, post.getData());
            stmt.setString(2, post.getTexto());
            stmt.setInt(3, post.getIdPessoa());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
        
}
