package com.barbaros.firstexamples;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


/**
 * Created by mebitech on 6.9.2016.
 */
public class ExamplesTest {

    private Examples examples;

    @Before
    public void before(){
        examples = new Examples();
    }

    @Test
    public void test(){

        List<String> result = Arrays.asList("ahmet","barbaros","hasan");
        assertThat(Examples.comparator(),is(equalTo(result)));//comparator

        assertEquals("123","123");//convert

        assertEquals("2","2");//secondConvert

        assertEquals("BarbarosSusuz","BarbarosSusuz");//person

        List<String> resultA = Arrays.asList("aaa1","aaa2");
        assertThat(examples.streams(),is(equalTo(resultA)));//streams





    }




}
