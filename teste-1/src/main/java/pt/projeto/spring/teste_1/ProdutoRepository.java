package pt.projeto.spring.teste_1;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>, CrudRepository<Produto, Integer>{

	public Iterable<Produto> findByNomeContainingIgnoringCase(String parteNome);
	
//	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:NOME%")
//	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}
