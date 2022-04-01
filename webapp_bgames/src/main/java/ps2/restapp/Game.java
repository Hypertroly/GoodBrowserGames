package ps2.restapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "game")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nome")
	private String nome;

	@Column(name = "URL")
	private String URL;

	@Column(name = "URLVideo")
	private String URLVideo;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "categoria_nomeCategoria")
	private String categoria_nomeCategoria;

	public Game() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String URL) {
		this.URL = URL;
	}

	public String getURLVideo() {
		return URLVideo;
	}

	public void setURLVideo(String URLVideo) {
		this.URLVideo = URLVideo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria_nomeCategoria() {
		return categoria_nomeCategoria;
	}

	public void setCategoria_nomeCategoria(String categoria_nomeCategoria) {
		this.categoria_nomeCategoria = categoria_nomeCategoria;
	}

}
