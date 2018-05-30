//1. Wat wordt er op het scherm geprint?
class Demo{
	public static void main(String[] args) {
		String naam = new String("hallo");
		String uitkomst = naam.substring(1,3);
		System.out.println(naam);
		System.out.println(uitkomst);
		StringBuilder sb = new StringBuilder("hallo");
		sb.append("doei");
		System.out.println(sb);
		
		int[] getallen;
		getallen = new int[7];
		System.out.println(getallen[0]);
		
		int[] nogmeergetallen = {3,14,7,7,8,9,11};
		int[] engetallen = new int[] {3,4,5}; // mag niks in block zetten, omdat ik al achter curly brackets invulling geef.alleen bij array. 
		//int[] engetallen = new int[3] {3,4,5}; mag niet
		// array kan niet na gedefinieerde versie groter gemaakt worden. 
	//	ArrayList<String> namen = new ArrayList();
		System.out.println(nogmeergetallen[3]);
		System.out.println(nogmeergetallen.length);// lengte opvragen van de array
	}
}










	

