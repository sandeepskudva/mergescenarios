package CoreJava;

public class polymorphismExample {

	public static void main(String[] args) {
		
		PRBI rbi1 = new PRBI();
		PRBI rbi2 = new PSBI();
		PRBI rbi3 = new PAxis();
		PRBI rbi4 = new PICICI();
		
		System.out.println("According to RBI Guildlines, Rate of interest is "+rbi1.getROI()+" %" +rbi1.a);
		System.out.println("SBI bank Rate of interest is "+rbi2.getROI()+" %"+rbi2.a);
		System.out.println("Axis bank Rate of interest is "+rbi3.getROI()+" %"+rbi3.a);
		System.out.println("ICICI bank Rate of interest is "+rbi4.getROI()+" %"+rbi4.a);
	}

}


class PRBI {
	int a= 10;
	int getROI() {
		return 8;
	}
}

class PSBI extends PRBI{
	int a= 20;
	int getROI() {
		return 7;
	}
}
class PAxis extends PRBI{
	int a= 30;
	int getROI() {
		return 6;
	}
}
class PICICI extends PRBI{
	int a= 40;
	int getROI() {
		return 5;
	}
}