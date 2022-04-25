public class Slytherin extends Hogwarts {
    private int cane;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int thePowerOfSorcery, int transgressionRange, int cane, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, thePowerOfSorcery, transgressionRange);
        this.cane = cane;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCane() {
        return cane;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
}
