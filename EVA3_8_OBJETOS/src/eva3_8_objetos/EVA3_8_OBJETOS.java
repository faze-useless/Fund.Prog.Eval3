
package eva3_8_objetos;

public class EVA3_8_OBJETOS {

    public static void main(String[] args) {
        // TODO code application logic here
        Human human1 = new Human();
        // Scanner input = new Scanner(System.in); 
        human1.name = "Juanito";
        human1.lastname = "Alcachofa";
        human1.age = 20;
        
        Print_Human(human1);
        
        System.out.println("");
        
        Human human2 = new Human();
        // Scanner input = new Scanner(System.in);
        human2.name = "Genji";
        human2.lastname = "Shimada";
        human2.age = 42;
        
        Print_Human(human2);
    }
    
    public static void Print_Human(Human value) {
        System.out.println("Direccion del humano: "+value);
        
        System.out.println("Nombre completo: "+value.name+" "+value.lastname);
        System.out.println("Edad: "+value.age);
    }
    
}
// son plantillas
// son tipos de datos
class Human{
    String name;
    String lastname;
    int age;
}
