package academyteam.com.netmonsters;

import java.util.Date;

/**
 * Created by James on 24/07/2015.
 */
public class Monster {
    private String name;
    private Type bodyType;
    private Type attackType;
    private Date dob;
    private float xp;
    private int level;
    private int rareity;
    private int evolvelevel;
    private Attack attack1;
    private Attack attack2;
    private Special special;
    private String imageFront;
    private String imageBack;
    //stats
    private float maxhealth;
    private float currenthealth;
    private float attack;
    private float speed;
    private float inteligence;
    private float obedience;
    private float morality;
    private float winratio;

    public Monster() {
        //TODO implement constructor
    }

    public String getName() { return name; }
    public Type getBodyType() { return bodyType; }
    public Type getAttackType() { return attackType; }
    public Date getDob() { return dob; }
    public float getXp() { return xp; }
    public int getLevel() { return level; }
    public int getRareity() { return rareity; }
    public int getEvolvelevel() { return evolvelevel; }
    public Attack getAttack1() { return attack1; }
    public Attack getAttack2() { return attack2; }
    public Special getSpecial() { return special; }
    public float getMaxhealth() { return maxhealth; }
    public float getCurrenthealth() {  return currenthealth; }
    public float getAttack() { return attack; }
    public float getSpeed() { return speed; }
    public float getInteligence() { return inteligence; }
    public float getObedience() { return obedience; }
    public float getMorality() { return morality; }
    public float getWinratio() { return winratio; }
    public String getImageFront() {return imageFront; }
    public String getImageBack() { return imageBack; }

    public void setName(String name) { this.name = name; }
    public void setBodyType(Type bodyType) { this.bodyType = bodyType; }
    public void setAttackType(Type attackType) { this.attackType = attackType; }
    public void setDob(Date dob) { this.dob = dob; }
    public void setXp(float xp) { this.xp = xp; }
    public void setLevel(int level) { this.level = level; }
    public void setRareity(int rareity) { this.rareity = rareity; }
    public void setEvolvelevel(int evolvelevel) { this.evolvelevel = evolvelevel; }
    public void setAttack1(Attack attack1) { this.attack1 = attack1; }
    public void setAttack2(Attack attack2) { this.attack2 = attack2; }
    public void setSpecial(Special special) { this.special = special; }
    public void setMaxhealth(float maxhealth) { this.maxhealth = maxhealth; }
    public void setCurrenthealth(float currenthealth) { this.currenthealth = currenthealth; }
    public void setAttack(float attack) { this.attack = attack; }
    public void setSpeed(float speed) { this.speed = speed; }
    public void setInteligence(float inteligence) { this.inteligence = inteligence; }
    public void setObedience(float obedience) { this.obedience = obedience; }
    public void setMorality(float morality) { this.morality = morality; }
    public void setWinratio(float winratio) { this.winratio = winratio; }
    public void setImageFront(String imageFront) { this.imageFront = imageFront; }
    public void setImageBack(String imageBack) { this.imageBack = imageBack; }
}