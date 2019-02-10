public class Run {
	public static void main(String[] args) {
		//create Scottie
		Character scottie = new Character();
		scottie.name = "Scottie";
		scottie.hitPoints = 100.0;

		//create Mister P
		Character misterP = new Character();
		misterP.name = "Partridge";
		misterP.hitPoints = 100.0;

		//attack Scottie
		scottie.takeDamage(25.0);

		//attack Mister P
		misterP.takeDamage(25.0);

		//print state
		scottie.display();
		misterP.display();
	}

}
