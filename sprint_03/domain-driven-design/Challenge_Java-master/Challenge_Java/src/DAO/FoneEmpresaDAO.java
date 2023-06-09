package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.Challenge.model.Fone;

public class FoneEmpresaDAO {
private Connection conexao;
	
	public void inserir(Fone fone) {
		conexao = GerenciadorBD.obterConexao();
		PreparedStatement SQL = null;
		
		try {
			SQL = conexao.prepareStatement("INSERT INTO FoneEmpresa (seq_fone, fone, id_empresa) VALUES(?,?,?)");
			
			SQL.setInt(1, fone.getSequencia());
			SQL.setInt(2, fone.getTelefone());
			SQL.setString(3, fone.getEmpresa().getId());
		
			
			SQL.executeUpdate();
			SQL.close();
			conexao.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
