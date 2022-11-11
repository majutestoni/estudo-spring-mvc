package br.com.estudo.carro2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.estudo.carro2.dto.RequisicaoNovo;
import br.com.estudo.carro2.model.Carro;
import br.com.estudo.carro2.model.Tipo;
import br.com.estudo.carro2.repository.CarroRepository;

@Controller
public class DashboardController {

	@Autowired
	private CarroRepository carroRepository;

	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Carro> carros = carroRepository.findAll();
		model.addAttribute("carros", carros);

		return "dashboard";
	}

	@GetMapping("/formulario")
	public String formulario(RequisicaoNovo requisicao) {
		return "formulario";
	}

	@PostMapping("/formulario/novo")
	public String formularioNovo(RequisicaoNovo requisicaoNovo) {

		Carro carro = requisicaoNovo.toCarro();
		carroRepository.save(carro);
		return "redirect:/dashboard";
	}

	private String aaa(@PathVariable String filtro, Model model) {
		List<Carro> carros = carroRepository.findByTipo(Tipo.valueOf(filtro.toUpperCase()));
		model.addAttribute("carros", carros);
		return "dashboard";
	}

	@GetMapping("/dashboard/{filtro}")
	public String filtrarCaminhonete(@PathVariable String filtro, Model model) {
		List<Carro> carros = carroRepository.findByTipo(Tipo.valueOf(filtro.toUpperCase()));
		model.addAttribute("carros", carros);
		return "dashboard";
	}
}
