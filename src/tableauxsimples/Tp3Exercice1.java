/* • Le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;  
 * • Afficher l’ensemble des éléments du tableau grâce à une boucle  
 * • Afficher l’ensemble des éléments dans l’ordre inverse du tableau  
 * • Faire une boucle et un test de manière à n’afficher que les entiers supérieurs à 3  
 * • Faire une boucle qui affiche uniquement les entiers pairs  
 * • Afficher le plus grand élément du tableau  
 * • Afficher le plus petit élément du tableau  
 */

package tableauxsimples;

public class Tp3Exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		//Afficher l’ensemble des éléments du tableau
		
		System.out.print("Les éléments du tableau :");
		afficheTableau(array);
		
		//Afficher l’ensemble des éléments du tableau en sens inverse
		
		for (int i = 0 ; i < (array.length)/2 ; i++){     
		
			int temp = array[i];
			array[i] = array[array.length - i -1];
			array[array.length - i - 1] = temp;
		} 
		System.out.println ("");
		System.out.print ("Les éléments du tableau inversés :"); 
		afficheTableau(array);
		
		//Afficher que les entiers supérieurs à 3	
			
		System.out.println ("");
		System.out.print ("Les entiers supérieurs à trois sont:"); 
		for (int i = 0; i <= array.length - 1; i++){
		    if (array[i] >3) {
		    	
		    	System.out.print (array[i] + " ");
		    }
		}
			
		//Afficher uniquement les entiers pairs
		
		System.out.println ("");
		System.out.print ("Les entiers pairs sont : ");
		for (int i = 0; i <= array.length - 1; i++){
		    if (array[i] % 2 == 0) {
		    	
		    	System.out.print (array[i] + " ");
		    }
		}
		
		//Afficher le plus grand élément du tableau	
		
		int maximum = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > maximum) {
				maximum = array[i];
			}
		}		
		System.out.println ("");
		System.out.print ("Le plus grand élément est :" +maximum); 
		
		
		//Afficher le plus petit élément du tableau
		int minimum = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < minimum) {
				minimum = array[i];
			}
		}			
		System.out.println ("");
		System.out.print ("Le plus petit élément est :" +minimum); 
		
	}
	
		//Méthode pour afficher le tableau
	
		private static void afficheTableau(int[] array) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ; ");
		    }
		}		     
}
