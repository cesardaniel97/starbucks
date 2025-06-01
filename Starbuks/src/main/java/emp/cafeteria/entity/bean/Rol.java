package emp.cafeteria.entity.bean;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "roles")
public class Rol {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Integer id;

	    @Column(name = "nombre", unique = true, nullable = false)
	    private String nombre;

	    @Column(name = "descripcion")
	    private String descripcion;

	
}
