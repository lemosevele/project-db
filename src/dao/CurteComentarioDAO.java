package dao;

import connection.ConnectionFactory;
import dominio.CurteComentario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CurteComentarioDAO {
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
    public void create(CurteComentario curteComentario){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("insert into curteComentario(idPessoa, idComentario) values(?, ?");
            stmt.setInt(1, curteComentario.getIdPessoa());
            stmt.setInt(2, curteComentario.getIdComentario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}
