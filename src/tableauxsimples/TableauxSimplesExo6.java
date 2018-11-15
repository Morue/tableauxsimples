/*Ecrivez un algorithme permettant, toujours sur le même principe, à l’utilisateur de saisir un nombre
déterminé de valeurs.
Le programme, une fois la saisie terminée, renvoie la plus grande valeur en précisant quelle position
elle occupe dans le tableau.
On prendra soin d’effectuer la saisie dans un premier temps, et la recherche de la plus grande valeur
du tableau dans un second temps.
 */

package tableauxsimples;
import java.util.Scanner;

public class TableauxSimplesExo6 {

	public static void main(String[] args) {

		
		//init valeurs
		int posMaxi = -1;
	
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Taille du tableau ? ");
		int valeur = sc.nextInt();
		int[] tab1 = new int[valeur];


		for (int i = 0; i < tab1.length; i++) {
			System.out.print("Donnez une valeur ");
			valeur = sc.nextInt();
			tab1[i] = valeur;
		}
			
		for (int i = 0; i < tab1.length; i++) {
			posMaxi = 0;					
				if (tab1[i] > tab1[posMaxi]) {
				posMaxi = i;
				}					
		}					
		System.out.print("La valeur maximum est " + tab1[posMaxi]);
		System.out.print("La position de cette valeur est " + posMaxi);
		
			}		
		}
		
		
		

