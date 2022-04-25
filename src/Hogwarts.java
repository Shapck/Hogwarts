public class Hogwarts {
   private String name;
   private int thePowerOfSorcery;
   private int transgressionRange;

   public Hogwarts(String name, int thePowerOfSorcery, int transgressionRange) {
      this.name = name;
      this.thePowerOfSorcery = thePowerOfSorcery;
      this.transgressionRange = transgressionRange;
   }

   public int getThePowerOfSorcery() {
      return thePowerOfSorcery;
   }

   public void setThePowerOfSorcery(int thePowerOfSorcery) {
      this.thePowerOfSorcery = thePowerOfSorcery;
   }

   public int getTransgressionRange() {
      return transgressionRange;
   }

   public void setTransgressionRange(int transgressionRange) {
      this.transgressionRange = transgressionRange;
   }

   public String getName() {
      return name;
   }

   @Override
   public String toString() {
      return "Имя:" + name +";" + " Мощность колдовства:" + thePowerOfSorcery +";"+ " расстояние трансгресии:" + thePowerOfSorcery + ";";
   }
}
