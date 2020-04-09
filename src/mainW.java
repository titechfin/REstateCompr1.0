import java.util.ArrayList;
import java.util.Scanner;

public class mainW {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many Real Estate do you want to compare ?");
		ArrayList<Flat> FlatListe = new ArrayList<>();
		ArrayList<House> HouseListe = new ArrayList<>();

		// ------------------------------
		double price1 =1 , sqmeter1 =2,oCost1 = 3, nRent1=4,annualEntry1=5;
		Flat flat2 = new Flat(price1,sqmeter1,oCost1,nRent1,annualEntry1);
		House house2 = new House(price1,sqmeter1,oCost1,nRent1,annualEntry1);


		if(flat2.getPrise()==house2.getPrise()) {
				System.out.println("GEIL! ");
		}
		// ---------------------------------


		int anzhl = sc.nextInt();
		int i = 0;
		double price, sqmeter,oCost, nRent,annualEntry;
		int zahl;
		while (i < anzhl) {
			System.out.println("Is this a Flat or House? For a Flat press (1) for a House press (2) ");
			zahl = sc.nextInt();
			if (zahl == 1) {

				System.out.println("Flat - Price: ");
				price = sc.nextDouble();
				System.out.println("Flat - Square Meter");
				sqmeter = sc.nextDouble();
				System.out.println("Flat - other Costs ");
				oCost = sc.nextDouble();
				System.out.println("Flat - Netto Rent");
				nRent = sc.nextDouble();
				System.out.println("Flat - Annual Entry");
				annualEntry = sc.nextDouble();


				Flat flat1 = new Flat(price, sqmeter, oCost, nRent,annualEntry);
				FlatListe.add(flat1);
				i++;


			}
			if (zahl == 2) {

				System.out.println("House - Price: ");
				price = sc.nextDouble();
				System.out.println("House - Square Meter");
				sqmeter = sc.nextDouble();
				System.out.println("House - other Costs ");
				oCost = sc.nextDouble();
				System.out.println("House - Netto Rent");
				nRent = sc.nextDouble();
				System.out.println("Flat - Annual Entry");
				annualEntry = sc.nextDouble();

				House house1 = new House(price, sqmeter,oCost, nRent,annualEntry);


				HouseListe.add(house1);



				i++;


			}



		}


			System.out.println("Flat:  " + FlatListe.toString());
			System.out.println("House:  " + HouseListe.toString());





	}
}
