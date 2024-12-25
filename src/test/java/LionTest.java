import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

public class LionTest {

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        Assert.assertEquals("Должно вернуться значение 1", feline.getKittens(), lion.getKittens());
    }

    @Test
    public void getFoodLionTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        Assert.assertEquals("Должен вернуться список еды хищника", List.of("Животные", "Птицы", "Рыба"), lion.getFood());

    }
}
