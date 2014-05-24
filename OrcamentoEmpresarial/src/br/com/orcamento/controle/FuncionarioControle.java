package br.com.orcamento.controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import br.com.orcamento.jdbc.dao.FuncionarioDAO;
import br.com.orcamento.modelo.Funcionario;

@ManagedBean
public class FuncionarioControle {

	@EJB
	FuncionarioDAO funcionarioDao = new FuncionarioDAO();
	Funcionario funcionarioSelec;
	boolean modoInsert;
	List<Funcionario> funcionarios;

	// chmado para popular a tabela
	@PostConstruct
	public void iniciarTabela() {
		funcionarios = null;
		funcionarios = (ArrayList<Funcionario>) funcionarioDao.getBeans();
		Collections.sort(funcionarios, new ComparaFuncionario());
		setModoInsert(false);

	}

	public Funcionario getFuncionarioSelec() {
		return funcionarioSelec;
	}

	public void setFuncionarioSelec(Funcionario funcionarioSelec) {
		this.funcionarioSelec = funcionarioSelec;
	}

	public boolean getModoInsert() {
		return modoInsert;
	}

	public void setModoInsert(boolean modoInsert) {
		this.modoInsert = modoInsert;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public String cadastrar() {
		funcionarioSelec = new Funcionario();
		setModoInsert(true);
		return "manterFuncionarioForm";
	}

	public String editar() {
		setModoInsert(false);
		System.out.print("editando " + funcionarioSelec.getNome());
		return "manterFuncionarioForm";
	}

	public String remover() {
		Funcionario f = funcionarioDao.getBean(getFuncionarioSelec().getId());
		funcionarioSelec = null;
		funcionarioDao.remover(f);
		iniciarTabela();
		return "";
	}

	public String salvar() {
		System.out.print("salvando " + funcionarioSelec.getNome());
		funcionarioDao.atualizar(getFuncionarioSelec());
		iniciarTabela();// nova entidade foi inserida; refazer a tabela
		return "manterFuncionarioList";
	}

	public String atualizar() {
		System.out.print("atual  " + funcionarioSelec.getNome());
		funcionarioDao.atualizar(getFuncionarioSelec());
		return "manterFuncionarioList";
	}

	public class ComparaFuncionario implements Comparator<Funcionario> {
		
		public int compare(Funcionario func1, Funcionario func2) {
			return func1.getNome().compareTo(func2.getNome());
		}
	}

}
