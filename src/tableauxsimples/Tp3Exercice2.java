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
		int index = 0;
		int doublon = 0;
		
		//Calcule de la moyenne 
		for(int i=0; i < array.length ; i++) {
			somme = somme + array[i];
			moyenne = somme / array.length;
			
			//Calcul de l'index dans le tableau de l’entier 15
			if(array[i] == 15){
				index = i ;
			}
				
		}
		System.out.print("Moyenne : " + moyenne);		
		System.out.println("\nIndex de l'entier 15 : " +  index);
		
		
		//Calcul pour trouver le nombre d’entiers en doublon 
		for(int i=0; i < array.length ; i++) {
			int temp = array[i];
			for(int j=i+1; j < array.length ; j++) {
				if (temp == array[j]) {
					doublon ++;				
				}			
			}
		}	
		System.out.println("Il y a " + doublon + " doublons");
		
	}
}
