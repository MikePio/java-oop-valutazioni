//	metodo per calcolare media voti e percentuale assenze
//	e verificare se è stato promosso in base a questi dati
/*	La valutazione complessiva viene fatta sulla percentuale di assenze (da `0` a `100`) e la media dei voti (da `0` a `5`):
		- se lo studente ha fatto *più del 50% di assenze è bocciato*
		- se ha fatto *tra il 25% e il 50% di assenze* è promosso solo se la *media dei voti è superiore a `2`*
		- se ha fatto *meno del 25%* di assenze è promosso se la *media dei voti è superiore o uguale a 2*
 */	
package org.lessons.java.valutazioni;

public class Studente {

	public int id;
	public int percentualeAssenze;
	public float mediaVoti;
	
	//costruttore (ha lo stesso nome della classe)
	public Studente(int id, int percentualeAssenze, float mediaVoti) {
		this.id = id;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;
	}
	
	public void getInfoStudenti(int id, int percentualeAssenze, float mediaVoti){
		System.out.println("Id studente: " + id);
		System.out.println("Percentuale assenze studente " + id + ": " + percentualeAssenze);
		System.out.println("Media voti studente " + id + ": " + mediaVoti + "\n");
	}
	
	public void verificaPromozione() {
		
	}
	
	
//	  float calcoloMediaVoti() {
	
	  
//	  return ; }
	 
	
//	int calcoloPercentualeAssenze() {
//		
//		return ;
//	}
}
