package pt.projeto.spring.teste_1;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class ModeloCont {
	
	@GetMapping
	public String get() {
		
		return "reposiçao GET";
	}
	
	@PostMapping
	public String post() {
		
		return "reposiçao POST";
	}
	
	@PutMapping
	public String put() {
		
		return "reposiçao PUT";
	}
	
	@PatchMapping
	public String patch() {
		
		return "reposiçao PATCH";
	}
	
	@DeleteMapping
	public String delete() {
		
		return "reposiçao DELETE";
	}
	

}
