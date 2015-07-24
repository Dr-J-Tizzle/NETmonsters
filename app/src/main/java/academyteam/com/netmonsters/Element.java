package academyteam.com.netmonsters;

/**
 * Created by James on 24/07/2015.
 */
public class Element {
    public final Elements element;
    public final Elements weakness;
    public final Elements strenght;
    public final Elements groundWeakness;
    public final Elements groundStrength;

    public Element(Elements element) {
        this.element = element;
        switch(element) {
            case WATER:
                weakness = Elements.ENERGY;
                groundWeakness = Elements.ORGANIC;
                strenght = Elements.FIRE;
                groundStrength = Elements.EARTH;
                break;
            case  FIRE:
                weakness = Elements.WATER;
                groundWeakness = Elements.EARTH;
                strenght = Elements.ORGANIC;
                groundStrength = Elements.ENERGY;
                break;
            case  ORGANIC:
                weakness = Elements.FIRE;
                groundWeakness = Elements.ENERGY;
                strenght = Elements.EARTH;
                groundStrength = Elements.WATER;
                break;
            case EARTH:
                weakness = Elements.ORGANIC;
                groundWeakness = Elements.WATER;
                strenght = Elements.ENERGY;
                groundStrength = Elements.FIRE;
                break;
            case ENERGY:
                weakness = Elements.EARTH;
                groundWeakness = Elements.FIRE;
                strenght = Elements.WATER;
                groundStrength = Elements.ORGANIC;
                break;
            default:
                weakness = Elements.NORMAL;
                groundWeakness = Elements.NORMAL;
                strenght = Elements.NORMAL;
                groundStrength = Elements.NORMAL;
                break;
        }
    }
}
