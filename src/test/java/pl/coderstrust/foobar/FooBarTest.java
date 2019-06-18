package pl.coderstrust.foobar;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FooBarTest {

    @Test
    public void checkFooBarListSize10() {
        //given
        List<String> expected = new ArrayList<>();
        expected.add("0 FooBar");
        expected.add("1 ");
        expected.add("2 ");
        expected.add("3 Foo");
        expected.add("4 ");
        expected.add("5 Bar");
        expected.add("6 Foo");
        expected.add("7 ");
        expected.add("8 ");
        expected.add("9 Foo");

        //when
        List<String> actual = FooBar.getFooBar(10);

        //then
        assertThat(actual, is(expected));
    }
}