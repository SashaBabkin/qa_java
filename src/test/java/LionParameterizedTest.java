import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final Boolean hasMane;

    public LionParameterizedTest(String sex, Boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex);
        Boolean actual = lion.doesHaveMane();
        assertEquals(hasMane, actual);
    }

    @Test(expected = Exception.class)
    public void doesHaveManeExceptionTest() throws Exception {
        Lion lion = new Lion("Некорректные данные");

    }

}
