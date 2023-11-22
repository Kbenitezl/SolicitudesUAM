package Model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne
    private Facultad facultad;

    @OneToMany(mappedBy = "profesor")
    private List<Asignatura> asignaturas;

    public Profesor() {
    }
}