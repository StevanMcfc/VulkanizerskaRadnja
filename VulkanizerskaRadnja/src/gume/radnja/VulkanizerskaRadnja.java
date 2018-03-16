package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;


/**
 * 
 * @author StevanMcfc
 * @version 1.0
 * Klasa koja sadrzi listu guma. Nove gume se mogu dodavati, i lista se moze pretraziti
 */
public class VulkanizerskaRadnja {
	
	/**
	 * Lista objekata klase AutoGuma
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	
	/**
	 * Klasa koja dodaje gumu u listu, ako objekat nije null, ili vec postoji
	 * @param a autoGuma
	 * @throws java.lang.NullPointerException Baca ovaj exception ako je guma null
	 * @throws java.lang.RuntimeException Baca ako guma vec postoji
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
			gume.addFirst(a);
		}
	
	/**
	 * Klasa koja pronalazi gumu u listi
	 * @param markaModel vraca marku
	 * @return novaLista lista objekata
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for(int i=0;i<gume.size();i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));

			return novaLista;
	}
	
}