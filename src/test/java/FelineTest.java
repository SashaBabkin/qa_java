import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals("Должен вернуться перечень пищи хищника", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFoodFelineTest() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals("Должен вернуться список еды хищника", List.of("Животные", "Птицы", "Рыба"), feline.getFood("Хищник"));

    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Должно вернуться семейство Кошачьих", "Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensNoParametersTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Должно вернуться значение 1", 1, feline.getKittens());
    }

    @Test
    public void getKittensWithParametersTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Должно вернуться 5", 5, feline.getKittens(5));
    }


}
