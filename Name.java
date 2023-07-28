import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner console = new Scanner(System.in);
	        String nom;
	        
	        System.out.print("Escribe tu nombre: ");
	        nom = console.next();
	        
	        System.out.println(nom);
	       System.out.println(nom.length());
	       int i=0;
	       for(i=0; i < nom.length(); i++) {
				System.out.println(nom.charAt(i));
			}
	}

}
