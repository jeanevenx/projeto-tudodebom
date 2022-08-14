package classes;

import java.util.Date;

public class pedido {
	private int  id;
	private Date  data_pedido;
	private double valor_bruto;
	private double desconto;
	private double valor_final;
	private cliente client;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData_pedido() {
		return data_pedido;
	}
	public void setData_pedido(Date data_pedido) {
		this.data_pedido = data_pedido;
	}
	
	
	public double getValor_bruto() {
		return valor_bruto;
	}
	public void setValor_bruto(double valor_bruto) {
		this.valor_bruto = valor_bruto;
	}
	
	
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	
	public double getValor_final() {
		return valor_final;
	}
	public void setValor_final(double valor_final) {
		this.valor_final = valor_final;
	}
	public cliente getCliente() {
		return client;
	}
	public void setCliente(cliente client) {
		this.client = client;
	}
}
