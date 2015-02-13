package jackson_test;


public class Birthday {
   private String birthday;
   
   public Birthday(String birthday) {
       super();
       this.birthday = birthday;
   }

   //getter、setter

   public Birthday() {}
   
   @Override
   public String toString() {
       return this.birthday;
   }
}
