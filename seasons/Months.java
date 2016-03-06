package com.tenthlecture.seasons;



public enum Months{
	January(1),
	February(2),
	March(3),
	April(4), 
	May(5),
	June(6),
	July(7),
	August(8),
	Septembe(9),
	October(10),
	November(11),
	December(12);
	public static Sezonie seasons;
	int ord = 0;
	Months(int ord) {
		this.ord = ord;
	}
	static void months(int ord){
		
		switch(ord){
		case 1:
			seasons = Sezonie.Winter;
			System.out.println("It's January");
			break;
		case 2:
			seasons = Sezonie.Winter;
			System.out.println("It's February");
			break;
		case 3:
			seasons = Sezonie.Spring;
			System.out.println("It's March");
			break;
		case 4:
			seasons = Sezonie.Spring;
			System.out.println("It's April");
			break;
		case 5:
			seasons = Sezonie.Spring;
			System.out.println("It's May");
			break;
		case 6:
			seasons = Sezonie.Summer;
			System.out.println("It's June");
			break;
		case 7:
			seasons = Sezonie.Summer;
			System.out.println("It's July");
			break;
		case 8:
			seasons = Sezonie.Summer;
			System.out.println("It's August");
			break;
		case 9:
			seasons = Sezonie.Autumn;
			System.out.println("It's September");
			break;
		case 10:
			
			System.out.println("It's October");
			break;
		case 11:
			seasons = Sezonie.Autumn;
			System.out.println("It's November");
			break;
		case 12:
			seasons = Sezonie.Winter;
			System.out.println("It's December");
			break;
		default: 
			System.out.println("Not a month number");
			break;	
		}
		if (seasons == Sezonie.Autumn){
			System.out.println("Common cold and rain");
		} else if (seasons == Sezonie.Winter){
			System.out.println("Scratching off ice from the car window");
		}else if (seasons == Sezonie.Spring){
			System.out.println("Allergies...");
		}else{
			//no else if - because there's plenty of beer most of the time
			System.out.println("Plenty of beer - yaaaay!");
		}

	}
	

}
