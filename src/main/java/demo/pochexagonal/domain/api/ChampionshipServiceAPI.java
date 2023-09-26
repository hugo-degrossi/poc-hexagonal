package demo.pochexagonal.domain.api;

import demo.pochexagonal.domain.core.model.Championship;
import demo.pochexagonal.domain.core.model.Driver;

public interface ChampionshipServiceAPI {
    public Championship create(Championship championship);
    public Championship update(Championship championship);
    void addDriver(Long id, Driver driver);
    public Championship get(Long id);
}
