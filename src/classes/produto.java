package classes;

public class produto {
	private int id;
	private String nome;
	private String descricao;
	private Double preco;
	private int quantidade;
	private String link_foto;
	private int flag_generico;
	private String flag_remedio;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getLink_generico() {
		return link_foto;
	}
	public void setLink_generico(String link_foto) {
		this.link_foto = link_foto;
	}
	public int getFlag_generico() {
		return flag_generico;
	}
	public void setFlag_generico(int flag_generico) {
		this.flag_generico = flag_generico;
	}
	public String getFlag_remedio() {
		return flag_remedio;
	}
	public void setFlag_remedio(String flag_remedio) {
		this.flag_remedio = flag_remedio;
	}
}
