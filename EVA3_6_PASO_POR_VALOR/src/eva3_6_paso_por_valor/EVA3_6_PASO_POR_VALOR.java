
package eva3_6_paso_por_valor;

public class EVA3_6_PASO_POR_VALOR {

    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        System.out.println("El valor de x en el main es: "+x);
        Sumar_Valor(x);
        
        System.out.println("El valor de x en el main despues de la funcion es: "+x);
    }
    
    public static void Sumar_Valor(int value) {
        System.out.println("Valor recibido: "+value);
        value += 1;
        
        System.out.println("Valor modificado: "+value);
    }
    // Paso por valor (Copia del valor original)
}
