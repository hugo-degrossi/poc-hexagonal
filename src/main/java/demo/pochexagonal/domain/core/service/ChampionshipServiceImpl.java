package demo.pochexagonal.domain.core.service;

import demo.pochexagonal.domain.api.ChampionshipService;
import demo.pochexagonal.domain.core.model.Championship;
import demo.pochexagonal.domain.core.model.Driver;
import demo.pochexagonal.domain.spi.ChampionshipRepository;

public class ChampionshipServiceImpl implements ChampionshipService {

    private final ChampionshipRepository championshipRepository;

    public ChampionshipServiceImpl(ChampionshipRepository championshipRepository) {
        this.championshipRepository = championshipRepository;
    }

    @Override
    public Championship create(Championship championship) {
        Championship championshipEntity = new Championship(championship.getId(), championship.getDrivers());
        championshipRepository.save(championship);
        return championshipEntity;
    }

    @Override
    public Championship update(Championship championship) {
        championshipRepository.save(championship);
        return championship;
    }

    @Override
    public void addDriver(Long id, Driver driver) {
        Championship championship = get(id);
        championship.addDriveToChampionship(driver);

        championshipRepository.save(championship);
    }

    @Override
    public Championship get(Long id) {
        return championshipRepository
                .findById(id)
                .orElseThrow(RuntimeException::new);
    }
}
