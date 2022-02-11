import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
    public void partOneTest(){
        assertThat(day1.notQuiteLispPartOne(""), equalTo(0));
        assertThat(day1.notQuiteLispPartOne("(())"), equalTo(0));
        assertThat(day1.notQuiteLispPartOne("()()"), equalTo(0));
        assertThat(day1.notQuiteLispPartOne("((("), equalTo(3));
        assertThat(day1.notQuiteLispPartOne("(()(()("), equalTo(3));
        assertThat(day1.notQuiteLispPartOne("))((((("), equalTo(3));
        assertThat(day1.notQuiteLispPartOne("())"), equalTo(-1));
        assertThat(day1.notQuiteLispPartOne("))("), equalTo(-1));
        assertThat(day1.notQuiteLispPartOne(")))"), equalTo(-3));
        assertThat(day1.notQuiteLispPartOne(")())())"), equalTo(-3));
    }

    @Test
    public void partOneTestTextFile() throws IOException {
        StringBuilder word = new StringBuilder("");
        File f=new File("src\\main\\resources\\day1.txt");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        int c;
        while((c = br.read()) != -1)
        {
            word.append((char)c);
        }
        assertThat(day1.notQuiteLispPartOne(word.toString()), equalTo(232));
    }

    @Test
    public void partTwoTestTextFile() throws IOException {
        StringBuilder word = new StringBuilder("");
        File f=new File("src\\main\\resources\\day1.txt");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        int c;
        while((c = br.read()) != -1)
        {
            word.append((char)c);
        }
        assertThat(day1.notQuiteLispPartTwo(word.toString()), equalTo(1783));
    }

}