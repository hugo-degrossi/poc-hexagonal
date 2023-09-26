package demo.pochexagonal.domain.spi;

import demo.pochexagonal.domain.core.model.Championship;

import java.util.Optional;

public interface ChampionshipRepository {

    Optional<Championship> findById(Long id);

    void save(Championship championship);
}
