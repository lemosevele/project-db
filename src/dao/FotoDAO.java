package dao;

import connection.ConnectionFactory;
import dominio.CurteComentario;
import dominio.Foto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FotoDAO {
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
    public void create(Foto foto){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("insert into foto(imagem, idPost) values(?, ?)");
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
    public List<Foto> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

	List<Foto> fotos = new ArrayList<>();

	try {
            stmt = con.prepareStatement("select * from foto");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Foto foto = new Foto();
                foto.setId(rs.getInt("id"));
                foto.setIdPost(rs.getInt("idPost"));
                foto.setImagem(rs.getString("imagem"));

                fotos.add(foto);
                }

	} catch (SQLException ex) {
		Logger.getLogger(FotoDAO.class.getName(), null).log(Level.SEVERE, null, ex);
	} finally {
		ConnectionFactory.closeConnection(con, stmt, rs);
	}
	return fotos;
    }
    
    public void update(Foto foto, String imagem, String idPost){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("update foto id = ?, imagem = ? and idPost = ? where id = ?, imagem = ? and idPost = ?");
            stmt.setInt(1, foto.getId());
            stmt.setString(2, foto.getImagem());
            stmt.setInt(3, foto.getIdPost());
            stmt.setInt(4, foto.getId());
            stmt.setString(5, imagem);
            stmt.setInt(6, Integer.parseInt(idPost));
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar chave primária." + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }    
        
    public void delete(Foto foto){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("delete from foto where id = ?, imagem = ? and idPost = ?");
            stmt.setInt(1, foto.getId());
            stmt.setString(2, foto.getImagem());
            stmt.setInt(3, foto.getIdPost());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar chave primária." + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }


    }
  
        
    
}
