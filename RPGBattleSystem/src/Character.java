public class Character {
	public String name;
	public double hitPoints;
	public double magicPoints;
	
	public void takeDamage(double damage) {
		hitPoints -= damage;
	}
}
