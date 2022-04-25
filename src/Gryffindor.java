public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int thePowerOfSorcery, int transgressionRange, int nobility, int honor, int courage) {
        super(name, thePowerOfSorcery, transgressionRange);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return" благородство:"+ getNobility()+ ";"+ " честь:"+ getHonor() +";"+ " храбрость:" + getCourage()+";";
    }
}
