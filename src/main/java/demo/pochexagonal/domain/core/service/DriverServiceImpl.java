package demo.pochexagonal.domain.core.service;

import demo.pochexagonal.domain.api.DriverService;
import demo.pochexagonal.domain.core.model.Driver;
import demo.pochexagonal.domain.spi.DriverRepository;

public class DriverServiceImpl implements DriverService {

    private final DriverRepository driverRepository;

    public DriverServiceImpl(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Override
    public Driver create(Driver driver) {
        return null;
    }

    @Override
    public Driver update(Driver driver) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Driver get(Long id) {
        return null;
    }
}
