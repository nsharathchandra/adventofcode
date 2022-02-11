import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class Day1Test {

    Day1 day1;

    @Before
    public void setUp(){
        day1 = new Day1();
    }

    @Test
    public void methodShouldReturnZero(){
        assertThat(day1.notQuiteLisp(""), equalTo(0));
        assertThat(day1.notQuiteLisp("(())"), equalTo(0));
        assertThat(day1.notQuiteLisp("()()"), equalTo(0));
        assertThat(day1.notQuiteLisp("((("), equalTo(3));
        assertThat(day1.notQuiteLisp("(()(()("), equalTo(3));
        assertThat(day1.notQuiteLisp("))((((("), equalTo(3));
        assertThat(day1.notQuiteLisp("())"), equalTo(-1));
        assertThat(day1.notQuiteLisp("))("), equalTo(-1));
        assertThat(day1.notQuiteLisp(")))"), equalTo(-3));
        assertThat(day1.notQuiteLisp(")())())"), equalTo(-3));
    }

}