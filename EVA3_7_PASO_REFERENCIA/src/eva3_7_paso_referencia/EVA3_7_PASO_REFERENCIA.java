
package eva3_7_paso_referencia;

public class EVA3_7_PASO_REFERENCIA {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[10];
        
        System.out.println("El valor del array en el main es: "+array);
        
        Fill_Array(array);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("| "+array[i]+" ");
        }
        System.out.print("|");
    }
    
    public static void Fill_Array(int[] obj){
        System.out.println("El valor del array en Fill_Array es: "+obj);
        for (int i = 0; i < obj.length; i++) {
            obj[i] = (int) (Math.random() * 100);
        }
    }
}
