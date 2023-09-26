package demo.pochexagonal.domain.api;

import demo.pochexagonal.domain.core.model.Championship;
import demo.pochexagonal.domain.core.model.Driver;

public interface ChampionshipService {
    Championship create(Championship championship);
    Championship update(Championship championship);
    void addDriver(Long id, Driver driver);
    Championship get(Long id);
}
