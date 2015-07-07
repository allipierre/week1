
public class Englischlehrer extends Lehrer{
	
	/*final sind constante, kann man es nicht ändern
	 * 
	 * 
	 * 
	 */
	public static final int PAST_TENSES=1;
	public static final int PRESENT_TENSES=3;
	public static final int FUTURE_TENSES=2;

	public static boolean kannunterrichten=true;//Diese Variable ist gleich für alle Objekte
	
public Englischlehrer(){
		
	}
	public Englischlehrer(String Name,int IQ){
		this.Name=Name;
		this.IQ=IQ;
	}
	
	
	public void englischunterricht(){
		System.out.println("Teach");
	}
	
	public void englischunterricht(int tens){
		if(tens==PAST_TENSES){
			System.out.println("past");
		}else if(tens==PRESENT_TENSES){
			System.out.println("present");
		}else if(tens==FUTURE_TENSES){
			System.out.println("future");
		}else{
			System.out.println("Teach");
		}
	}
}
