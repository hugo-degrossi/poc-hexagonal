package demo.pochexagonal.domain.spi;

import demo.pochexagonal.domain.core.model.Driver;

import java.util.Optional;

public interface DriverRepository {

    Optional<Driver> findById(Long id);

    void save(Driver driver);
}
