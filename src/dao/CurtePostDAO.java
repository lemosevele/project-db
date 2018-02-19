package dao;

import connection.ConnectionFactory;
import dominio.CurtePost;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CurtePostDAO {
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
    public void create(CurtePost curtePost){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("insert into curtePost(idPessoa, idPost) values(?, ?");
            stmt.setInt(1, curtePost.getIdPessoa());
            stmt.setInt(2, curtePost.getIdPost());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
