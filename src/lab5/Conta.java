package lab5;

import java.util.ArrayList;
import java.util.List;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Bruno Andrade Fernandes - 119110378
 */
public class Conta {
	/**
	 * lista de compras feitas na conta
	 */
	private List<Compra> comprasCadastradas;
	/**
	 * total gasto na conta
	 */
	private double debito;
	private String fornecedor;
	private String cliente;

	/**
	 * construtor da conta
	 * 
	 * @param data              data da compra
	 * @param nome_produto      nome do produto comprado
	 * @param descricao_produto descricao do produto comprado
	 * @param cliente2 
	 */
	public Conta(String data, String nome_produto, String descricao_produto, String cpfCliente) {
		comprasCadastradas = new ArrayList<>();
	}

	/**
	 * cadastra uma compra na conta
	 * 
	 * @param data              data da compra
	 * @param nome_produto      nome do produto adquirido
	 * @param descricao_produto descricao do produto adquirido
	 * @param preco             preco da compra
	 */
	public void cadastraCompra(String data, String nome_produto, String descricao_produto, Object preco) {
		comprasCadastradas.add(new Compra(data, nome_produto, descricao_produto, (double) preco));
	}

	/**
	 * calcula o gasto total na conta
	 * 
	 * @return gasto total da conta
	 */
	public double getDebito() {
		double debito = 0;
		for (Compra compra : comprasCadastradas) {
			debito += compra.getPreco();
		}
		return debito;
	}

	public String getFornecedor() {
		return this.fornecedor;
	}
}
