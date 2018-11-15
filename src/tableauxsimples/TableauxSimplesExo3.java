/*Ecrire un algorithme qui demande à l'utilisateur la grandeur du tableau et ses valeurs.
1. Cet algorithme crée ce tableau et y insère les valeurs au fur et à mesure de la saisie. Le
tableau est affiché à l'utilisateur.
2. Un deuxième tableau devra maintenant contenir les valeurs du premier tableau dans l'ordre
inverse que celui de la saisie. Ce nouveau tableau est affiché à l'utilisateur.
 */

package tableauxsimples;
import java.util.Scanner;

public class TableauxSimplesExo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int nbr = Integer.MIN_VALUE;

		System.out.print("Taille du tableau?");
		nbr = sc.nextInt();
		int[] tab1 = new int[nbr];
		int[] tab2 = new int[nbr];

		for (int i = 0; i < tab1.length; i++) {
			System.out.print("Donnez une valeur ");
			nbr = sc.nextInt();
			tab1[i] = nbr;
			tab2[tab1.length - 1 - i] = nbr;
			
		}
		
		System.out.println("Tableau 1 :");
		afficheTableau(tab1);
		
		System.out.println("Tableau 2 :");
		afficheTableau(tab2);
	}
	
	// fonction qui affiche un tableau d'entier
	// le tableau � afficher est pass� en param�tre
	public static void afficheTableau(int[] tableau)
	{
		// parcours du tableau
		for (int i = 0; i < tableau.length; i++)
		{
			// affichage de la valeur courante
			System.out.print(tableau[i] + " ");
		}
		
		System.out.println();
	}	
}