/* • Créer une classe TestArrayTri
  
 * • Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;  
 * • Utiliser la classe Arrays pour trier le tableau  */

package tableauxsimples;

import java.util.Arrays;

public class Tp3Exercice3 {
	public static void main(String[] args) {

	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
	
	Arrays.sort(array);
	
	for(int i = 0; i < array.length; i++) {
	    System.out.print(array[i] + " ");
	}
	
	}
}

