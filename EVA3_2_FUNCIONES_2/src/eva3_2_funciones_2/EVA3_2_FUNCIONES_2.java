
package eva3_2_funciones_2;
import java.util.*;

public class EVA3_2_FUNCIONES_2 {

    //int x = 100;
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner key = new Scanner(System.in);
        EVA3_2_FUNCIONES_2 object = new EVA3_2_FUNCIONES_2();
        System.out.println(object.x);*/
        
        // se guarda el valor y se imprime
        int num1 = 100, num2 = 200;
        
        int value = search_max(num1,num2);
        System.out.println(value);
        
        // se imprime el valor pero no se guarda
        System.out.println(search_max(7,47));
        
        // se calcula pero no hace nada
        search_max(num1,num2);
    }
    
    public static int search_max(int n1,int n2) {
        int r;
        if(n1 > n2) {
            r = n1;
        } else {
            r = n2;
        }
        return r;
    }
}
