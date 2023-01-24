package Model.repositories;

import org.springframework.data.repository.CrudRepository;

import Model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

}
