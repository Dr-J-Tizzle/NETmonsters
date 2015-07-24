
public class Attack {

	private String attackName;
	private int maxDamage;
	private int minDamage;
	private int hits;
	private Effect effect;
	
	public Attack(String attack, int max, int min, int noOfHits, Effect effectIn )
	{
		attackName = attack;
		maxDamage = max;
		minDamage = min;
		hits = noOfHits;
		effect = effectIn;
	}

	public String getAttackName() {
		return attackName;
	}

	public void setAttackName(String attackName) {
		this.attackName = attackName;
	}

	public int getMaxDamage() {
		return maxDamage;
	}

	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}

	public int getMinDamage() {
		return minDamage;
	}

	public void setMinDamage(int minDamage) {
		this.minDamage = minDamage;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public Effect getEffect() {
		return effect;
	}

	public void setEffect(Effect effect) {
		this.effect = effect;
	}
	
}
