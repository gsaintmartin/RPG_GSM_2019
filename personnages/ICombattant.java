package personnages;

public interface ICombattant {
	
	
	
	public default int getPV() {
		
		return this.getPV();
	}
	
	public default int getLevel() {
		
		return this.getLevel();
	}
	
	public default int getForce() {
		
		return this.getForce();
	}
	
	public default int getAgilite() {
		
		return this.getAgilite();
	}
	
	public default int getIntelligence() {
		
		return this.getIntelligence();
	}
	
	public default boolean getIsAlive() {
		
		return this.getPV() > 0;
	}
	
	public void effectuerAttaquePhysique();
	
	public void effectuerAttaqueMagique();
		
	
	
	
	
	

}
