package br.com.orcamento.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.orcamento.jdbc.ConnectionFactory;
import br.com.orcamento.modelo.Funcionario;

public class FuncionarioDAO {
	private Connection connection;

	// O construtor obtém uma conexão
	public FuncionarioDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}


	public void remove(Funcionario funcionario) {
		try {
			PreparedStatement stmt = connection
					.prepareStatement("delete from funcionarios where id=?");
			stmt.setInt(1, funcionario.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Funcionario getFuncionarioById(int Id) {
		Funcionario funcionario = new Funcionario();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from funcionarios where id=?");
			preparedStatement.setInt(1, Id);
			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				funcionario.setId(rs.getInt("id"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setEndereco(rs.getString("endereco"));
				funcionario.setEmail(rs.getString("email"));
				funcionario.setDepartamentos_id(rs.getInt("departamentos_id"));
				funcionario.setSenha(rs.getString("senha"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return funcionario;
	}

	public Funcionario getFuncionarioByEmailSenha(String email, String senha) {
		Funcionario funcionario = new Funcionario();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from funcionarios where email=? and senha=?");
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, senha);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				funcionario.setId(rs.getInt("id"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setEndereco(rs.getString("endereco"));
				funcionario.setEmail(rs.getString("email"));
				funcionario.setDepartamentos_id(rs.getInt("departamentos_id"));
				funcionario.setSenha(rs.getString("senha"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return funcionario;
	}

	// método para alterar um funcionário
	// altera todos os campos para o valor do Bean que o método recebe
	public void altera(Funcionario funcionario) {
		String sql = "update funcionarios set nome=?, email=?, endereco=?,"
				+ " departamentos_id=?, senha=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getEmail());
			stmt.setString(3, funcionario.getEndereco());
			stmt.setInt(4, funcionario.getDepartamentos_id());
			stmt.setString(5, funcionario.getSenha());
			stmt.setInt(6, funcionario.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// método para adicionar um funcionário
	// adiciona o funcionário baseado no Bean
	public void adiciona(Funcionario funcionario) {
		String sql = "insert into funcionarios "
				+ "(nome,email,endereco,departamentos_id,senha)"
				+ " values (?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getEmail());
			stmt.setString(3, funcionario.getEndereco());
			stmt.setInt(4, funcionario.getDepartamentos_id());
			stmt.setString(5, funcionario.getSenha());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// método para listar os funcionários
	// retorna um List<Funcionario> com todos os funcionário do banco
	public List<Funcionario> getLista() {
		try {
			List<Funcionario> funcionarios = new ArrayList<Funcionario>();
			PreparedStatement stmt = this.connection
					.prepareStatement("Select * from funcionarios");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Funcionario funcionario = new Funcionario();
				funcionario.setId(rs.getInt("id"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setEmail(rs.getString("email"));
				funcionario.setEndereco(rs.getString("endereco"));
				funcionario.setDepartamentos_id(rs.getInt("departamentos_id"));
				funcionario.setSenha(rs.getString("senha"));
				funcionarios.add(funcionario);
			}
			rs.close();
			stmt.close();
			return funcionarios;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}