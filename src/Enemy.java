public class Enemy {

    //class level Variables
    // Access Modifier Protected means children/sub classes have access
    protected String name;
    protected int damage;
    protected int hp;



    // Constructor method: return no value, accepts three input arguments
    // Constructor method  could be overloaded,keywords are current methods properties
    public Enemy(String name, int hp, int damage){
        this.name = name;
        this.damage = damage;
        this.hp = hp;
    }
    // Health check method: returns a boolean(True or false) if the enemy is greater than 0
    public boolean is_alive(){
        return (this.hp > 0);
    }


}
