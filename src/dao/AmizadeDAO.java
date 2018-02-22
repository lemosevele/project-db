package dao;

import connection.ConnectionFactory;
import dominio.Amizade;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AmizadeDAO {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    
    public void create(Amizade amizade){
        
        try {
            stmt = con.prepareStatement("insert into amizade(idPessoa1, idPessoa2, rotulo) values(?, ?, ?) ");
            stmt.setInt(1, amizade.getIdPessoa1());
            stmt.setInt(2, amizade.getIdPessoa2());
            stmt.setString(3, amizade.getRotulo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Amizade> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

	List<Amizade> amizadeList = new ArrayList<>();

	try {
            stmt = con.prepareStatement("select * from amizade");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Amizade amizade = new Amizade();
                amizade.setIdPessoa1(rs.getInt("idPessoa1"));
                amizade.setIdPessoa2(rs.getInt("idPessoa2"));
                amizade.setRotulo(rs.getString("rotulo"));

                amizadeList.add(amizade);
                }

	} catch (SQLException ex) {
		Logger.getLogger(AmizadeDAO.class.getName(), null).log(Level.SEVERE, null, ex);
	} finally {
		ConnectionFactory.closeConnection(con, stmt, rs);
	}
	return amizadeList;      
    }
    
    public void update(Amizade amizade, String oldPessoa1, String oldPessoa2){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;        
        
        try {
            stmt = con.prepareStatement("update amizade set idPessoa1 = ?, idPessoa2 = ?, rotulo = ? where idPessoa1 = ? and idPessoa2 = ?");
            
            stmt.setInt(1, amizade.getIdPessoa1());
            stmt.setInt(2, amizade.getIdPessoa2());
            stmt.setString(3, amizade.getRotulo());
            stmt.setInt(4, Integer.parseInt(oldPessoa1));
            stmt.setInt(5, Integer.parseInt(oldPessoa2));
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar chave primária" + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Amizade amizade){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("delete from amizade where idPessoa1 = ? and idPessoa2 = ?");
            stmt.setInt(1, amizade.getIdPessoa1());
            stmt.setInt(2, amizade.getIdPessoa2());
                
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "deletado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar chave primária " + ex );
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
}
