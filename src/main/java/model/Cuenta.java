package model;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Cuenta")
@Entity(name = "Cuenta")
@Getter
@Setter
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "activa", length = 1, nullable = false)
	private Boolean activa;
	
	@Column(name = "numeroCuenta", length = 250, nullable = false)
	private String numeroCuenta;
	
	@Column(name = "saldo", precision = 10, scale = 2)
	private BigDecimal saldo;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(unique = true)
	private TipoCuenta TipoCuenta;
	
	@OneToMany(mappedBy = "Cuenta", cascade = CascadeType.PERSIST)
	private List<Movimiento> Movimiento;
	
}
