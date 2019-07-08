package personnages;

public abstract class Characters {

	protected String type;

	protected int currentHP;

	protected int maxHP;

	protected int xpPoints;

	protected int thresholdLevelup;

	protected int currentLevel;

	protected int strength;

	protected int agility;

	protected int intelligence;
	
	protected boolean alive = true;

	public Characters(String type, int currentHP, int maxHP, int xpPoints, int thresholdLevelup, int currentLevel,
			int strength, int agility, int intelligence, boolean alive) {
		super();
		this.type = type;
		this.currentHP = currentHP;
		this.maxHP = maxHP;
		this.xpPoints = xpPoints;
		this.thresholdLevelup = thresholdLevelup;
		this.currentLevel = currentLevel;
		this.strength = strength;
		this.agility = agility;
		this.intelligence = intelligence;
		this.alive = alive;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getCurrentHP() {
		return currentHP;
	}

	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(int maxHealthPoints) {
		this.maxHP = maxHealthPoints;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getXpPoints() {
		return xpPoints;
	}

	public void setXpPoints(int xpPoints) {
		this.xpPoints = xpPoints;
	}

	public int getThresholdLevelup() {
		return thresholdLevelup;
	}

	public void setThresholdLevelup(int thresholdLevelup) {
		this.thresholdLevelup = thresholdLevelup;
	}

	public int getCurrentLevel() {
		return currentLevel;
	}

	public void setCurrentLevel(int currentLevel) {
		this.currentLevel = currentLevel;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public void displayStatus() {

		System.out.println("___________________________________");  
		System.out.println("            " + getType() +"               ");
		System.out.println("------------ NIVEAU " + getCurrentLevel() + " ------------");
		System.out.println("___________________________________"  + "\n");
		System.out.println(" Force : " + getStrength() + "\n" + " Agilité : " + getAgility() + "\n" + " Intelligence : "
				+ getIntelligence() + "\n" + " Points de vie : " + getCurrentHP() +  " sur " + getMaxHP() + "\n" );
	System.out.println("___________________________________" + "\n");  

	}
	
	public abstract void checkLevelUp(Characters player);

}
