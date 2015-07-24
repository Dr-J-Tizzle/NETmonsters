import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Monster> monsters = null;
		ArrayList<Element> elements = null;
		Scanner sc = new Scanner(System.in);
testData.attackData();
elements = testData.ElementData();
monsters = testData.monsterData();
Random rand = new Random();
int lastDamage = 0;
int input;
Monster attacker = monsters.get(rand.nextInt(8 + 0)- 0);
Monster defender = monsters.get(rand.nextInt(8 + 0)- 0);

while(attacker.getCurrentHealth()>0 && defender.getCurrentHealth()>0)
{
System.out.println(attacker.getName()+" fights "+(defender.getName()));
System.out.println(attacker.getName()+" health:"+attacker.getCurrentHealth()+ "        "+defender.getName()+" health:"+defender.getCurrentHealth());
System.out.println(attacker.getName()+" select an attack:");
System.out.println("1. "+attacker.getAttack1().getAttackName());
System.out.println("2. "+attacker.getAttack2().getAttackName());
System.out.println("3. "+attacker.getSpecial().getAttackName());
input = sc.nextInt();
if(input==1)
{
	lastDamage = attacker.attack(attacker.getAttack1(), attacker, defender, ElementType.Fire);
	defender.setCurrentHealth(defender.getCurrentHealth()-lastDamage);
	System.out.println(attacker.getName()+" uses "+attacker.getAttack1().getAttackName()+" and it causes "+lastDamage+" damage");
}
else if(input==2)
{
	lastDamage = attacker.attack(attacker.getAttack2(), attacker, defender, ElementType.Fire);
	defender.setCurrentHealth(defender.getCurrentHealth()-lastDamage);
	System.out.println(attacker.getName()+" uses "+attacker.getAttack2().getAttackName()+" and it causes "+lastDamage+" damage");
}
else if(input==3)
{
	lastDamage = attacker.attack(attacker.getSpecial(), attacker, defender, ElementType.Fire);
	defender.setCurrentHealth(defender.getCurrentHealth()-lastDamage);
	System.out.println(attacker.getName()+" uses "+attacker.getSpecial().getAttackName()+" and it causes "+lastDamage+" damage");
}
else
{
	
}
System.out.println(defender.getName()+" select an attack:");
System.out.println("1. "+defender.getAttack1().getAttackName());
System.out.println("2. "+defender.getAttack2().getAttackName());
System.out.println("3. "+defender.getSpecial().getAttackName());
input = sc.nextInt();
if(input==1)
{
	lastDamage = defender.attack(defender.getAttack1(), defender, attacker, ElementType.Fire);
	attacker.setCurrentHealth(attacker.getCurrentHealth()-lastDamage);
	System.out.println(defender.getName()+" uses "+defender.getAttack1().getAttackName()+" and it causes "+lastDamage+" damage");
}
else if(input==2)
{
	lastDamage = defender.attack(defender.getAttack2(), defender, attacker, ElementType.Fire);
	attacker.setCurrentHealth(attacker.getCurrentHealth()-lastDamage);
	System.out.println(defender.getName()+" uses "+defender.getAttack2().getAttackName()+" and it causes "+lastDamage+" damage");
}
else if(input==3)
{
	lastDamage = defender.attack(defender.getSpecial(), defender, attacker, ElementType.Fire);
	attacker.setCurrentHealth(attacker.getCurrentHealth()-lastDamage);
	System.out.println(defender.getName()+" uses "+defender.getSpecial().getAttackName()+" and it causes "+lastDamage+" damage");
}
else
{
	
}


}
if(attacker.getCurrentHealth()>0)
{
	System.out.print(attacker.getName() + " wins!!!!!!!!!");
}
else
{
	System.out.print(defender.getName() + " wins!!!!!!!!!");
}

	}

}
