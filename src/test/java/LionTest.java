import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class LionTest {

    @Test
    public void getKittensTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        Assert.assertEquals("Должно вернуться значение 1", 1, lion.getKittens());
    }

    @Test
    public void getFoodLionTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        Assert.assertEquals("Должен вернуться список еды хищника", List.of("Животные", "Птицы", "Рыба"), lion.getFood());

    }

    @Test(expected = Exception.class)
    public void doesHaveManeExceptionTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Некорректные данные", feline);

    }
}
