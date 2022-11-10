package br.com.estudo.carro2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estudo.carro2.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer> {

}
