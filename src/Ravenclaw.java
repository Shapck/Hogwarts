public class Ravenclaw extends Hogwarts{
    private int cleverness;
    private int wisdom;
    private int wit;
    private int fullOfCreativity;

    public Ravenclaw(String name, int thePowerOfSorcery, int transgressionRange, int cleverness, int wisdom, int wit, int fullOfCreativity) {
        super(name, thePowerOfSorcery, transgressionRange);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }
}
