package POOInterface;

public class Retangulo implements FigurasGeometricas {
    int base;
    int altura;


    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double getArea() {
int area= base*altura;
        // TODO Auto-generated method stub
        return area;
    }
    @Override
    public String getNomeFigura() {

        // TODO Auto-generated method stub
        return "Retangulo";
    }
    @Override
    public double getPerimetro() {
        int perimetro= (base+altura)*2;
        // TODO Auto-generated method stub
        return 0;
    }
    
    
}
