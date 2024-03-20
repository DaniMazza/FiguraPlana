public class Losango extends FiguraPlana{
    private double diagonalMaior;
    private double diagonalMenor;
    private double lado;
    public Losango(double diagonalMaior, double diagonalMenor, double lado){
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }
    @Override
    public double getArea() {
        return (this.diagonalMaior*this.diagonalMenor)/2;
    }

    @Override
    public double getPerimetro() {
        return this.lado * 4;
    }
}
