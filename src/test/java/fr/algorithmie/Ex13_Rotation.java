package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="Rotation")
public class Ex13_Rotation {

	// TODO Effectuez une rotation à droite des éléments du tableau array
			// Exemple : si le tableau contient {0,1,2,3} alors il contiendra {3,0,1,2}
			// après rotation
			
			// TODO Afficher le contenu du tableau après rotation avec Resultat.log

	int [] tab2=new int [array.length];
	for(int i=0;i<tab2.length;i++) {
		if(i==0) {
			tab2[i]=array[array.length-1];
		}
		else {
			tab2[i]=array[i-1];
		}
		System.out.println(tab2[0]+" "+tab2[1]+" "+tab2[2]+" "+tab2[3]);
		Resultat.log(tab2[i]);
		
	}


		}