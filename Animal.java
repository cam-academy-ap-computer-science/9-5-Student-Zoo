public class Animal {
	private String name;
	private String food;
	private String says;
	private String type;
	
	public Animal (String name1, String food1, String says1) {
		name = name1;
		food = food1;
		says = says1;
	} 
	
	public String getName() {
		return name;
	}
	
	public String getFood() {
		return food;
	}
	
	public String getSays() {
		return says;
	}
	
	public String getType() {
		if (name instanceof Seal) {
			type = "seal";
		}
		
		if(name instanceof Whale) {
			type = "whale";
		}
		
		if (name instanceof Seagull) {
			type = "seagull";
		}
		
		return type;
	}
	
	
	public String toString() {
		return "This " + type + " named " + name + " says " + says + " and eats " + food;
	}
}
