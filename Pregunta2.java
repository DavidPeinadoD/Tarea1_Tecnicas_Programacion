// ¿Qué algoritmos crees que usan por tus juegos y aplicaciones favoritas?




//codigo de java para escribir los 1000 primeros numeros primos que existeten con un main que los imprima en pantalla

public class Pregunta2 {
    public static void main(String[] args) {
        int n = 1000;
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}










