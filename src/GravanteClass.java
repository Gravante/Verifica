/**
 * <u> Class GravanteClass </u>
 * @author <mark> Gravante Gabriel </mark>
 * <span> CLASSE 4AI </span>
 * <i> 13/05/2020 </i>
 *
 */
public class GravanteClass {
	
	/**
	 * Costruttore della classe GravanteClass
	 */
	public GravanteClass() {
		
		
	}
	
	/**
	 * Metodo 
	 * 
	 * @param b
	 * @param e
	 * @return valore1
	 */
	public float GravanteMet(int b, int e) {
		int val1=1;
		for(int i=1; i<e;i++) {    //errore deve essere i<e e non i<=b
			val1= val1*b;
			
		}
		return val1;
	}
	
	public static void main(String[] args) {
		GravanteClass g = new GravanteClass();
		System.out.println(g.GravanteMet(2, 3));
		

	}

}
