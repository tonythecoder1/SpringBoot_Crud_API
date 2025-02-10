package pt.projeto.spring.teste_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraControl {
	
	@GetMapping("/somar/{x}/{y}")
	public int soma(@PathVariable int x, @PathVariable int y) {
		return x+y;
	}

}
