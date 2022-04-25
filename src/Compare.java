public class Compare {

    public  void compareGryffindor(Gryffindor gryffindors1, Gryffindor gryffindors2 ){
        int result1 = gryffindors1.getCourage() + gryffindors1.getHonor() + gryffindors1.getNobility();
        int result2 = gryffindors2.getCourage() + gryffindors2.getHonor() + gryffindors2.getNobility();
        if(result1>result2){
            System.out.println(gryffindors1.getName() + " лучший Гриффиндорец чем " + gryffindors2.getName());
        }
        else {
            System.out.println(gryffindors2.getName() + " лучший Гриффиндорец чем " + gryffindors1.getName());
        }
    }

    public  void compareSlytherin(Slytherin slytherin1, Slytherin slytherin2 ){
        int result1 = slytherin1.getAmbition() + slytherin1.getResourcefulness() + slytherin1.getCane() + slytherin1.getDetermination() + slytherin1.getLustForPower() + slytherin1.getResourcefulness();
        int result2 = slytherin1.getAmbition() + slytherin1.getResourcefulness() + slytherin1.getCane() + slytherin1.getDetermination() + slytherin1.getLustForPower() + slytherin1.getResourcefulness();
        if(result1>result2){
            System.out.println(slytherin1.getName() + " лучший Слизеринец чем " + slytherin2.getName());
        }
        else {
            System.out.println(slytherin2.getName() + " лучший Слизеринец чем " + slytherin1.getName());
        }
    }

    public  void compareRavenclaw(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2 ){
        int result1 = ravenclaw1.getCleverness() + ravenclaw1.getWisdom() + ravenclaw1.getFullOfCreativity() + ravenclaw1.getWit();
        int result2 = ravenclaw2.getCleverness() + ravenclaw2.getWisdom() + ravenclaw2.getFullOfCreativity() + ravenclaw2.getWit();
        if(result1>result2){
            System.out.println(ravenclaw1.getName() + " лучший Когтевранец чем " + ravenclaw2.getName());
        }
        else {
            System.out.println(ravenclaw2.getName() + " лучший Когтевранец чем  " + ravenclaw1.getName());
        }
    }

    public  void compareHufflepuff(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2){
        int result1 = hufflepuff1.getHonesty() + hufflepuff1.getLoyalty() + hufflepuff1.getIndustriousness();
        int result2 = hufflepuff2.getHonesty() + hufflepuff2.getLoyalty() + hufflepuff2.getIndustriousness();
        if(result1>result2){
            System.out.println(hufflepuff1.getName() + " лучший Пуффендуец чем " + hufflepuff2.getName());
        }
        else {
            System.out.println(hufflepuff2.getName() + " лучший Пуффендуец чем " + hufflepuff1.getName());
        }
    }

    public  void compareHogwarts(Hogwarts hogwarts1, Hogwarts hogwarts2){
        int result1 = hogwarts1.getThePowerOfSorcery() + hogwarts1.getTransgressionRange();
        int result2 = hogwarts2.getThePowerOfSorcery() + hogwarts2.getTransgressionRange();
        if(result1>result2){
            System.out.println(hogwarts1.getName() + " лучший ученик Хогвартса чем " + hogwarts2.getName());
        }
        else {
            System.out.println(hogwarts2.getName() + " лучший ученик Хогвартса чем " + hogwarts1.getName());
        }
    }

}
