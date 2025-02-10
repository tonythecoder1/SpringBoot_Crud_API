package pt.projeto.spring.teste_1;

import org.springframework.web.bind.annotation.PostMapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Produto {
	
	public Produto() {
		
	}
	

	public Produto(String nome, double preco, Integer desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	
	@Column(name = "nome")
	@NotBlank
	private String nome;

	public int getId() {
		return id;
	}
	
	@Column(name = "preco")
	@Min(0)
	private double preco;

	@Column(name = "desconto")
	@Min(0)
	@Max(100)
	private Integer desconto;

	public int getDesconto() {
		return desconto;
	}


	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}


	public double getPreco() {
		return preco;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setDesconto(Integer desconto) {
		this.desconto = desconto;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
