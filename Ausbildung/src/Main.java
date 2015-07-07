
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
}

}