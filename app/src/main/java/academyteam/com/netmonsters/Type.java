package academyteam.com.netmonsters;

/**
 * Created by James on 24/07/2015.
 */
public class Type {
    public final Element element;
    public final Element weakness;
    public final Element strenght;
    public final Element groundWeakness;
    public final Element groundStrength;

    public Type(Element element) {
        this.element = element;
        switch(element) {
            case WATER:
                weakness = Element.ENERGY;
                groundWeakness = Element.ORGANIC;
                strenght = Element.FIRE;
                groundStrength = Element.EARTH;
                break;
            case  FIRE:
                weakness = Element.WATER;
                groundWeakness = Element.EARTH;
                strenght = Element.ORGANIC;
                groundStrength = Element.ENERGY;
                break;
            case  ORGANIC:
                weakness = Element.FIRE;
                groundWeakness = Element.ENERGY;
                strenght = Element.EARTH;
                groundStrength = Element.WATER;
                break;
            case EARTH:
                weakness = Element.ORGANIC;
                groundWeakness = Element.WATER;
                strenght = Element.ENERGY;
                groundStrength = Element.FIRE;
                break;
            case ENERGY:
                weakness = Element.EARTH;
                groundWeakness = Element.FIRE;
                strenght = Element.WATER;
                groundStrength = Element.ORGANIC;
                break;
            default:
                weakness = Element.NORMAL;
                groundWeakness = Element.NORMAL;
                strenght = Element.NORMAL;
                groundStrength = Element.NORMAL;
        }
    }
}
