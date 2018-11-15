/*Ecrire un algorithme qui demande à l'utilisateur la grandeur du tableau et ses valeurs.
Cet algorithme crée ce tableau et y insère les valeurs au fur et à mesure de la saisie.
Il indique ensuite à l'utilisateur :
1. Si le tableau est trié par ordre croissant ou non
2. La plus petite valeur du tableau
3. La plus grande valeur du tableau
 */

package tableauxsimples;

public class TableauxSimplesExo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = -1;
		int min = -1;
		int courant = -1;
		boolean croissantP = true;
		
		int [] tableau = {0,2,4,9,7,10,10};
		for (int i = 0 ; i < tableau.length ; i++)
		{
			if (tableau[i] > max)
			{
				max = tableau[i];
			}
			if (tableau[i] < min)
			{
				min = tableau[i];
			}
			if (tableau[i] < courant)
			{
				croissantP = false;
				courant = tableau[i];
			}
		}
			System.out.println("max =>" +max);
			System.out.println("min =>" +min);
			System.out.println("croissant =>" +croissantP);
		
	}

}