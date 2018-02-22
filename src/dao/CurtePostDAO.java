package dao;

import connection.ConnectionFactory;
import dominio.CurtePost;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CurtePostDAO {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    
    public void create(CurtePost curtePost){
        
        try {
            stmt = con.prepareStatement("insert into curtePost(idPessoa, idPost) values(?, ?)");
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
    
    public List<CurtePost> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

	List<CurtePost> curtidas = new ArrayList<>();

	try {
            stmt = con.prepareStatement("select * from curtePost");
            rs = stmt.executeQuery();

            while (rs.next()) {
                CurtePost curteP = new CurtePost();
                curteP.setIdPessoa(rs.getInt("idPessoa"));
                curteP.setIdPost(rs.getInt("idPost"));

                curtidas.add(curteP);
                }

	} catch (SQLException ex) {
		Logger.getLogger(CurtePostDAO.class.getName(), null).log(Level.SEVERE, null, ex);
	} finally {
		ConnectionFactory.closeConnection(con, stmt, rs);
	}
	return curtidas;
    }
    
   
    public void delete(CurtePost curtePost){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("delete from curtePost where idPessoa = ? and idPost = ? ");
            stmt.setInt(1, curtePost.getIdPessoa());
            stmt.setInt(2, curtePost.getIdPost());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Deletar " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
