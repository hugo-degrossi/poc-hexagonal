package demo.pochexagonal.domain.core.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    private Long id;
    private String firstname;
    private String lastname;
    private String country;
    private Integer position;
    private Integer points;


    public void addPoints(Integer lastRacePoints) {
        this.points = points + lastRacePoints;
    }
}
