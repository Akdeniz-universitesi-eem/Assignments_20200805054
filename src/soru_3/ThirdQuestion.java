package soru_3;

import javax.swing.*;
        import java.util.Random;

public class ThirdQuestion {
    public static void main(String[] siman){
        Random rand = new Random();

        int num = rand.nextInt(101);
        int guess = 101;

        JOptionPane.showMessageDialog(null, "0-100 Arasında tahminde bulunun");
        while (num != guess) {

            try {
                String x = JOptionPane.showInputDialog(null, "Tahmininiz ?", "title", 1);
                guess = Integer.parseInt(x); }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Lütfen Sayı girin"); continue;}
            if (num==guess) break;
            if (num<guess)  JOptionPane.showMessageDialog(null,"Tahminizi Küçültün");
            else JOptionPane.showMessageDialog(null,"Tahminizi Büyültün");
        }

        JOptionPane.showMessageDialog(null,"Tebrikler kazandınız.\n Doğru tahmin = "+num);
    }
}
