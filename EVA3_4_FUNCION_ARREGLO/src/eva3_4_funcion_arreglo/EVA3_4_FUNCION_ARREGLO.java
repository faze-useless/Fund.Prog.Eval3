
package eva3_4_funcion_arreglo;

public class EVA3_4_FUNCION_ARREGLO {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = Create_Array(10,100);
        for(int value: array) {
            System.out.print("| "+value+" ");
        }
        System.out.print("| ");
    }
    
    public static int[] Create_Array(int size,int range) {
        int[] array = new int[size];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * range);
        }
        
        return array;
    }
}
