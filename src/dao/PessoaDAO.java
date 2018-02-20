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

import dominio.Pessoa;
import connection.ConnectionFactory;

public class PessoaDAO {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;    
    public void create(Pessoa pessoa){
        
        try {
            stmt = con.prepareStatement("insert into pessoa(nome, idade, foto) values(?, ?, ?)");
            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getIdade());
            stmt.setString(3, pessoa.getFoto());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Pessoa> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

	List<Pessoa> pessoas = new ArrayList<>();

	try {
            stmt = con.prepareStatement("select * from pessoa");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setIdade(rs.getInt("idade"));
		pessoa.setFoto(rs.getString("foto"));

                pessoas.add(pessoa);
                }

	} catch (SQLException ex) {
		Logger.getLogger(PessoaDAO.class.getName(), null).log(Level.SEVERE, null, ex);
	} finally {
		ConnectionFactory.closeConnection(con, stmt, rs);
	}
	return pessoas;
    }
          
}
    
