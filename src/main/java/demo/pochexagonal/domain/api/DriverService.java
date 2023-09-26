package demo.pochexagonal.domain.api;

import demo.pochexagonal.domain.core.model.Driver;

public interface DriverService {
    Driver create(Driver driver);
    Driver update(Driver driver);
    void delete(Long id);
    Driver get(Long id);
}
