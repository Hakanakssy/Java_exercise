import java.util.Scanner;


public class CircleCalculator {
    public static void main(String[] args) {
        
        try (Scanner read = new Scanner(System.in)) {
            double pi ,circle_radius, circle_quadrature, circle_epicycloid, circle_piece_epi;
             pi =3.14;

             System.out.println("Welcome to Circle Calculator Wizard!");
             System.out.println("Plaese input radius of your circle: ");
             circle_radius =read.nextDouble();
             System.out.println("Please input center degree of your circle piece: ");
             System.out.println("ALERT! if you have full circle please input 360 :D");
             circle_piece_epi =read.nextDouble();

             circle_quadrature = pi*(Math.pow(circle_radius, 2));
             circle_epicycloid = 2*pi*circle_radius;
        
        circle_piece_epi = (circle_quadrature*circle_piece_epi)/360;

         System.out.println("Quadrate of your circle: "+circle_quadrature+"\nEpicycloid of your circle: "+circle_epicycloid+"\nQuadrate of your circle piece: "+circle_piece_epi);

        }
    }
}
