/*Toujours et encore sur le même principe, écrivez un algorithme permettant, à l’utilisateur de saisir
les noteEleveEleves d'une classe.
Le programme, une fois la saisie terminée, renvoie le nombre des noteEleveEleves supérieures à la moyenne de
la classe.
 */

package tableauxsimples;
import java.util.Scanner;

public class TableauxSimplesExo7 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub

		int noteEleve = 0;
		int moy= 0 ;
		int som = 0;
		int nbrSup= 0 ;
		
		System.out.println("Taille du tableau ? ");
		int nbrEleve = sc.nextInt();
		int[] tab1 = new int[nbrEleve];
		
		for (int i = 0; i < tab1.length; i++)
		{
		System.out.println("Entrez une note");
		noteEleve = sc.nextInt();
		tab1[i] = noteEleve;			
		}
		
		for (int i = 0; i < tab1.length; i++)
		{
		som = 0;
		som = som + tab1[i];
		moy = som / noteEleve;
		nbrSup = 0 ;			
		}
		
		for (int i = 0; i < tab1.length; i++) {
			if (tab1[i] > moy) {
				nbrSup = nbrSup + 1;
			}
		}
		
		System.out.println(nbrSup +" élèvent ayant leur note au dessus de la moyenne");
		
	}
}
