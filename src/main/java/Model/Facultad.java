package Model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NamedQueries(
        {
           @NamedQuery(name="Facultad.all",query="select e from Facultad e")
        }
)
public class Facultad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToMany(mappedBy = "facultades")
    private List<Profesor> profesores;

    public Facultad() {
    }
}