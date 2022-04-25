public class PrintService {

    public void print(Hogwarts [] hogwarts){
        for (int i = 0; i < hogwarts.length; i++) {
            Hogwarts hogwarts1 = hogwarts[i];
            System.out.println("Имя:" + hogwarts1.getName() + ";" + " Мощность колдовства:" + hogwarts1.getThePowerOfSorcery() + ";" + " расстояние трансгресии:" + hogwarts1.getTransgressionRange() + ";");
        }
    }

    public void print(Slytherin [] slytherins){
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя: " + slytherin.getName()+ ";" + " Мощность колдовства: " + slytherin.getThePowerOfSorcery() + ";" + " расстояние трансгресии: " + slytherin.getTransgressionRange()+ ";" + " хитрость:" +slytherin.getCane()+ ";" + " решительность:"+ slytherin.getDetermination() +";"+ " амбициозность:" + slytherin.getAmbition() + " жажда власти:" + slytherin.getLustForPower()+";"+ " находчивость:" +slytherin.getResourcefulness()+";" );
        }
    }

    public void print(Gryffindor [] gryffindors){
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя:" + gryffindor.getName() + ";" + " Мощность колдовства:" + gryffindor.getThePowerOfSorcery() + ";" + " расстояние трансгресии:" + gryffindor.getTransgressionRange() + ";"+ " благородство:"+ gryffindor.getNobility()+ ";"+ " честь:"+ gryffindor.getHonor() +";"+ " храбрость:" +gryffindor.getCourage()+";");
        }
    }

    public void print(Hufflepuff [] hufflepuffs){
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя:" + hufflepuff.getName() + ";" + " Мощность колдовства:" + hufflepuff.getThePowerOfSorcery() + ";" + " расстояние трансгресии:" + hufflepuff.getTransgressionRange() + ";" + " трудолюбие:"+hufflepuff.getIndustriousness()+ ";"+ " верность:" +hufflepuff.getLoyalty()+ ";"+ " четсность:" + hufflepuff.getHonesty()+ ";");
        }
    }

    public void print(Ravenclaw[] ravenclaws){
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя:" + ravenclaw.getName() + ";" + " Мощность колдовства:" + ravenclaw.getThePowerOfSorcery() + ";" + " расстояние трансгресии:" + ravenclaw.getTransgressionRange() + ";" + " умность:"+ ravenclaw.getCleverness()+ " мудрость:" + ravenclaw.getWisdom()+ ";"+ " остроумность:" + ravenclaw.getWit()+ ";" + " полнота творчества:" + ravenclaw.getFullOfCreativity()+";");
        }
    }


}
