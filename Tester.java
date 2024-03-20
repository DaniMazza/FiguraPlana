public class Tester {
    public static void main(String[] args) {
        FiguraPlana figura1 = new Circulo(7.5);
        FiguraPlana figura2 = new Quadrado(12.5);
        FiguraPlana figura3 = new Losango(8, 9, 7);
        FiguraPlana figura4 = new Triangulo(5, 3, 5, 5);
        System.out.println("________________________________");
        System.out.println("Área do circulo: " + figura1.getArea() +"\n"+
                           "Perímetro do círculo: " + figura1.getPerimetro()  );
        System.out.println("________________________________");
        System.out.println("Área do Quadrado: " + figura2.getArea() +"\n"+
                           "Perímetro do Quadrado: " + figura2.getPerimetro()  );
        System.out.println("________________________________");
        System.out.println("Área do Losango: " + figura3.getArea() +"\n"+
                           "Perímetro do Losango: " + figura3.getPerimetro()  );
        System.out.println("________________________________");
        System.out.println("Área do Triangulo: " + figura4.getArea() +"\n"+
                           "Perímetro do círculo: " + figura4.getPerimetro()  );
        System.out.println("________________________________");

    }
}
