public class Main {
    public static void main(String[] args) {
        Gold golBar = new Gold(8); // new object of gold initialized
        Sword magicSword = new Sword(); // new object of sword initialized
        Pillow softPillow = new Pillow(); // new object of pillow initialized
        Mace bigMace = new Mace(); // new object of Mace initialized

        // The Main class should create the following objects greenOgre, redOgre, slowZombie, fastZombie, spotDog, and yourNameYourObject.
        Ogre greenOgre = new Ogre(OgreTypes.swamp); // new object of Ogre initialized
        Ogre redOgre = new Ogre(OgreTypes.hill); // new object of Ogre initialized
        Zombie slowZombie = new Zombie(); // new object of Zombie initialized
        Zombie fastZombie = new Zombie(); // new object of Zombie initialized
        Dog spotDog = new Dog(); // new object of Dog initialized
        Wolf winterWolf = new Wolf(9); // new object of wolf initialize

        //Action firstaction = new Action();
        //firstaction.setHotkey('a');

        //System.out.println(firstaction.getHotkey());

    }
}