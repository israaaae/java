package Pk1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LaListe {

	private List<Machine> machine;
	
	public void alimenter() {
	    Machine mach1 = new Machine("dell", 123456, "italy", 2020);
	    Machine mach2 = new Machine("samsung", 789456, "korea", 2022);
	    machine.add(mach1);
	    machine.add(mach2);
	}

	public void afficher() {
	    for (Machine mach : machine) {
	        System.out.println(mach.toString());
	    }
	}
	
	public void parcourir() {
	    Iterator<Machine> iterateur = machine.iterator();
	    while (iterateur.hasNext()) {
	        iterateur.next();
	    }
	}
	
	public void insererElement(Machine mach, int i) {
	    machine.add(i, mach);
	}

	public Machine recupererElement(int index) {
	    return machine.get(index);
	}
	
	public void supp(Machine mach) {
	    machine.remove(mach);
	}
	
	public boolean rechercher(Machine mach) {
	    return machine.contains(mach);
	}

	public void trier() {
	    Collections.sort(machine);
	}

	public List<Machine> copier() {
	    return new ArrayList<>(machine);
	}

	public void melanger() {
	    Collections.shuffle(machine);
	}

	public void inverser() {
	    Collections.reverse(machine);
	}

	public List<Machine> extraire(int d, int f) {
	    return new ArrayList<>(machine.subList(d, f));
	}

	public boolean comparer(List<Machine> mach) {
	    return machine.equals(mach);
	}

	public void echanger(int i1, int i2) {
	    Collections.swap(machine, i1, i2);
	}

	public void vider() {
	    machine.clear();
	}

	public boolean vide() {
	    return machine.isEmpty();
	}

	
}
