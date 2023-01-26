public class Item {
    protected String name; //protected keeps the assignment safe
    protected String description;
    protected int value;

    public Item(String name, String description, int value){ // constructor method to initialize an object, that takes in 3 arguments
        this.name = name;
        this.description = description;
        this.value = value;
    }


    //tostring() method that returns the object name, description, and value
    public String toString(){
        return String.format("s \n====\n %s \nValue: %d \n", this.name, this.description, this.value);
    }
}
