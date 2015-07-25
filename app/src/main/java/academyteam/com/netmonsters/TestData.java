package academyteam.com.netmonsters;

import java.util.ArrayList;
import java.util.Date;


public class TestData {
	static ArrayList<Monster> monsterData = new ArrayList();
	static ArrayList<Attack> attackData = new ArrayList();
	static Date date;

	public static void attackData()
	{
		attackData.add(new Attack("Lazer Geyser", 7, 3, 1, null));
		attackData.add(new Attack("Crabs", 3, 1, 3, null));
		attackData.add(new Attack("Ocean Torment", 15, 5, 1, new Effect("Ocean Torment")));
		attackData.add(new Attack("Poison", 12, 2, 1, null));
		attackData.add(new Attack("Tackle", 3, 1, 3, null));
		attackData.add(new Attack("Cthulu", 3, 1, 3, new Effect("Rush")));
		attackData.add(new Attack("Spud Gun", 2, 1, 5, null));
		attackData.add(new Attack("Fat Lazy Bastard", 8, 2, 1, null));
		attackData.add(new Attack("Chips", 1, 5, 6, new Effect("Acne")));
		attackData.add(new Attack("Gas Chamber", 5, 5, 1, null));
		attackData.add(new Attack("Octopus Reich", 5, 1, 2, null));
		attackData.add(new Attack("Axis of Squid", 8, 3, 3, new Effect("Ocean Torment")));
		attackData.add(new Attack("Cuddles", 7, 3, 3, null));
		attackData.add(new Attack("Scratch", 12, 1, 1, null));
		attackData.add(new Attack("Cuteness Overload", 5, 1, 10, new Effect("Heart Melt")));
		attackData.add(new Attack("Diabetes", 4, 1, 5, null));
		attackData.add(new Attack("Spaz Out", 13, 1, 1, null));
		attackData.add(new Attack("Obesity", 6, 3, 6, new Effect("Morbid Obesity")));
		attackData.add(new Attack("Sword", 3, 1, 3, null));
		attackData.add(new Attack("Battered Mars Bar", 3, 1, 3, null));
		attackData.add(new Attack("The Quickening", 3, 1, 3, new Effect("Quickening")));
		attackData.add(new Attack("Ooze", 3, 1, 3, null));
		attackData.add(new Attack("Itch", 11, 1, 1, null));
		attackData.add(new Attack("Cottage Cheese", 12, 8, 2, new Effect("Cottage Cheese")));
	}

	public static ArrayList<Monster> monsterData()
	{
		Element water = new Element(Elements.WATER);
		Element fire = new Element(Elements.FIRE);
		Element earth = new Element(Elements.EARTH);
		Element organic = new Element(Elements.ORGANIC);
		Element energy = new Element(Elements.ENERGY);
		monsterData.add(new Monster("RoboCatFish", water, fire, date.getTime(), 6, 100, 100, 7, 3, 0, 2, 5, 1, 9, attackData.get(0), attackData.get(1),  attackData.get(2)));
		monsterData.add(new Monster("Kathulu", earth, earth, date.getTime(), 8, 100, 100, 4, 4, 4, 0, 5, 3, 1,  attackData.get(3),  attackData.get(4),  attackData.get(5)));
		monsterData.add(new Monster("Potato", organic, earth, date.getTime(), 6, 100, 100, 1, 9, 0, 1, 1, 7, 4,  attackData.get(6),  attackData.get(7),  attackData.get(8)));
		monsterData.add(new Monster("Tentacle Hitler", energy, fire, date.getTime(), 3, 100, 100, 0, 3, 6, 4, 4, 6, 9,  attackData.get(9),  attackData.get(10),  attackData.get(11)));
		monsterData.add(new Monster("Business Cat", organic, water, date.getTime(), 10, 100, 100, 10, 10, 10, 10, 10, 10, 10,  attackData.get(12),  attackData.get(13),  attackData.get(14)));
		monsterData.add(new Monster("Energy Drink", fire, energy, date.getTime(), 9, 100, 100, 5, 0, 1, 4, 3, 2, 2,  attackData.get(15),  attackData.get(16), attackData.get(17)));
		monsterData.add(new Monster("Highlander", water, organic, date.getTime(), 1, 100, 100, 7, 0, 2, 6,4, 9, 2,  attackData.get(18),  attackData.get(19),  attackData.get(20)));
		monsterData.add(new Monster("Discharge", energy, energy, date.getTime(), 2, 100, 100, 7, 0, 2, 4, 1, 6, 7,  attackData.get(21),  attackData.get(22),  attackData.get(23)));
		return monsterData;
	}
}