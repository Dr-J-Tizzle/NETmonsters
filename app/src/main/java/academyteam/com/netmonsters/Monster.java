package academyteam.com.netmonsters;

import java.util.Date;

/**
 * Created by James on 24/07/2015.
 */
public class Monster {
    private String name;
    private Element bodyElement;
    private Element attackElement;
    private long dob;
    private int experience;
    private int level;
    private int rareity;
    private int evolvelevel;
    private Attack attack1;
    private Attack attack2;
    private Special special;
    private String imageFront;
    private String imageBack;
    //stats
    private int maxhealth;
    private int currenthealth;
    private int power;
    private int speed;
    private int inteligence;
    private int obedience;
    private int morality;
    private int winratio;

    public Monster(String name, String bodyElement, String attackElement, int rareity, int evolvelevel, String imageFront, String imageBack, int maxhealth, int currenthealth, long dob, int power, int speed, int inteligence, int obedience, int morality, int experience, int level, int winratio) {
        this.name = name;
        this.bodyElement = selectElement(bodyElement);
        this.attackElement = selectElement(attackElement);
        this.rareity = rareity;
        this.evolvelevel = evolvelevel;
        this.imageFront = imageFront;
        this.imageBack = imageBack;
        this.maxhealth = maxhealth;
        this.currenthealth = currenthealth;
        this.power = power;
        this.speed = speed;
        this.inteligence = inteligence;
        this.obedience = obedience;
        this.morality = morality;
        this.winratio = winratio;
        this.dob = dob;
        this.experience = experience;
        this.level = level;
    }

    public Monster(String name, Element bodyElement, Element attackElement, int rareity, int evolvelevel, String imageFront, String imageBack, int maxhealth, int power, int speed, int inteligence, int obedience, int morality) {
        this.name = name;
        this.bodyElement = bodyElement;
        this.attackElement = attackElement;
        this.rareity = rareity;
        this.evolvelevel = evolvelevel;
        this.imageFront = imageFront;
        this.imageBack = imageBack;
        this.maxhealth = maxhealth;
        currenthealth = maxhealth;
        this.power = power;
        this.speed = speed;
        this.inteligence = inteligence;
        this.obedience = obedience;
        this.morality = morality;
        winratio = 0;
        dob = new Date().getTime();
        experience = 0;
        level = 1;
    }

    private Element selectElement(String element) {
        if(element.equalsIgnoreCase(Elements.EARTH.toString()))
            return new Element(Elements.EARTH);
        if(element.equalsIgnoreCase(Elements.ENERGY.toString()))
            return new Element(Elements.ENERGY);
        if(element.equalsIgnoreCase(Elements.WATER.toString()))
            return new Element(Elements.WATER);
        if(element.equalsIgnoreCase(Elements.FIRE.toString()))
            return new Element(Elements.FIRE);
        if(element.equalsIgnoreCase(Elements.ORGANIC.toString()))
            return new Element(Elements.ORGANIC);
        else {
            return new Element(Elements.NORMAL);
        }
    }

    public String getName() { return name; }
    public Element getBodyElement() { return bodyElement; }
    public Element getAttackElement() { return attackElement; }
    public long getDob() { return dob; }
    public int getExperience() { return experience; }
    public int getLevel() { return level; }
    public int getRareity() { return rareity; }
    public int getEvolvelevel() { return evolvelevel; }
    public Attack getAttack1() { return attack1; }
    public Attack getAttack2() { return attack2; }
    public Special getSpecial() { return special; }
    public int getMaxhealth() { return maxhealth; }
    public int getCurrenthealth() {  return currenthealth; }
    public int getPower() { return power; }
    public int getSpeed() { return speed; }
    public int getInteligence() { return inteligence; }
    public int getObedience() { return obedience; }
    public int getMorality() { return morality; }
    public int getWinratio() { return winratio; }
    public String getImageFront() {return imageFront; }
    public String getImageBack() { return imageBack; }

    public void setName(String name) { this.name = name; }
    public void setBodyElement(Element bodyElement) { this.bodyElement = bodyElement; }
    public void setAttackElement(Element attackElement) { this.attackElement = attackElement; }
    public void setDob(long dob) { this.dob = dob; }
    public void setExperience(int experience) { this.experience = experience; }
    public void setLevel(int level) { this.level = level; }
    public void setRareity(int rareity) { this.rareity = rareity; }
    public void setEvolvelevel(int evolvelevel) { this.evolvelevel = evolvelevel; }
    public void setAttack1(Attack attack1) { this.attack1 = attack1; }
    public void setAttack2(Attack attack2) { this.attack2 = attack2; }
    public void setSpecial(Special special) { this.special = special; }
    public void setMaxhealth(int maxhealth) { this.maxhealth = maxhealth; }
    public void setCurrenthealth(int currenthealth) { this.currenthealth = currenthealth; }
    public void setPower(int power) { this.power = power; }
    public void setSpeed(int speed) { this.speed = speed; }
    public void setInteligence(int inteligence) { this.inteligence = inteligence; }
    public void setObedience(int obedience) { this.obedience = obedience; }
    public void setMorality(int morality) { this.morality = morality; }
    public void setWinratio(int winratio) { this.winratio = winratio; }
    public void setImageFront(String imageFront) { this.imageFront = imageFront; }
    public void setImageBack(String imageBack) { this.imageBack = imageBack; }

    public void play() {
        morality++;
        obedience++;
        speed++;
    }

    public void feed() {
        morality--;
        obedience--;
        currenthealth += maxhealth/4;
        maxhealth++;
    }

    public void clean() {
        morality += 2;
        obedience -= 2;
        inteligence++;
    }

    public void beat() {
        morality -= 2;
        obedience += 2;
        power++;
    }

    public boolean teachAttack(int slot, Attack attack) {
        switch(slot) {
            case 1 : attack1 = attack;
                break;
            case 2: attack2 = attack;
                break;
            default : return false;
        }
        return true;
    }
}