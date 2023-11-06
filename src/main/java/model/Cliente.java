package model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Cliente")
@Entity(name = "Cliente")
@Getter
@Setter


public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	


	@Column(name = "apellidoPaterno", length = 250, nullable = false)
	private String apellidoPaterno;
	
	@Column(name = "apellidoMaterno", length = 250, nullable = false)
	private String apellidoMaterno;
	
	@Column(name = "nombres", length = 250, nullable = false)
	private String nombres;
	
	@OneToMany(mappedBy = "Cliente", cascade = CascadeType.PERSIST)
	private List<Cuenta> Cuenta;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Rol> Rol;

	
		
		@Override
		public String toString() {
			return "Cliente [id=" + id + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno
					+ ", nombres=" + nombres + ", Cuenta=" + Cuenta + ", Rol=" + Rol + "]";
		}



		public void setApellidoPaterno(String string) {
			// TODO Auto-generated method stub
			
		}



		public void setApellidoMaterno(String string) {
			// TODO Auto-generated method stub
			
		}



		public void setNombres(String string) {
			// TODO Auto-generated method stub
			
		}










}
