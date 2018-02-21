package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public List<Post> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

	List<Post> posts = new ArrayList<>();

	try {
            stmt = con.prepareStatement("select * from post");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Post post = new Post();
		post.setId(rs.getInt("id"));
		post.setData(rs.getString("datap"));
		post.setTexto(rs.getString("texto"));		
                post.setIdPessoa(rs.getInt("idPessoa"));

                posts.add(post);
                }

	} catch (SQLException ex) {
		Logger.getLogger(PostDAO.class.getName(), null).log(Level.SEVERE, null, ex);
	} finally {
		ConnectionFactory.closeConnection(con, stmt, rs);
	}
	return posts;
    }
    
    public void update(Post post){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("update post set datap = ?, texto = ?, idPessoa = ? where id = ?");
            stmt.setString(1, post.getData());
            stmt.setString(2, post.getTexto());
            stmt.setInt(3, post.getIdPessoa());
            stmt.setInt(4, post.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void delete(Post post){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("delete from post where id = ?");
            stmt.setInt(1, post.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Deletar: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    } 
    
    
    
}
