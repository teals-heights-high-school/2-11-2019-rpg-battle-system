public class Character {
	public String name;
	public double hitPoints;

	public void takeDamage(double attackPower) {
		hitPoints -= attackPower;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Hit Points: " + hitPoints);
		System.out.println();
	}
}
