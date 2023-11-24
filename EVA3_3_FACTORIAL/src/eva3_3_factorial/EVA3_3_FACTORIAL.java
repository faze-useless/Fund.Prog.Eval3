
package eva3_3_factorial;

public class EVA3_3_FACTORIAL {

    public static void main(String[] args) {
        // TODO code application logic here
        int value1, value2;
        
        value1 = Calc_Factorial(5);
        System.out.println("Factorial de 5 es: "+value1);
        
        value2 = Calc_Exponente(5,2);
        System.out.println("5 elevado a 2 es: "+value2);
        //System.out.println(Calc_Exponente(5,2));
    }
    public static int Calc_Factorial(int num){
        int r = 1;
        for (int i = 1; i <= num; i++) {
           r *= i; // r = r*i;
        }
        return r;
    }
    public static int Calc_Exponente(int num,int exp){
        int r = 1;
        for (int i = 0; i < exp; i++) {
            r *= num;
        }
        return r;  
    }
}
