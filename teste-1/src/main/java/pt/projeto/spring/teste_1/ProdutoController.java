package pt.projeto.spring.teste_1;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository_gestor;
	

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto novoProduto(@Valid Produto produto) {
            produtoRepository_gestor.save(produto);
            return produto;
        
    }
    
    @GetMapping
    public Iterable<Produto> obter_produtos() {
    	return produtoRepository_gestor.findAll();
    }
    
    @GetMapping(path = "/{id}")
    public Optional<Produto> obter_produto_por_id(@PathVariable int id) {
    	return produtoRepository_gestor.findById(id);
    }
    
    @GetMapping(path = "/nome/{parteNome}")
    public Iterable<Produto> obter_produto_por_nomes(@PathVariable String parteNome) {
    	return produtoRepository_gestor.findByNomeContainingIgnoringCase(parteNome);
    }
    
    @GetMapping(path = "/pagina/{numero_pagina}/{quantidade}")
    public Iterable<Produto> obter_produto_pagina(@PathVariable int numero_pagina, @PathVariable int quantidade) {
    	if (quantidade > 5) quantidade = 5;
    	Pageable page = PageRequest.of(numero_pagina, quantidade);
    	return produtoRepository_gestor.findAll(page);
    }
    

    
//    @PutMapping
//    public Produto alterar_produto(@Valid Produto produto) {
//    	produtoRepository_gestor.save(produto);
//    	return produto;
//    	
//    }
    
    @DeleteMapping(path = "/{id}")
    public void eliminar_produto(@PathVariable int id) {
    	produtoRepository_gestor.deleteById(id);
    	
    }
    
}