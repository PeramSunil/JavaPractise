package Inhetritance;



class Bank{
	double roi() {
		return 0;
	}
}
class ICICI extends Bank{
	double roi() {
		return 10.5;
		
	}
}
class SBI extends Bank{
	double roi() {
		return 11.4;
		
	}
}

public class Overriding {

	public static void main(String[] args) {
		ICICI ic= new ICICI();
		double b=ic.roi();
		System.out.println("Rate of Interest in ICICI : " + b);
		SBI s = new SBI();
		double sb= s.roi();
		System.out.println("Rate of Interest in SBI : " + sb);
	}

}
