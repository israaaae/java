package Pk1;

import java.util.Arrays;

public class Tableau{

	private Machine[] tab;

    public Tableau(Machine[] mach) {
        tab = Arrays.copyOf(mach, mach.length);
    }

	public void trier() {
		Arrays.sort(tab);
	}

	  public void ajouter(Machine mach) {
        int taille = tab.length;
        tab = Arrays.copyOf(tab, taille + 1);
        tab[taille] = mach;
	    }
	  
	  public void supp(Machine mach) {
        int index = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].equals(mach)) {		        // Recherche de l'index de l'élément à supprimer
                index = i;
                break;
            }
        }
        if (index != -1) {
            Machine[] tab2 = new Machine[tab.length - 1];   // Création d'un nouveau tableau avec une taille réduite
            System.arraycopy(tab, 0, tab2, 0, index);     // Copie des éléments avant l'élément à supprimer
            System.arraycopy(tab, index + 1, tab2, index, tab.length - index - 1); //Copie des éléments après l'élément à supprimer
            tab = tab2; 		 // Affectation du nouveau tableau
        }
	}
    public int compte() {
        return tab.length;
    }
    
    public void inverse() {
        int longueur = tab.length;
        for (int i = 0; i < longueur / 2; i++) {
            Machine temp = tab[i];
            tab[i] = tab[longueur - i - 1];
            tab[longueur - i - 1] = temp;
        }
    }
    
    public void afficher() {
        for (Machine mach : tab) {
            System.out.println(mach);
        }
    }

    public Machine grand() {
        if (tab.length == 0) {
            return null;
        }

        Machine G = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i].compareTo(G) > 0) {
                G = tab[i];
            }
        }
        return G;
    }
	  
    public boolean egalite(Tableau tab2) {
        return Arrays.equals(this.tab, tab2.tab);// Tableau hiya smit la classe b7alli kan9arno tab dyal Machine m3a chi tableau akhor fih des machines okhrin
    }
}
