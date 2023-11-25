
package eva3_5_referencias;

import java.util.Scanner;

public class EVA3_5_REFERENCIAS {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[10]; // <-- objeto
        
        System.out.println(array);
        for (int value: array) {
            System.out.print("| "+value+" ");
        }
        System.out.print("|");
        
        
        System.out.println("");
        
        String[][] arraystring = new String[10][5]; // <-- objeto
        System.out.println(arraystring);
        
        Scanner input = new Scanner(System.in); // <-- objeto
        System.out.println(input);
    }
    
}
