package Model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
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