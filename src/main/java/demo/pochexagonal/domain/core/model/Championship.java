package demo.pochexagonal.domain.core.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Championship {

    private Long id;

    private List<Driver> drivers = new ArrayList<>();


    public void addDriveToChampionship(Driver driver) {
        this.drivers.add(driver);
    }

}
