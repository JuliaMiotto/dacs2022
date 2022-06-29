package br.univille.dacs2022.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univille.dacs2022.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
