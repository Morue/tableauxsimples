/* • Créer une classe TestArray2  
 * • Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;  
 * • Quelle est la moyenne des éléments du tableau ?  
 * • Quel est l’index dans le tableau de l’entier 15 ?  
 * • Ecrire un algorithme pour trouver le nombre d’entiers en doublon dans le tableau  
 
 */

package tableauxsimples;

public class Tp3Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		int somme = 0;
		double moyenne = 0;
		
		//Calcule de la moyenne 
		for(int i=0; i < array.length ; i++) {
			somme = somme + array[i];
			moyenne = somme / array.length;		
		}
		System.out.print("Moyenne : " + moyenne);
		
		//Calcul de l'index dans le tableau de l’entier 15
		
		//Calcul pour trouver le nombre d’entiers en doublon 
	}
	
	

}
