// Class Ogre extends from the Enemy parent class

public class Ogre  extends Enemy{
    protected OgreTypes type; // hill or swap types




    // constructor to call the super class Enemy
    public Ogre(OgreTypes type){
        super("Ogre", 30, 20);
        this.type =type;
    }

    public OgreTypes getType(){
        return type;
    }



}
