package personnages;

public class Orc extends Monsters {

	
	public Orc(int level) {
		super("ORC", 100, 100, 0, 0, 1, 12, 4, 2, true);
		
		
	
		System.out.println( "Un " + getType() + " est apparu." + "\n" );
		
		double levelUp = level * 0.1;
		double levelHealth = level * 0.1;
		
		this.setCurrentHP(getCurrentHP() + (int)(getCurrentHP()  * levelHealth));
		this.setMaxHP((getMaxHP() + (int)(getMaxHP() * levelHealth)));
		this.setAgility((getAgility()) + (int)(getAgility() * levelUp));
		this.setIntelligence((getIntelligence()) + (int)(getIntelligence() * levelUp));
		this.setStrength((getStrength()) + (int)(getStrength() * levelUp));
		
		this.setCurrentLevel(level);
		
		
		displayStatus();}
		


	
	
	public void checkLevelUp(Characters player) {
		
	}
	
}
