import java.util.ArrayList;

//1. Wat wordt er op het scherm geprint?
class Examples{
	public static void main(String[] args) {
		ArrayList<Huis> villa = new ArrayList<Huis>();
		villa.add(new Huis());
		villa.add(new Huis(10,20));
		villa.add(new Huis(13,25));
		
		for(Huis k: villa) {
			System.out.println(k.oppervlakte());
		}
		
	}
}

class Huis{
	int breedte;
	int lengte;
	Huis(int b, int l){
		breedte = b;
		lengte = l;
	}
	Huis(){
		
	}
	int oppervlakte() {
		return breedte *lengte;
	}
}
	


	
