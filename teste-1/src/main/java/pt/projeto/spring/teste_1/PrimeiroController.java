package pt.projeto.spring.teste_1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	
	@RequestMapping
	public String ola() {
		return "Ola Spring Boot";
	}

}
