package CoreJava;

public class overRidingExample {

	public static void main(String[] args) {
		
		RBI rbi = new RBI();
		SBI sbi = new SBI();
		Axis axis = new Axis();
		ICICI icici = new ICICI();
		
		System.out.println("According to RBI Guildlines, Rate of interest is "+rbi.getROI()+" %");
		System.out.println("SBI bank Rate of interest is "+sbi.getROI()+" %");
		System.out.println("Axis bank Rate of interest is "+axis.getROI()+" %");
		System.out.println("ICICI bank Rate of interest is "+icici.getROI()+" %");
	}

}


class RBI {
	int getROI() {
		return 8;
	}
}

class SBI extends RBI{
	int getROI() {
		return 7;
	}
}
class Axis extends RBI{
	int getROI() {
		return 6;
	}
}
class ICICI extends RBI{
	int getROI() {
		return 5;
	}
}