import java.util.Scanner;

public class Main {
    // Sayının asalığını kontrol eder
    public static boolean asalmi(int b)
    {

        int i=2;
        while (i<b)
        {
            while (b%i==0)
                return false;
            i++;
        }
        return true;
    }
    public static void main(String[] siman) {

        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int num1=num;
        if (asalmi(num))
        {   int k=11;
          while (k>10)
          {
              k = 0;
              while (num!=0) {

                  k += num % 10;
                  num /= 10;
              }


              if (asalmi(k)==false) { System.out.printf("%d Sayısı isPrimeX değildir.",num1); break;}
              if (k>=10) { num=k; continue;}
              if (asalmi(k) && k<10) System.out.printf("%d Sayısı isPrimeX sayıdır. ",num1);

          }

        }
       else System.out.printf("%d Sayısı isPrimeX değildir.",num1);
    }
}