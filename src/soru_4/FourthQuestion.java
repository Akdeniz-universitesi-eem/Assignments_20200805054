package soru_4;

public class FourthQuestion {
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
    public static void main(String[] siman){
        // 3 basamaklı sayıları gezer
        for(int i=100;i<1000;i++){
            if (asalmi(i)) {
                // 3 basamaklı sayının her bir basamağını alır
                int c = i % 10;
                int b = ((i % 100) - c) / 10;
                int a = (i - (b * 10 + c)) / 100;
                int ters=(c*100)+(b*10)+a;
                // Sayının gerekli koşulları sağlayıp sağlamadığını kontrol eder.
                if (asalmi(ters))
                    if (ters>i)
                        if (asalmi(a*10+b))
                            if (asalmi(b*10+c))
                                if (asalmi(c*10+b))
                                    if (asalmi(b*10+a))
                                        System.out.printf("%d\n",i);
            }
        }

    }
}
