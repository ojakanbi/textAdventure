public class Gold extends Item{
    private int amt;



    public Gold(int amt){ // constructor to initialize value as amt
        super("Gold", String.format("A round coin with %s stamped on the front", String.valueOf(amt)), amt);
        this.amt = amt;
    }
}
