package classes;

public class itemPedido {
	private String num_sequencial;
	private pedido request;
	private int quantidade;
	private double valor_unitario;
	private double valor_total;
	private produto product;
	
	
	public String getNum_sequencial() {
		return num_sequencial;
	}
	public void setNum_sequencial(String num_sequencial) {
		this.num_sequencial = num_sequencial;
	}
	public pedido getRequest() {
		return request;
	}
	public void setRequest(pedido request) {
		this.request = request;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor_unitario() {
		return valor_unitario;
	}
	public void setValor_unitario(double valor_unitario) {
		this.valor_unitario = valor_unitario;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	public produto getproduct() {
		return product;
	}
	public void setproduct(produto product) {
		this.product = product;
	}

}
