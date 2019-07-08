package personnages;

public class Gobelin extends Monsters {

	public Gobelin(int level) {
		super("GOBELIN", 75, 75, 0, 0, 1, 7, 8, 6, true);
	
		System.out.println( "Un " + getType() + " est apparu." + "\n" );
		
		double levelUp = level * 0.1;
		double levelHealth = level * 0.1;
		
		this.setCurrentHP(getCurrentHP() + (int)(getCurrentHP() * levelHealth));
		this.setMaxHP((getMaxHP() + (int)(getMaxHP() * levelHealth)));
		this.setAgility((getAgility()) + (int)(getAgility() * levelUp));
		this.setIntelligence((getIntelligence()) + (int)(getIntelligence() * levelUp));
		this.setStrength((getStrength()) + (int)(getStrength() * levelUp));
		
		this.setCurrentLevel(level);
		
		
		displayStatus();}
	

	@Override
	public void checkLevelUp(Characters player) {
	
		
	}
}
