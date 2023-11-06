package model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Movimiento")
@Entity(name = "Movimiento")
@Getter
@Setter

public class Movimiento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descripcion", length = 250, nullable = false)
	private String descripcion;
	
	private LocalDate fecha;
	
	@Column(name = "monto", precision = 10, scale = 2)
	private BigDecimal monto;
	
	
	
	
	
	
}
