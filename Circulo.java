public class Circulo extends FiguraPlana {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return 3.14 * Math.pow(this.raio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * 3.14 * this.raio;
    }
}