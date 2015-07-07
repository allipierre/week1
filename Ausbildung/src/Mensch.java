public class Mensch {
	
		private String Name="Namenlose";
		private int IQ=100;
		private String Harrfarbe="unbekannt";
		
		/*Überladen heißt, ich habe eine Methode mit gleichen Namen, aber mit unterschiedliche Parameter
		 * Der konstrucktor public Mensch() und public Mensch(String Name,int IQ,String Haarfarbe)
		 * überladen sich
		 */
		
		public Mensch(){
			//Standardwerte Übernehmen
			
		}
		  
		
		public Mensch(String Name,int IQ,String Haarfarbe){ //Konstructoren sind initialisierungmethoden
			this.Name=Name;
			this.IQ=IQ;
			this.Harrfarbe=Haarfarbe;
		}
		
		public void reden(String text){
			System.out.println(text);
		}
		
		public void reden(){
			System.out.println("BLABLABLA");
		}
		public void namenSagen(){
			System.out.println(Name);
		}
		public int iQ(){
			return this.IQ;
		}
		public void haarfabe(){
			System.out.println(this.Harrfarbe);
		}
		
	}
