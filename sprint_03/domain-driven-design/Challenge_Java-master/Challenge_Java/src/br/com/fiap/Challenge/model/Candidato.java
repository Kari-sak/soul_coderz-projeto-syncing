package br.com.fiap.Challenge.model;

import java.util.ArrayList;

public class Candidato extends Usuario{
	private Vaga vaga;
	private String cpf;
	private EnumGenero genero;

//	private ArrayList<String> tagsCandidato;
	 
	public Candidato() {
		
	}

	public Candidato(String id, String nome, String senha, String tipoUsuario, String email, String cpf2, String genero2) {
		// TODO Auto-generated constructor stub
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public EnumGenero getGenero() {
		return genero;
	}

	public void setGenero(EnumGenero genero) {
		this.genero = genero;
	}

//	public ArrayList<String> getTagsCandidato() {
//		return tagsCandidato;
//	}
//	
//	public void setTagsCandidato(ArrayList<String> tagsCandidato) {
//		this.tagsCandidato = tagsCandidato;
//	}
	
	public String tipoUsuario() {
		setTipoUsuario(EnumTipoUsuario.CANDIDATO);
		return "Candidato";
	}
	
	public String retornarGenero() {
		if(this.genero==EnumGenero.MASCULINO) {
			return "Masculino";
		}else if(this.genero==EnumGenero.FEMININO) {
			return "Feminino";
		}else {
			return "Não Binário";
		}
	}
	
	public void cadastrarGenero(int genero) {
		switch (genero) {
		case 1:
			setGenero(EnumGenero.MASCULINO);
			break;
		case 2:
			setGenero(EnumGenero.FEMININO);
			break;
		case 3:
			setGenero(EnumGenero.NAO_BINARIO);
			break;
	}
	}
	
	public void cadastrar(String nome,String senha, String email,String cpf) {
		super.setNome(nome);
		super.setEmail(email);
		super.setSenha(senha);
		setCpf(cpf);
		
	}
	
	
	public void seInscreverVaga() {

	}

}
