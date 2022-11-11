package br.com.estudo.carro2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estudo.carro2.model.Carro;
import br.com.estudo.carro2.model.Tipo;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer> {

	List<Carro> findByTipo(Tipo tipo);

}
