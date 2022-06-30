package br.com.alura.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.mvc.Util.Util;
import br.com.alura.mvc.model.Pedido;
import br.com.alura.mvc.repository.PedidoRepository;

@Controller
@RequestMapping("pedido")
public class PedidoController {
	
	@Autowired
	PedidoRepository pedidoRepository;
	
	@GetMapping("formulario")
	public String formulario() {
		return "pedido/formulario";
	}
	
	@PostMapping("novo")
	public String novo(DtoPedido dtoPedido, String dataDaEntregaString) {
		
		dtoPedido.setDataDaEntrega(Util.parseDate(dataDaEntregaString));
		Pedido pedido = dtoPedido.toPedido();
		pedidoRepository.save(pedido);
		
		return "pedido/sucessoNovo";
	}
	
	
	
}
