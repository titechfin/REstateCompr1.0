

public class Immo {
	
	double prise;
	double squareMeter;
	double otherKosts;
	double nettoRent;
	double annualEntry;

	public Immo(double prise , double squareMeter, double otherKosts, double nettoRent, double annualEntry) {
		this.prise=prise;
		this.squareMeter=squareMeter;
		this.otherKosts=otherKosts;
		this.nettoRent=nettoRent;
		this.annualEntry=annualEntry;
	}

	//BruttoRendite
	//https://www.interhyp.de/bauen-kaufen/kapitalanlage/rendite-berechnen-fuer-die-immobilie.html
	public double bruttoRendite(double prise,double nettoRent ){
		double bruttoRendite ;
		bruttoRendite = 100 * nettoRent / prise;

		return  bruttoRendite;
	}
	public double nettoRendite(double prise,double otherKosts , double annualEntry ){
		double nettoRendite ;
		double investCost = prise + otherKosts;
		nettoRendite = annualEntry / investCost * 100;

		return  nettoRendite;
	}




	public double getPrise(){

		return prise;

	}


	public String toString() {
			
		
		return "Erg: " +prise+ "," +squareMeter + " "+otherKosts +" " +nettoRent +" " + bruttoRendite(prise,nettoRent) ;
	}
		

}
