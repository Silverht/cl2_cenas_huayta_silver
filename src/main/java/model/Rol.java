package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Rol")
@Entity(name = "Rol")
@Getter
@Setter
public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "activo", length = 1, nullable = false)
	private Boolean activo;
	
	@Column(name = "descripcion", length = 255, nullable = false)
	private String descripcion;

}
