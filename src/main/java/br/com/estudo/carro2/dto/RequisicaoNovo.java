package br.com.estudo.carro2.dto;

import br.com.estudo.carro2.model.Carro;
import br.com.estudo.carro2.model.Tipo;

public class RequisicaoNovo {
	private String nome;
	private String urlFoto;
	private Tipo tipo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrlFoto() {
		return urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Carro toCarro() {
		Carro c = new Carro();
		c.setNome(nome);
		c.setUrlFoto(urlFoto);
		c.setTipo(Tipo.POPULAR);

		return c;
	}

}
