public class Wolf extends Enemy{

    protected int speed;


    // constructor takes in no arguments
    public Wolf(int speed){
        // call in the super class 'Enemy' that passes in the name, health points and the damage
        super("Wolf", 20, 10);
        this.speed = speed;
    }


  public int getSpeed() //speed from scale of 1-10. 1 being the slowest
  {
        this.speed = speed;
        return speed;
  }

  public int getHp(){
        return hp;
  }

  public String wolfCurrent(){
          return String.format(" \n====\n %s \nHealth Points: %d \nDamage: %d \nSpeed: %d \n ", this.name, hp, damage, speed);

  }



}
