public class Triangulo extends FiguraPlana {
     private double base;
     private double altura;
     private double lado1;
     private double lado2;

     public Triangulo(double base, double altura, double lado, double  lado2){
         this.altura = altura;
         this.base = base;
         this.lado1 = lado1;
         this.lado2 = lado2;
     }
    @Override
    public double getArea() {
        return (base*altura)/2;
    }
    @Override
    public double getPerimetro() {
        return this.lado1 + lado2 + base;
    }
}
