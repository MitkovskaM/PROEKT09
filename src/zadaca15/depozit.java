package zadaca15;

import java.util.Scanner;

public class depozit {
static int depozit;
static int kamata;
static int depozit_posle_k;
static int depozit_edna_god;
	public static void main(String[] args) {
	Scanner tastatura=new Scanner(System.in);
	System.out.println("vnesi go pocetniot iznos na depozitot:");
	depozit = tastatura.nextInt();
	System.out.println("'Vnesi kamata");
	kamata = tastatura.nextInt();
	depozit_posle_k=(depozit/100)*kamata+depozit;
	System.out.println("Za 1 mesec");
	System.out.println("depozit_posle_k");
	System.out.println("Za 1god");
	depozit_edna_god= depozit_posle_k +((depozit/100)*kamata)*12;
	System.out.println(depozit_edna_god);
	

	
	
	
	}

}
