package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes. Utilisez
 * Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom = "FirstLast")
public class Ex12_FirstLast {

	int[] tab1 = {};
	int[] tab2 = { 2 };
	int[] tab3 = { 1, 6 };
	int[] tab4 = { 1, 6, 1 };

	/**
	 * Ne pas modifier les informations portées par l'annotation.
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() {

		// TODO Calculez une valeur booléenne qui contrôle le tableau de la sorte :
		// o elle vaut true si le tableau est de longueur supérieure ou égale à 1 
		//   et que le premier et le dernier élément du tableau ont la même valeur
		// o elle vaut false dans les autres cas

		// TODO LOGUEZ la valeur obtenue pour chacun des tableaux tab1 à tab4
		
        //tab1
		boolean b1 = true;

		
			if (tab1.length >=1 && tab1[0] ==tab1[tab1.length - 1]) {
				b1= true;
			} else {
				b1 = false;
			}
		
		Resultat.log(b1);

		//tab2
		boolean b2 = true;

		for (int i = 0; i < tab2.length; i++) {
			if (tab2.length >=1 && tab2[0] ==tab2[tab2.length - 1]) {
				b2 = true;
			} else {
				b2 = false;
			}
		}
		Resultat.log(b2);
		//tab3
		boolean b3 = true;

		for (int i = 0; i < tab2.length; i++) {
			if (tab3.length >=1 && tab3[0] ==tab3[tab3.length - 1]) {
				b3 = true;
			} else {
				b3= false;
			}
		}
		Resultat.log(b3);
		//tab4
		boolean b4 = true;

		for (int i = 0; i < tab4.length; i++) {
			if (tab4.length >=1 && tab4[0] ==tab4[tab4.length - 1]) {
				b4 = true;
			} else {
				b4= false;
			}
		}
		Resultat.log(b4);
	
	
	}
	
	

}