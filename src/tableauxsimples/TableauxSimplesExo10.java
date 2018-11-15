/*Toujours à partir de deux tableaux précédemment saisis, écrivez un algorithme qui calcule le « JOKE »
des deux tableaux. Pour calculer le « JOKE », il faut multiplier chaque élément du tableau 1 par
chaque élément du tableau 2, et additionner le tout.
 */


package tableauxsimples;

import java.util.Scanner;

public class TableauxSimplesExo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
		int[] tab1 = new int[5];
		int[] tab2 = new int[5];
		int tab3[]=new int [5];
		int valeur1 = 0;
		int valeur2 = 0;
		int resultat = 0;

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
		
		for (int i = 0; i < tab1.length; i++) {
			for (int j = 0; j < tab1.length; j++) {
				resultat = resultat + tab1[i] * tab2[i];				
			}		
		}
		System.out.print("Afficher " + resultat);
		
		
		
	}

}
