public class Run {
	public static void main(String[] args) {
		//create Scottie
		Character scottie = new Character();
		scottie.name = "Scottie";
		scottie.hitPoints = 100.0;
		scottie.magicPoints = 50.0;
		
		//create Mister P
		Character misterP = new Character();
		misterP.name = "Partridge";
		misterP.hitPoints = 100.0;
		misterP.magicPoints = 50.0;
		
		//attack Scottie
		scottie.takeDamage(25.0);
		
		//attack Mister P
		misterP.takeDamage(25.0);
		
		//print state
		System.out.println("Scottie HP: " + scottie.hitPoints);
		System.out.println("Mister P HP: " + misterP.hitPoints);
	}

}
