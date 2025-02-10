package model;

public class Cliente {
	
	private int id;
	private String nomeString;
	private String cpf;
	
	public Cliente(int id, String nomeString, String cpf) {
		super();
		this.id = id;
		this.nomeString = nomeString;
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeString() {
		return nomeString;
	}

	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
