package br.com.alura.mvc.controller;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.alura.mvc.model.Pedido;

public class DtoPedido {
	
	private Long id;

	private String nomeProduto;
	private String urlImagem;
	private String urlProduto;
	private String descricao;
	private BigDecimal valorNegociado;
	private LocalDate dataDaEntrega;
	
	public DtoPedido() {}
	
	public Pedido toPedido() {
		
		Pedido pedido = new Pedido();
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlImagem(urlImagem);
		pedido.setUrlProduto(urlProduto);
		pedido.setDescricao(descricao);
		pedido.setValorNegociado(valorNegociado);
		pedido.setDataDaEntrega(dataDaEntrega);
		
		return pedido;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public String getUrlProduto() {
		return urlProduto;
	}

	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValorNegociado() {
		return valorNegociado;
	}

	public void setValorNegociado(BigDecimal valorNegociado) {
		this.valorNegociado = valorNegociado;
	}

	public LocalDate getDataDaEntrega() {
		return dataDaEntrega;
	}

	public void setDataDaEntrega(LocalDate dataDaEntrega) {
		this.dataDaEntrega = dataDaEntrega;
	}

}
