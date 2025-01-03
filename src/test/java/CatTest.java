import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;


    @Test
    public void getFoodCatTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals("Должен вернуться список еды хищника", List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }

    @Test
    public void getSoundMeuTest() {
        Cat cat = new Cat(feline);
        String catSoundExpected = "Мяу";
        Assert.assertEquals("Кошка говорит Мяу", cat.getSound(), catSoundExpected);

    }
}
