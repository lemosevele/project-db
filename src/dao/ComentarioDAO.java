package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dominio.Comentario;
import connection.ConnectionFactory;

public class ComentarioDAO {
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
    public void create(Comentario comentario){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("insert into comentario(datac, texto, idPessoa, idPost) values(?, ?, ?, ?)");
            stmt.setString(1, comentario.getData());
            stmt.setString(2, comentario.getTexto());
            stmt.setInt(3, comentario.getIdPessoa());
            stmt.setInt(4, comentario.getIdPost());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
        

