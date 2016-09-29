/**
 * Created by Sophi on 29/9/2016.
 */
public class Constante implements Expresion{

    double constante;

    public Constante(int constante) {
        this.constante = constante;
    }

    public double evaluar(){
        return this.constante;
    }
}
