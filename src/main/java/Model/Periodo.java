package Model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@NamedQueries(
        {
        @NamedQuery(name = "Periodo.findAll", query = "SELECT p FROM Periodo p")
                }
                )
public class Periodo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String dia;

    private String hora;

    @ManyToOne
    private Asignatura asignatura;

    private String salon;

    public Periodo() {
    }
}