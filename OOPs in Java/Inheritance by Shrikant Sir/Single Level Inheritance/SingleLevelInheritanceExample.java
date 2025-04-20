package Principle_Of_Oop;

public class Country {
	private String name;
	private String language;
	private int countryCode;
	private String president;
	private String primeMinister;
	private double population;
	private String currency;
	private int states;

	public Country() {
		super();
	}

	public Country(String name, String language, int countryCode, String president, String primeMinister,
			double population, String currency, int states) {
		super();
		this.name = name;
		this.language = language;
		this.countryCode = countryCode;
		this.president = president;
		this.primeMinister = primeMinister;
		this.population = population;
		this.currency = currency;
		this.states = states;
	}

	public void displayCountry() {
		System.out.println("Country Details");
		System.out.println("Name: " + name);
		System.out.println("Language: " + language);
		System.out.println("Country Code: " + countryCode);
		System.out.println("President: " + president);
		System.out.println("Prime Minister: " + primeMinister);
		System.out.println("Population: " + population);
		System.out.println("Currency: " + currency);
		System.out.println("States: " + states);
	}
}

class State extends Country {
	private String name;
	private String cm;
	private int districts;
	private String language;
	private double area;
	private double pop;

	public State() {
		super();
	}

	public State(String name1, String language, int countryCode, String president, String primeMinister,
			double population, String currency, int states, String name, String cm, int districts, String language1,
			double area, double pop) {
		super(name1, language, countryCode, president, primeMinister, population, currency, states);
		this.name = name;
		this.cm = cm;
		this.districts = districts;
		this.language = language1;
		this.area = area;
		this.pop = pop;
	}

	public void displayState() {
		System.out.println();
		System.out.println("State Details");
		System.out.println("Name: " + name);
		System.out.println("Language: " + language);
		System.out.println("CM: " + cm);
		System.out.println("Districts: " + districts);
		System.out.println("Area: " + area);
		System.out.println("Population: " + pop);
	}
}

class SingleLevelInheritanceExample {
	public static void main(String[] args) {
		State obj = new State("India", "Hindi", 91, "Murmu", "Modi",
				87978786446L, "Rupees", 29, "Maharashtra", "Devendra", 36, "Marathi", 353456, 8568645646L);

		obj.displayState();
		System.out.println();
		obj.displayCountry();
	}
}
