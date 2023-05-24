package POOInterface;

public class Quadrado implements FigurasGeometricas {
    int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getlado() {
        return lado;
    }

    public void setlado(int lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        int area = lado * lado;
        // TODO Auto-generated method stub
        return area;
    }

    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Quadrado";
    }

    @Override
    public double getPerimetro() {
        int perimetro = 4 * lado;
        // TODO Auto-generated method stub
        return perimetro;
    }

}
