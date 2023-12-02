package Pk1;

import java.util.Objects;

public class Machine implements Comparable<Machine>{ //kan 3ndi erreur dans Machine ms on doit le corriger par add implemented methods .

	private String nom;
	private int numSerie;
	private String countryProd;
	private int anneeProd;
	
	public Machine(String nom, int numSerie, String countryProd, int anneeProd) {
		super();
		this.nom = nom;
		this.numSerie = numSerie;
		this.countryProd = countryProd;
		this.anneeProd = anneeProd;
	}	

	@Override
	public String toString() {
		return "Machine [nom=" + nom + ", numSerie=" + numSerie + ", countryProd=" + countryProd + ", anneeProd="
				+ anneeProd + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Machine other = (Machine) obj;
		return anneeProd == other.anneeProd && Objects.equals(countryProd, other.countryProd)
				&& Objects.equals(nom, other.nom) && numSerie == other.numSerie;
	}

	@Override
	public int compareTo(Machine o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void add(Machine machine) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Machine machine) {
		// TODO Auto-generated method stub
		
	}
	
}
