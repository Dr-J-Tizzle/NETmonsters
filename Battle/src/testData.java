import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class testData {
static ArrayList<Monster> monsterData = new ArrayList();
static ArrayList<Element> elementData = new ArrayList();
static ArrayList<Attack> attackData = new ArrayList();
static Calendar calendar = Calendar.getInstance();
static Date date;
public static ArrayList<Element> ElementData()
{
	elementData.add(new Element(ElementType.Fire, ElementType.Earth, ElementType.Ice, ElementType.Organic, ElementType.Energy));
	elementData.add(new Element(ElementType.Ice, ElementType.Fire, ElementType.Water, ElementType.Organic, ElementType.Earth));
	elementData.add(new Element(ElementType.Organic, ElementType.Energy, ElementType.Earth, ElementType.Fire, ElementType.Ice));
	elementData.add(new Element(ElementType.Earth, ElementType.Organic, ElementType.Fire, ElementType.Ice, ElementType.Energy));
	elementData.add(new Element(ElementType.Energy, ElementType.Water, ElementType.Organic, ElementType.Earth, ElementType.Fire));
	elementData.add(new Element(ElementType.Water, ElementType.Ice, ElementType.Energy, ElementType.Earth, ElementType.Fire));
	
	return elementData;
}
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
		monsterData.add(new Monster("RoboCatFish", ElementType.Water, ElementType.Fire, date = calendar.getTime(), 6, 100, 100, 7, 3, 0, 2, 5, 1, 9, attackData.get(0), attackData.get(1),  attackData.get(2)));
		monsterData.add(new Monster("Kathulu", ElementType.Earth, ElementType.Earth, date = calendar.getTime(), 8, 100, 100, 4, 4, 4, 0, 5, 3, 1,  attackData.get(3),  attackData.get(4),  attackData.get(5)));
		monsterData.add(new Monster("Potato", ElementType.Organic, ElementType.Earth, date = calendar.getTime(), 6, 100, 100, 1, 9, 0, 1, 1, 7, 4,  attackData.get(6),  attackData.get(7),  attackData.get(8)));
		monsterData.add(new Monster("Tentacle Hitler", ElementType.Energy, ElementType.Fire, date = calendar.getTime(), 3, 100, 100, 0, 3, 6, 4, 4, 6, 9,  attackData.get(9),  attackData.get(10),  attackData.get(11)));
		monsterData.add(new Monster("Business Cat", ElementType.Organic, ElementType.Ice, date = calendar.getTime(), 10, 100, 100, 10, 10, 10, 10, 10, 10, 10,  attackData.get(12),  attackData.get(13),  attackData.get(14)));
		monsterData.add(new Monster("Energy Drink", ElementType.Fire, ElementType.Energy, date = calendar.getTime(), 9, 100, 100, 5, 0, 1, 4, 3, 2, 2,  attackData.get(15),  attackData.get(16), attackData.get(17)));
		monsterData.add(new Monster("Highlander", ElementType.Ice, ElementType.Organic, date = calendar.getTime(), 1, 100, 100, 7, 0, 2, 6,4, 9, 2,  attackData.get(18),  attackData.get(19),  attackData.get(20)));
		monsterData.add(new Monster("Discharge", ElementType.Energy, ElementType.Energy, date = calendar.getTime(), 2, 100, 100, 7, 0, 2, 4, 1, 6, 7,  attackData.get(21),  attackData.get(22),  attackData.get(23)));
		return monsterData;
	}
}
