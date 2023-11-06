package tests;


import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.Cliente;
public class JPATest {

	public static void main(String[] args) throws IOException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction tx = manager.getTransaction();

		tx.begin();
		
		Cliente cliente = new Cliente();
		cliente.setApellidoPaterno("Luna");
		cliente.setApellidoMaterno("Rodríguez");
		cliente.setNombres("Maria");
		
		
		tx.commit();

		List<Cliente> lista = manager.createQuery("from Cliente", Cliente.class).getResultList();
		for (Cliente cl : lista) {
			System.out.println(cl);
		
		
		
	}
	}

}
