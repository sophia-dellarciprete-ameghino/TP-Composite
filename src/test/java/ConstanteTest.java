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
    public void sumar (){
        Suma sum = new Suma(2,0 + 5,0);
    }
}
