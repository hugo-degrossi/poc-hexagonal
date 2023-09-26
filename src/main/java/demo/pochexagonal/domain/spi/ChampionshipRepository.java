package demo.pochexagonal.domain.spi;

import demo.pochexagonal.domain.entity.ChampionshipEntity;

import java.util.Optional;

public interface ChampionshipRepository {

    Optional<ChampionshipEntity> findById(Long id);

    void save(ChampionshipEntity championship);
}
