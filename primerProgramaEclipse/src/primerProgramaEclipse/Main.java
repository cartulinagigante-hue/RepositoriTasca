package primerProgramaEclipse;

public class Main {

	public static void main(String[] args) {
		// --- DADES personals  ---
        System.out.println("Nom i Cognoms: Daniel Gallego Prado");
        System.out.println("Presentació: Soc estudiant de programació i tinc de tornar a fer aquest treball");
        System.out.println("M'agraden les birres.");


        // "2+4" -> 2+4 (Al conncatnear dos numeros el resultat sera 2+4 ja que el tractem els digits dins de les cometes)
        System.out.println("2+4"); 
        
        // "2"+"4" -> : 24 (Unira els dos textos, no els sumarà)
        System.out.println("2" + "4"); 
        
        // 2+4 -> : 6 (Com que són números enters sense cometes, farà la suma mostrant directament el resultat)
        System.out.println(2 + 4);
	}

}
