
public class House extends Immo {

	double prise;
	double squareMeter;
	double otherKosts;
	double nettoRent;
	double annualEntry;

	public House(double prise, double squareMeter, double otherKosts, double nettoRent, double annualEntry) {
		super(prise,squareMeter,otherKosts,nettoRent,annualEntry);
		this.prise=prise;
		this.squareMeter=squareMeter;
		this.otherKosts=otherKosts;
		this.nettoRent=nettoRent;
		this.annualEntry=annualEntry;

	}

	//BruttoRendite
	public double bruttoRendite(double prise,double nettoRent ){
		double bruttoRendite ;
		bruttoRendite = 100 * nettoRent / prise;

		return  bruttoRendite;
	}

	public double getPrise(){

		return prise;

	}

	public double nettoRendite(double prise,double otherKosts , double annualEntry ){
		double nettoRendite ;
		double investCost = prise + otherKosts;
		nettoRendite = annualEntry / investCost * 100;

		return  nettoRendite;
	}


	public String toString() {


		return "Erg: " +prise+ "," +squareMeter + " "+otherKosts +" " +nettoRent +" " + bruttoRendite(prise,nettoRent) ;
	}


}
