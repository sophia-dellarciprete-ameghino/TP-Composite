import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Sophi on 29/9/2016.
 */
public class ConstanteTest {

    @Test
    public void constante() {
        Assert.assertTrue(true);
    }

    @Test
    public void constant() {
        Constante dos = new Constante(2);
        Constante cinco = new Constante(5);


        Assert.assertEquals (2, dos.evaluar(), 0);
        Assert.assertEquals (5, cinco.evaluar(), 0);
    }

    @Test
    public void sumarNros (){
        Constante dos = new Constante(2);
        Constante cinco = new Constante(5);

        Suma sumarDosMasCinco = new Suma(dos, cinco);
        Suma sumarDosMasCincoMasDos = new Suma(sumarDosMasCinco, dos);


        Assert.assertEquals (7, sumarDosMasCinco.evaluar(), 0);
        Assert.assertEquals (9, sumarDosMasCincoMasDos.evaluar(), 0);
    }


}
