public class peopleTest{
    public static void main(String args[]){
        Person person1 = new Person();
        person1.setbirth (20060212);
        person1.setName ("Andrew");
        System.out.println("Person: "+person1.getName()+"\n");
        
        System.out.print("Birth (yyyy/mm/dd):");
        System.out.print(person1.getBday().charAt(0));
        System.out.print(person1.getBday().charAt(1));
        System.out.print(person1.getBday().charAt(2));
        System.out.print(person1.getBday().charAt(3));
        System.out.print("/");
        System.out.print(person1.getBday().charAt(4));
        System.out.print(person1.getBday().charAt(5));
        System.out.print("/");
        System.out.print(person1.getBday().charAt(6));
        System.out.print(person1.getBday().charAt(7));

        
    }
}