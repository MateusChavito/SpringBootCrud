package br.com.mchaves.SpringBootPrimeiroExemplo.repository;

import br.com.mchaves.SpringBootPrimeiroExemplo.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long> {

}
