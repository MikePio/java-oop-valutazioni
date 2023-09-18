/*	con metodo main in cui create un array di 20 Studente, lo popolate con id studente progressivo (da 1 a 20), percentuale assenze e media voti generati random. 
	Per ogni elemento dell’array stampate a video l’id studente e se è promosso o bocciato.

	Prima di terminare il programma stampate a video quanti studenti sono stati promossi in tutto
 */
package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
	
		int id = 0;
		int percentualeAssenze = 0;
		float mediaVoti = 0;
		
		Random rnd = new Random();
		
		Studente[] arrayStudenti = new Studente[20];
		
		for(int i = 0; i < arrayStudenti.length; i++) {
			
			id = i;
			percentualeAssenze = rnd.nextInt(0, 101);
			mediaVoti = rnd.nextFloat(0, 5.01f);
			
			arrayStudenti[i] = new Studente(i, percentualeAssenze, mediaVoti);
			
			//stampa i dati di ogni studente
			arrayStudenti[i].getInfoStudenti(i, percentualeAssenze, mediaVoti);
		
			arrayStudenti[i].verificaPromozione(percentualeAssenze, mediaVoti);
		}
	}	
}
