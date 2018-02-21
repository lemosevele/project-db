package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    
    
    public List<Comentario> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

	List<Comentario> comentarios = new ArrayList<>();

	try {
            stmt = con.prepareStatement("select * from comentario");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Comentario comentario = new Comentario();
                comentario.setId(rs.getInt("id"));
                comentario.setTexto(rs.getString("texto"));
		comentario.setData(rs.getString("datac"));
		comentario.setIdPost(rs.getInt("idPost"));
		comentario.setIdPessoa(rs.getInt("idPessoa"));

                comentarios.add(comentario);
                }

	} catch (SQLException ex) {
		Logger.getLogger(ComentarioDAO.class.getName(), null).log(Level.SEVERE, null, ex);
	} finally {
		ConnectionFactory.closeConnection(con, stmt, rs);
	}
	return comentarios;
    }
    
    public void update(Comentario comentario){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("update comentario set datac = ?, texto = ?, idPessoa = ?, idPost =? where id = ?");
            stmt.setString(1, comentario.getData());
            stmt.setString(2, comentario.getTexto());
            stmt.setInt(3, comentario.getIdPessoa());
            stmt.setInt(4, comentario.getIdPost());
	    stmt.setInt(5, comentario.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}
        

