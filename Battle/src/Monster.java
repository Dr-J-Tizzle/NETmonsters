import java.util.Date;
import java.util.Random;


public class Monster {

	private String name;
	private ElementType bodyType;
	private ElementType attackType;
	private Date dob;
	private int power;
	private int health;
	private int currentHealth;
	private int speed;
	private int intelligence;
	private int exp;
	private int level;
	private int rareity;
	private int obedience;
	private int morality;
	private Attack attack1;
	private Attack attack2;
	private Attack special;
	private int winRatio;
	Random rand = new Random();
	
	
	public Monster (String nameIn,ElementType bodyTypeIn,ElementType attackTypeIn,Date dobIn,int powerIn,int healthIn, int currentHealthIn,int speedIn, int intelligenceIn,int expIn,int levelIn,int rareityIn,int obedienceIn,int moralityIn,Attack attack1In, Attack attack2In, Attack specialIn)
	{
		name = nameIn;
		bodyType = bodyTypeIn;
		attackType = attackTypeIn;
		dob = dobIn;
		power = powerIn;
		health = healthIn;
		currentHealth = currentHealthIn;
		speed = speedIn;
		intelligence = intelligenceIn;
		exp = expIn;
		level = levelIn;
		rareity = rareityIn;
		obedience = obedienceIn;
		morality = moralityIn;
		attack1 = attack1In;
		attack2 = attack2In;
		special = specialIn;
		winRatio = 0;
	}
	
	public Monster()
	{
		
	}
	public String getName()
	{
		return this.name;
	}
	
	public int attack(Attack attack, Monster attacker, Monster defender, ElementType element)
	{
		int damage = 0;
		for(int i = 0;i<attack.getHits();i++)
		{
			damage = damage + rand.nextInt(attack.getMaxDamage() + attack.getMinDamage()) - (int)attack.getMinDamage();
		}
		if(criticalHit())
		{
			damage = damage + damage;
		}
		return damage;
	}
	
	public Boolean Dodge()
	{
		if((rand.nextInt(100+0)-0+this.getSpeed()>50))
				{
			return true;
				}
		else{
		return false;
		}
	}
	public ElementType getBodyType() {
		return bodyType;
	}

	public void setBodyType(ElementType bodyType) {
		this.bodyType = bodyType;
	}

	public ElementType getAttackType() {
		return attackType;
	}

	public void setAttackType(ElementType attackType) {
		this.attackType = attackType;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getRareity() {
		return rareity;
	}

	public void setRareity(int rareity) {
		this.rareity = rareity;
	}

	public int getObedience() {
		return obedience;
	}

	public void setObedience(int obedience) {
		this.obedience = obedience;
	}

	public int getMorality() {
		return morality;
	}

	public void setMorality(int morality) {
		this.morality = morality;
	}

	public Attack getAttack1() {
		return attack1;
	}

	public void setAttack1(Attack attack1) {
		this.attack1 = attack1;
	}

	public Attack getAttack2() {
		return attack2;
	}

	public void setAttack2(Attack attack2) {
		this.attack2 = attack2;
	}

	public Attack getSpecial() {
		return special;
	}

	public void setSpecial(Attack special) {
		this.special = special;
	}

	public int getWinRatio() {
		return winRatio;
	}

	public void setWinRatio(int winRatio) {
		this.winRatio = winRatio;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Boolean criticalHit()
	{
		return false;
	}
}
