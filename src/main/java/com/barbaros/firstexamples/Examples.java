package com.barbaros.firstexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by Bar-Mel on 6.09.2016.
 */

public class Examples {

    public static List<String> comparator(){

        List<String> names = Arrays.asList("barbaros", "hasan", "ahmet");
        Collections.sort(names, (String a, String b) -> a.compareTo(b));//dahada kısalabilir
        return names;
}

    public static Integer convert () {
        Converter<String, Integer> converter = Integer::valueOf;
        return converter.convert("123");
    }

    public static String secondConvert (){
       int num = 1;
        Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from );
        return stringConverter.convert(2);
    }

    public static String person (){

        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Barbaros", "Susuz");

        return person.getfName()+person.getlName();
    }

    public static List<String> streams(){
        List <String> list= Arrays.asList("aaa2","aaa1","bbb1","bbb2","ccc1","ccc2");


                List<String> result = list
                        .stream()
                        .sorted()
                        .filter((a) -> a.startsWith("a"))
                        .collect(toList());
        return result;


    }
    public static List<String> streamsMap(){
        List <String> list= Arrays.asList("aaa2","aaa1","bbb1","bbb2","ccc1","ccc2");

       List<String> result= list
                .stream()
                .map(String::toUpperCase)
                .sorted(String::compareTo)
                .collect(toList());
        return result;
    }

/*
    public static void sqrt(int a){
        Developer developer = (a) -> sqrt( a * 100);//Default methods cannot be accessed from within lambda expressions
    }
*/

    public static void main(String[] args) {

        System.out.println("comparator method:"+" "+ comparator());

        System.out.println("convert method:"+" "+convert());

        System.out.println("secondConvert method:"+" "+   secondConvert());

        System.out.println("person method:"+" "+   person());

        System.out.println("streams method start with 'a' in sorted:"+" " + streams());

        System.out.println("streamsMap method start  with uppercase in sorted:"+" "+  streamsMap());


    }
}
