public class Crouch extends Action{
    protected int duration;


    public Crouch(int duration){
        super(Method.Crouch, "Crouch", 'c', null);
        this.duration = duration;
    }

    public void setDuration(){
        this.duration = 2;

    }

}
