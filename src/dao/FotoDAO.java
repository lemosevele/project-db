package dao;

import connection.ConnectionFactory;
import dominio.Foto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FotoDAO {
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
    public void create(Foto foto){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("insert into foto(imagem, idPost) values(?, ?");
            stmt.setString(1, foto.getImagem());
            stmt.setInt(2, foto.getIdPost());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
