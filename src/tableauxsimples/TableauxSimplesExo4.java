/*Ecrire un algorithme qui déclare un tableau de 10 notes scolaires, dont on fait ensuite saisir les
valeurs par l’utilisateur.
La somme des nombres est affichée à l'utilisateur.
La moyenne des notes de ce tableau est aussi affichée à l'utilisateur.
 */

package tableauxsimples;
import java.util.Scanner;

public class TableauxSimplesExo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int som = 0;
		int note = -1;
		int[] tab1 = new int[10];
		
		for (int i = 0; i < tab1.length; i++)
		{
		System.out.print("Entrez une note");
		note = sc.nextInt();
		tab1[i] = note;
		
		som = som + tab1[i];		
		}
		
		int moyenne = som/tab1.length;
		 System.out.println("Somme : " +som+ " Moyenne : " +moyenne);

	}

}
