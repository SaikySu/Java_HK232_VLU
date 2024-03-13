import java.util.Scanner;

class Rectangle {
    double Chieucao, Chieurong;

    public void getInformation() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(Chieucao = sc.nextDouble());
            System.out.println(Chieurong = sc.nextDouble());
        }
    }

    public double Chuvi() {
        return Chieucao * Chieurong;
    }

    public double Dientich() {
        return (Chieucao + Chieurong) * 2;
    }

    public void display() {
        System.out.println("Chu vi HCN: " + Chuvi());
        System.out.println("Dien tich HCN: " + Dientich());
    }
}

public class HCN {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getInformation();
        r.display();
    }
}
