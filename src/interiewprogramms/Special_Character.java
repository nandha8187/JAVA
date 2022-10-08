package interiewprogramms;

public class Special_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String str= "This#string%contains^special*((((((((((((characters&.";   

		str = str.replaceAll("[^a-zA-Z0-9]", " ");  
		
		System.out.println(str);  
		
		
		String str1 = "      Geeks     for    Geeks        ";
	       
		str1 = str1.replaceAll("\\s", "");
		       
		System.out.println(str1);

		
		String str3 = "a12334tyz78x";
		
		str3 = str3.replaceAll("[^\\d]", "");
		
		System.out.println(str3);
		 
		
		
		
		
		
	}

}
