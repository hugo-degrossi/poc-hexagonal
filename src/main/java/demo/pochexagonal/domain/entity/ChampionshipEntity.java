package demo.pochexagonal.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChampionshipEntity {

    private Long id;

    private List<DriverEntity> drivers = new ArrayList<>();


    public void addDriveToChampionship(DriverEntity driver) {
        this.drivers.add(driver);
    }

}
