
public class Main {

	public static void main(String[] args){
 
      Mensch m=new Mensch();
      
      m.reden();
      m.namenSagen();
      System.out.println(m.iQ());
      m.haarfabe();
      m.reden("hallo");
      
      
      Mensch n=new Mensch("Hagi",50,"Braun");
      
     n.reden();
      n.namenSagen();
      System.out.println(n.iQ());
      n.haarfabe();
     n.reden("hallo");
     
     Mensch o=new Mensch(n);
     
     o.reden();
     o.namenSagen();
     System.out.println(n.iQ());
     o.haarfabe();
    o.reden("hallo");
    
    Mensch p=o;
    /*Kopieren von Objekte
     * p zeigt auf o. Das heißt, wenn o verändert wird, wird auch p verändert
     */
    Lehrer l=new Lehrer("Herr Lehrer",70);
    l.namenSagen();
    l.haarfabe();
    System.out.println(l.iQ());
    Mathelehrer m1=new Mathelehrer("hh",2);
    
    m1.namenSagen();
    m1.haarfabe();
    m1.reden("blabla");
    System.out.println(m1.iQ());
    
    
    Englischlehrer el1=new Englischlehrer("hh",2);
    Englischlehrer el2=new Englischlehrer("hh",2);
    
    System.out.println(el1.kannunterrichten);
    System.out.println(el2.kannunterrichten);
    
    /*
     * 
     * static bedeutet: Diese variable ist gleich für alle Objekte
     */
    el1.kannunterrichten=false;
    
    
    System.out.println(el1.kannunterrichten);
    System.out.println(el2.kannunterrichten);
    el1.englischunterricht(el1.PAST_TENSES);
    el1.englischunterricht(el1.PRESENT_TENSES);
    el1.englischunterricht(el1.FUTURE_TENSES);
    el1.englischunterricht(123);
}

}