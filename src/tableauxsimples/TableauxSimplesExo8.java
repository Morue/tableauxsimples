/*Ecrivez un algorithme qui permet la saisie d’un nombre quelconque de valeurs.
Toutes les valeurs doivent ensuite être augmentées de 1, et le tableau sera affiché à l’écran.
 */

package tableauxsimples;
import java.util.Scanner;

public class TableauxSimplesExo8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub

		int valeur = 0;

		System.out.print("Taille du tableau?");
		valeur = sc.nextInt();
		int[] tab1 = new int[valeur];

		for (int i = 0; i < tab1.length; i++) {
			System.out.print("Donnez une valeur ");
			valeur = sc.nextInt();
			tab1[i] = valeur;	
		}
		
		for (int i = 0; i < tab1.length; i++) {
			tab1[i] = tab1[i] + 1 ;
			System.out.print(tab1[i]);
		}
		
	}

}
