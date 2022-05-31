package tads.ufrn.br.artesmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tads.ufrn.br.artesmvc.domain.Arte;

public interface ArteRepository extends JpaRepository<Arte, Long> {
}
