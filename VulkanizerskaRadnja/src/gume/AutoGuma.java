package gume;
/**
 * 
 * Klasa koja opisuje automobilsku gumu atributima markaModel, precnik, sirina i visina.
 * @author StevanMcfc
 * @version 1.0
 * 
 *
 */
public class AutoGuma {
	
	
		/**
		 * Atribut koji prikazuje marku/model gume
		 */
		private String markaModel = null;
		
		/**
		 * Atribut koji prikazuje precnik gume
		 */
		private int precnik = 0;
		
		/**
		 * Atribut koji prikazuje sirinu gume
		 */
		private int sirina = 0;
		
		/**
		 * Atribut koji prikazuje visinu gume
		 */
		private int visina = 0;
		
		
		/**
		 * Metoda koja vraca marku/model
		 * @return naziv marke/modela
		 */
		public String getMarkaModel() {
			return markaModel;
		}
		
		/**
		 * Metoda kojom se stavlja nova vrednost marke/modela
		 * @throws java.lang.RuntimeException ako je vrednost markeModela null, ili ako je duzina stringa manja od 3
		 * @param markaModel Marka/model gume
		 */
		public void setMarkaModel(String markaModel) {
			if (markaModel==null || markaModel.length()<3)
					throw new RuntimeException("Morate uneti marku i model");
			this.markaModel = markaModel;
		}
		
		/**
		 * Metoda koja vraca precnik
		 * @return precnik
		 */
		public int getPrecnik() {
			return precnik;
		}
		
		/**
		 * Metoda kojom se stavlja nova vrednost precnika
		 * @throws java.lang.RuntimeException ako je vrednost precnika manja od 13 ili veca od 23
		 * @param precnik precnik gume
		 */
		public void setPrecnik(int precnik) {
			if (precnik < 13 || precnik > 22)
					throw new RuntimeException("Precnik van opsega");
			this.precnik = precnik;
		}
		
		/**
		 * Metoda koja vraca sirinu
		 * @return sirina
		 */
		public int getSirina() {
			return sirina;
		}
		
		/**
		 * Metoda kojom se stavlja nova vrednost sirine
		 * @throws java.lang.RuntimeException ako je vrednost sirine manja od 135 ili veca od 355 
		 * @param sirina sirina gume
		 */
		public void setSirina(int sirina) {
			if (sirina < 135 || sirina > 355)
					throw new RuntimeException("Sirina van opsega");
			this.sirina = sirina;
		}
		
		/**
		 * Metoda koja vraca visinu
		 * @return visina
		 */
		public int getVisina() {
			return visina;
		}
		
		/**
		 * Metoda kojom se stavlja nova vrednost visine
		 * @throws java.lang.RuntimeException ako je vrednost visine manja od 25 ili veca od 95
		 * @param visina visina gume
		 */
		public void setVisina(int visina) {
			if (visina < 25 || visina > 95)
				throw new RuntimeException("Visina van opsega");
		this.visina = visina;
		}
		
		/**
		 * Metoda koja pretvara klasu u string
		 * @return string svih atributa
		 */
		@Override
		public String toString() {
			return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina=" + visina + "]";
		}
		
		/**
		 * Metoda koja poredi dva objekta klase AutoGuma, tj njihove atribute markaModel, precnik, visina, i sirina
		 * @return true ako su svi parametri jednaki
		 * @return false ako je neki od parametara razlicit
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
			return true;
			if (obj == null)
			return false;
			if (getClass() != obj.getClass())
			return false;
			AutoGuma other = (AutoGuma) obj;
			if (markaModel == null) {
			if (other.markaModel != null)
			return false;
			
			} else if (!markaModel.equals(other.markaModel))
			return false;
			if (precnik != other.precnik)
			return false;
			if (sirina != other.sirina)
			return false;
			if (visina != other.visina)
			return false;
			return true;
		}
}
