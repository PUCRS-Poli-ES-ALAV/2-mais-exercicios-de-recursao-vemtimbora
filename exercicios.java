import java.util.ArrayList;

public class exercicios{
    public static void main(String[] args) {
        ArrayList array = new ArrayList<Integer>();
        array.add(1);
        array.add(9);
        array.add(5);
        array.add(8);
        
        System.out.println(findBiggest(array));
    }

    // Exercicio 1
    // Modele e implemente um 
    //método recursivo que calcule o fatorial de um número n passado como parâmetro.
    public static int fatorial(int n){
        if(n==1){
            return 1;
        }

        if(n<=0){
            System.out.println("Erro");
        }

        return n * fatorial(n-1);
    }

    // Exercicio 2
    // Modele e implemente um método recursivo que 
    // calcule o somatório de um número n (passado como parâmetro) até 0.
    public static int somatorio(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        return n + somatorio(n-1);
    }

    // Exercicio 3
    // Modele e implemente um método 
    // recursivo que calcule o n-ésimo número da sequência de fibonacci.
    public static int fibonacci(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    // Exercicio 4
    // Modele e implemente um método recursivo que calcule o 
    // somatório dos números inteiros entre os números k e j, passados como parâmetro.
    public static int somatorios(int k, int j){
        if(k == j){
            return j;
        }
        if(k > j){
            int aux = j;
            j = k;
            k = aux;
        }
        return k + somatorios(k+1, j);
    }

    // Exercicio 5
    // Modele e implemente um método recursivo que recebe um String 
    // em retorna true se este String for um palíndrome, false caso contrário.
    public static boolean isPal(String palavra){
        return palindromo(palavra, 0);
    }

    public static boolean palindromo(String palavra, int count){
        if(count >= palavra.length()/2){
            return true;
        }

        if(palavra.charAt(count) == palavra.charAt(palavra.length()-1-count)){
            return palindromo(palavra, count+1);
        }

        return false;
    }

    // Exercicio 6
    // Modele e implemente um método recursivo que recebe 
    // um inteiro zero ou positivo e retorna um String com o número em binário.
    public static String convBase2 (int n){
        if(n==1){
            return "1";
        }

        if(n==0){
            return "0";
        }

        if(n%2==1){
            return convBase2(n/2) + "1";
        }

        return convBase2(n/2) + "0";
    }

    // Exercicio 7
    // Modele e implemente um método recursivo que calcule o somatório 
    // dos números contidos em um ArrayList de inteiros, passado como parâmetro.
    public static int somaArray(int[] array, int count){
        if(array.length == 0){
            return 0;
        }
        if(array.length == count){
            return 0;
        }
        return array[count] + somaArray(array, count+1);
    }   

    // Exercicio 8
    // Modele e implemente um método recursivo para encontrar o maior elemento de um ArrayList.
    public static int findBiggest(ArrayList<Integer> ar) {
        if(ar.isEmpty()){
            return 0;
        }
        
        return acharMaior(ar, 0, 0);
    }

    public static Integer acharMaior(ArrayList<Integer> ar, int count, Integer maior){
        if (count == ar.size()) {
            return maior;
        }
        if (ar.get(count) > maior) {
            maior = ar.get(count);
        }

        return acharMaior(ar, count+1, maior);
    }

    // Exercicio 9
    // Implemente um método recursivo para determinar se um string ocorre dentro de outro.
    
}


