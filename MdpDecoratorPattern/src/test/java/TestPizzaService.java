import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Daniel Mounir
 */
public class TestPizzaService {

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test method for {@link PizzaDekorierer#getBeschreibung()}.
     */
    @Test
    public void testPizzaMargherita() {
        IPizza pizza = StandardPizza.Margherita();
        assertEquals("Pizza mit knusprigem Boden, Mozzarella, Tomatensauce, Oregano", pizza.getBeschreibung());
        assertEquals(15, pizza.getPreis(), 0.00);
    }

    /**
     * Test method for {@link PizzaDekorierer#getPreis()}.
     */
    @Test
    public void testPizzaProsciutto() {
        IPizza pizza = StandardPizza.Prosciutto();
        assertEquals("Pizza mit knusprigem Boden, Mozzarella, Tomatensauce, Oregano, Schinken", pizza.getBeschreibung());
        assertEquals(17, pizza.getPreis(), 0.00);

    }

    @Test
    public void testPizzaSpezial() {
        IPizza pizza = new Funghi(new KnusprigerBoden());
        assertEquals("Pizza mit knusprigem Boden, Mozzarella, Tomatensauce, Funghi", pizza.getBeschreibung());
        assertEquals(16, pizza.getPreis(), 0.00);

    }

}
