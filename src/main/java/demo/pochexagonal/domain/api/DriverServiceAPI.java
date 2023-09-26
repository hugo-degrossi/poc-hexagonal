package demo.pochexagonal.domain.api;

import demo.pochexagonal.domain.core.model.Driver;

public interface DriverServiceAPI {
    public Driver create(Driver driver);
    public Driver update(Driver driver);
    public void delete(Long id);
    public Driver get(Long id);
}
