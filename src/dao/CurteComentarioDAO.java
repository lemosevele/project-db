package dao;

import connection.ConnectionFactory;
import dominio.CurteComentario;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CurteComentarioDAO {
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
    public void create(CurteComentario curteComentario){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("insert into curtecomentario(idPessoa, idComentario) values(?, ?)");
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
    
    public List<CurteComentario> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

	List<CurteComentario> curtidas = new ArrayList<>();

	try {
            stmt = con.prepareStatement("select * from curtecomentario");
            rs = stmt.executeQuery();

            while (rs.next()) {
                CurteComentario curteC = new CurteComentario();
                curteC.setIdPessoa(rs.getInt("idPessoa"));
                curteC.setIdComentario(rs.getInt("idComentario"));

                curtidas.add(curteC);
                }

	} catch (SQLException ex) {
		Logger.getLogger(CurteComentarioDAO.class.getName(), null).log(Level.SEVERE, null, ex);
	} finally {
		ConnectionFactory.closeConnection(con, stmt, rs);
	}
	return curtidas;
    }
    
    public void update(CurteComentario curteComentario, String idPessoa, String idComentario){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("update curteComentario idPessoa = ?, idComentario = ? where idPessoa = ? and idComentario = ?");
            stmt.setInt(1, curteComentario.getIdPessoa());
            stmt.setInt(2, curteComentario.getIdComentario());
            stmt.setInt(3,Integer.parseInt(idPessoa));
            stmt.setInt(4, Integer.parseInt(idComentario));
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar chave primária." + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(CurteComentario curteComentario){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("delete from curteComentario where idPessoa = ? and idComentario = ?");
            stmt.setInt(1, curteComentario.getIdPessoa());
            stmt.setInt(2, curteComentario.getIdComentario());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Deletato com sucesso.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }

    
}
