package soru_2;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SecondQuestion {
    public static void main(String[] main){
        int zar1 = 0;
        int zar2 = 0;
        // 2 rastgele sayı üretir
        for (int i=0;i<2;i++) {
            double dbnum= 1+(Math.random()*10)%6;
            if (i==0)  zar1= (int)dbnum;
            if (i==1)  zar2=(int)dbnum;
        }

        // gerekli frameleri tanımlar
        JFrame frame = new JFrame("1. ZAR");
        JFrame frame1 = new JFrame("2. ZAR");
        // Resmi yükler
        ImageIcon dice1 = new  ImageIcon("C:\\Users\\dell\\Desktop\\zar\\"+zar1+".jpeg");
        ImageIcon dice2 = new ImageIcon("C:\\Users\\dell\\Desktop\\zar\\"+zar2+".jpeg");
        // label oluşturur ve resmi içine atar
        JLabel label = new JLabel(dice2);
        JLabel label1 = new JLabel(dice1);
        // framin ayarları
        frame.add(label);
        frame1.add(label1);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.pack();
        frame1.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        // pencerelerin konumu
        frame1.setLocation(400,200);
        frame.setLocation(100,100);
    }
}

