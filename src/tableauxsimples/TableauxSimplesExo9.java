/*Ecrivez un algorithme constituant un tableau, à partir de deux tableaux de même longueur
préalablement saisis. Le nouveau tableau sera la somme des éléments des deux tableaux de départ.
 */

package tableauxsimples;
import java.util.Scanner;

public class TableauxSimplesExo9 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int[] tab1 = new int[5];
			int[] tab2 = new int[5];
			int tab3[]=new int [5];
			int valeur1 = 0;
			int valeur2 = 0;

			for (int i = 0; i < tab1.length; i++) {
				System.out.print("Entrez 5 valeurs pour le premier tableau ");
				valeur1 = sc.nextInt();
				tab1[i] = valeur1;
			}
				for (int i = 0; i < tab1.length; i++) {
				System.out.print("Entrez 5 valeurs pour le deuxième tableau ");
				valeur2 = sc.nextInt();
				tab2[i] = valeur2;
			}
				System.out.print("La sommes des deux tableaux est : ");
				for(int i = 0; i < tab1.length;i++){			
					tab3[i]=tab1[i]+tab2[i];
					System.out.print(tab3[i]);
				} 			
		}	
}

