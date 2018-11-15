/*Ecrivez un algorithme permettant à l’utilisateur de saisir un nombre quelconque de valeurs, qui
devront être stockées dans un tableau.
L’utilisateur doit donc commencer par entrer le nombre de valeurs qu’il compte saisir. Il effectuera
ensuite cette saisie.
Enfin, une fois la saisie terminée, le programme affichera le nombre de valeurs multiples de 3 et le
nombre de valeurs non multiple de 3.
*/

package tableauxsimples;
import java.util.Scanner;

public class TableauxSimplesExo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		

		int valMultiple = 0;
		int valPasMultiple = 0; 
		
		System.out.print("Taille du tableau?");
		int valeur = sc.nextInt();
		int[] tab1 = new int[valeur];


		for (int i = 0; i < tab1.length; i++) {
			System.out.print("Donnez une valeur ");
			valeur = sc.nextInt();
			tab1[i] = valeur;
		
			if (valeur % 3 == 0)
			{
				valMultiple= valMultiple +1;
			}
			else
			{
			valPasMultiple++;	// correspond à valPasMultiple= valPasMultiple +1;		
			}
		}
		
		System.out.print("I y a " + valMultiple + " multiples de trois");
		System.out.println("I y a " + valPasMultiple + " qui ne sont pas multiples de trois");
	}
}
		
