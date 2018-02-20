package dao;

import connection.ConnectionFactory;
import dominio.Amizade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
}
