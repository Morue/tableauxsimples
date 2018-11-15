/* Exercice 1 sur les tableaux à une dimension

Ecrire un algorithme qui déclare un tableau de 10 éléments, 
le remplir du chiffre 0 au chiffre 9 et affiche ensuite à 
l'utilisateur toutes les valeurs de ce tableau. 

 */
package tableauxsimples;
import java.util.Scanner;
public class TableauxSimplesExo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] tab1 = new int[10];
		
		for (int i = 0; i < tab1.length-1; i++)
		{
		tab1[i] = i;
		System.out.print(i + " ");

		}

	}
}