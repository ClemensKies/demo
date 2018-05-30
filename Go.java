
public class Go {
	public static void main(String[] args) {
		int r = 44;
		Koffie koffie = new Koffie();
		koffie.temperatuur = 34;
		verkopen(koffie.temperatuur); // argument = waarde dus tussen haakjes van verkopen kan ik de argumenten invullen. JE mag niet declareren in de aanroep. 
		System.out.println("in main" + r);
		leeglopen(koffie); // kan normaal gesproken niet, omdat het een integer, getal moet zijn
		System.out.println(koffie.temperatuur);
	}
	static void verkopen(int inhoud) { // parameter = variabele    // signature = aantal parameters, type parameters en de volgorde. Krijg compiler error als ik meer argumenten invul dan parameters die ik heb
		System.out.println("werkt" + inhoud); 
		}
	static void leeglopen(Koffie k) {
		System.out.println("in leeglopen" + k.temperatuur);
		k.temperatuur = 44;
	}
}	

class Koffie {
	int temperatuur;
}

// eligible for garbage collection
// Koffie koffie = new koffie(); object a
// Koffie koffie = new koffie2(); object b en overschrijft object a. M.a.w. objet is niet meer bereikbaar.
// een variabele naam (koffie) kan verwijzen naar slechts 1 object.
// Je weet niet wanneer het object wordt opgeruimd. HEt is niet zeker wanneer dat gebeurt. Je weet alleen zeker dat hij gemarkeerd wordt met een vinkje, dus garbage. 
// in java kan je objecten niet bij elkaar optellen.