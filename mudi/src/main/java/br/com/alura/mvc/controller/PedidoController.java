package br.com.alura.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.mvc.Util.Util;
import br.com.alura.mvc.dto.DtoPedido;
import br.com.alura.mvc.model.Pedido;
import br.com.alura.mvc.repository.PedidoRepository;

@Controller
@RequestMapping("pedido")
public class PedidoController {

	@Autowired
	PedidoRepository pedidoRepository;

	@GetMapping("formulario")
	public String formulario(DtoPedido dtoPedido) {
		return "pedido/formulario";
	}

	@PostMapping("novo")
	public String novo(@Valid DtoPedido dtoPedido, String dataDaEntregaString, BindingResult result) {

		if (result.hasErrors()) {
			return "pedido/formulario";
		}

		dtoPedido.setDataDaEntrega(Util.parseDate(dataDaEntregaString));
		Pedido pedido = dtoPedido.toPedido();
		pedidoRepository.save(pedido);
		return "pedido/sucessoNovo";

	}

}
