package cat.itacademy.barcelonactiva.basilicata.paolo.s04.t02.n02.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Fruita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "quantitatQuilos")
	private int quantitatQuilos;
	
	public Fruita() {
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuantitatQuilos() {
		return quantitatQuilos;
	}

	public void setQuantitatQuilos(int quantitaQuilos) {
		this.quantitatQuilos = quantitaQuilos;
	}

	public Long getId() {
		return id;
	}
	
	

}
