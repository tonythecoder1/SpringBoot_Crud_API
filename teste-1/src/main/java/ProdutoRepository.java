import org.springframework.data.repository.CrudRepository;

import pt.projeto.spring.teste_1.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	
	public Iterable<Produto> findByNomeContaining(String parteNome);

}
