package br.com.alura.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiaomi Redmi 9a");
		pedido.setUrlImagem("https://images-americanas.b2w.io/produtos/5218445740/imagens/xiaomi-redmi-9a-dual-sim-32-gb-verde-2-gb-ram-camera-13mpx/5218445740_1_xlarge.jpg");
		pedido.setUrlProduto("https://www.americanas.com.br/produto/5218445740?epar=bp_pl_00_go_tel_pmax_acessorios&opn=YSMESP&WT.srch=1&offerId=629a56052376eb9c727b6886&gclid=Cj0KCQjwntCVBhDdARIsAMEwACk-UGvtZxN2h0JaIAYd_4GQ_emO_el1SmHabeK-MxXLN6zhhuhTXrAaArzVEALw_wcB");
		pedido.setDescricao("uma descricao qualquer para o produto");
		
		List<Pedido> listaPedidos = new ArrayList<>();		
		listaPedidos.add(pedido);
		model.addAttribute("pedido", listaPedidos);

		return "home";
		
	}

}

