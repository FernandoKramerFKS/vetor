package vetor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import vetor.dto.VetorDto;

@Controller
public class VetorController {
	
	@GetMapping("/")
	public String vetor() {
		return "vetor";
	}
	
	@PostMapping("/calcular")
	public String calcular(VetorDto vetor, Model model) {
		vetor.calcularVetor(vetor);
		model.addAttribute("resultado", "Reultado do Cálculo: " + vetor.getResultado());
		return "vetor";
	}

}
