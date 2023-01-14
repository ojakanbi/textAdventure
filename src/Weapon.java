//weapons inherits from the base class Items
public class Weapon extends Item{
    private int damage; // variable damage that holds in an integer

    public int getDamage(){ //getter that gets the property damage
        return damage;
    }

    public void setDamage(int damage){ //setter that sets the object damage
        this.damage = damage;
    }

    public Weapon(String name, String description, int value, int damage){ //constructor that initialize the damage and extends from the item  class
        super(name, description, value);
        this.damage = damage;
    }
//String format contains substitution characters {0}.. and contains the new line "\n"
    public String str(){
        return String.format("{0}\n====\n{1}\nValue: {2}\nDamgae: {3}", this.name, this.description, this.value, this.damage);
    }

}
