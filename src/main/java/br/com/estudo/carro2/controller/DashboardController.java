package br.com.estudo.carro2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.estudo.carro2.model.Carro;
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
}
