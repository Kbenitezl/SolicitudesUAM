package Model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Asignatura {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long Id;

    private String nombre;

    @ManyToOne
    private Facultad facultad;

    @ManyToOne
    private Profesor profesor;

    private String tipo;

    public Asignatura() {
    }

    public void setPeriodos(List<Periodo> periodo) {
    }
}