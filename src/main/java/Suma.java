/**
 * Created by Sophi on 29/9/2016.
 */
public class Suma implements Expresion{
    Expresion exp1;
    Expresion exp2;

    public Suma(Expresion dos, Expresion cinco) {
        this.exp1 = dos;
        this.exp2 = cinco;
    }


    public double evaluar() {
        return (this.exp1.evaluar() + this.exp2.evaluar());
    }
}
