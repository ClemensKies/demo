//1. Wat wordt er op het scherm geprint?
class Examples{
	public static void main(String[] args) {
		
		Pizza[] soort = {new Pizza("Salami"), new Pizza("Tonno"), new Pizza("Funghi"), new Pizza("Vegetables")};
		
		
		for(int x = 0; x < soort.length; x++) {
			System.out.println(soort[x].ingredient);
			
		}
				
				
	}
}
	
class Pizza{
	String ingredient;
	Pizza(String ingredient){
		this.ingredient = ingredient;
	}
}	
