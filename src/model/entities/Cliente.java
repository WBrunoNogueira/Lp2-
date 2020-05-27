package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String nome;
	private String email;
	private Date nascimento;
	
	public Cliente(String nome, String email, Date nascimento) {
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
	}

	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return nascimento;
	}

	public void setBirthDate(Date Nascimento) {
		this.nascimento = Nascimento;
	}

	@Override
	public String toString() {
		return nome + " Nascimento (" + sdf.format(nascimento) + ") - Email:" + email;
 	}
}
