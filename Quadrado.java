public class Quadrado extends FiguraPlana{
  private double lado;

  public Quadrado(double lado){
    this.lado = lado;
  }

  @Override
  public double getArea() {
    return this.lado * this.lado;
  }

  @Override
  public double getPerimetro() {
    return this.lado * 4;
  }


}
