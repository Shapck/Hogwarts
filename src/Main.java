import jdk.dynalink.linker.ConversionComparator;

public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри Поттер",95, 78),
                new Hogwarts("Гермиона Грейнджер",85,80),
                new Hogwarts("Рон Уизли",90,75),
                new Hogwarts("Драко Малфой", 70,85),
                new Hogwarts("Грэхэм Монтегю", 70,65),
                new Hogwarts("Грегори Гойл",65,50),
                new Hogwarts("Захария Смит",80,75),
                new Hogwarts("Седрик Диггори", 79,99),
                new Hogwarts("Джастин Финч-Флетчли", 45,96),
                new Hogwarts("Чжоу Чанг", 66,81),
                new Hogwarts("Падма Патил",88,73),
                new Hogwarts("Маркус Белби", 69,61)
        };

        Gryffindor [] gryffindors = {
                new Gryffindor("Гарри Поттер",95, 78,90,75,61),
                new Gryffindor("Гермиона Грейнджер",85,80,99,96,60),
                new Gryffindor("Рон Уизли",90,75,88,76,55)
        };

        Slytherin [] slytherins = {
                new Slytherin("Драко Малфой", 70,85,88,99,75,96,99),
                new Slytherin("Грэхэм Монтегю", 70,65,56,78,88,65,79),
                new Slytherin("Грегори Гойл",65,50,55,79,88,73,56)
        };

        Hufflepuff [] hufflepuff = {
                new Hufflepuff("Захария Смит",80,75,78,55,89),
                new Hufflepuff("Седрик Диггори", 79,99,98,85,45),
                new Hufflepuff("Джастин Финч-Флетчли", 45,96,76,95,87)
        };

        Ravenclaw [] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 66,81,77,55,86,93),
                new Ravenclaw("Падма Патил",88,73,45,78,99,73),
                new Ravenclaw("Маркус Белби", 69,61,77,63,91,44)
        };

        PrintService printService = new PrintService();
        printService.print(hogwarts);
        System.out.println(" ");
        printService.print(slytherins);
        System.out.println(" ");
        printService.print(gryffindors);
        System.out.println(" ");
        printService.print(ravenclaws);
        System.out.println(" ");
        printService.print(hufflepuff);

        System.out.println(" ");

        Compare compare = new Compare();
        compare.compareGryffindor(gryffindors[0],gryffindors[1]);
        System.out.println(" ");
        compare.compareSlytherin(slytherins[0],slytherins[1]);
        System.out.println(" ");
        compare.compareHufflepuff(hufflepuff[0],hufflepuff[1]);
        System.out.println(" ");
        compare.compareRavenclaw(ravenclaws[0], ravenclaws[1]);
        System.out.println(" ");
        compare.compareHogwarts(hogwarts[5],hogwarts[7]);


    }
}