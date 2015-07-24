
public class Element {
private ElementType elementName;
private ElementType weakness;
private ElementType strength;
private ElementType groundAdvantage;
private ElementType groundDisadvantage;

public Element(ElementType elementIn,ElementType weaknessIn,ElementType strengthIn,ElementType groundAdvantageIn,ElementType groundDisadvantageIn )
{
	elementName = elementIn;
	weakness = weaknessIn;
	strength = strengthIn;
	groundAdvantage = groundAdvantageIn;
	groundDisadvantage = groundDisadvantageIn;
}
}
