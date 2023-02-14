package stream;

import org.junit.Test;
import sun.text.normalizer.UCharacter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test_Filter {
    @Test
    public void filterTest(){
        List<String> strings = Arrays.asList("aa", "abc", "", "ab1", "b2", "bca", "b6fa");
        List<String> filter = strings.stream().filter(str -> str.contains("f")).collect(Collectors.toList());
        System.out.println(filter);
    }

    @Test
    public void distinctTest(){
        List<String> strings = Arrays.asList("aa", "abc", "aa", "ab1", "b2", "bca", "b6fa");
        List<String> filter = strings.stream().distinct().collect(Collectors.toList());
        System.out.println(filter);
    }
    @Test
    public void distinctObjectTest(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,"a"));
        users.add(new User(1,"a"));
        users.add(new User(1,"b"));
        List<User> collect = users.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
    @Test
    public void limitTest(){
        List<String> strings = Arrays.asList("aa", "abc", "aa", "ab1", "b2", "bca", "b6fa");
        List<String> collect = strings.stream().limit(3).collect(Collectors.toList());
        System.out.println(collect);
    }
    @Test
    public void skipTest(){
        List<String> strings = Arrays.asList("aa", "abc", "aa", "ab1", "b2", "bca", "b6fa");
        List<String> collect = strings.stream().skip(2).collect(Collectors.toList());
        System.out.println(collect);
    }
    @Test
    public void mapTest(){
        List<String> strings = Arrays.asList("aa", "abc", "aa", "ab1", "b2", "bca", "b6fa");
        List<String> collect = strings.stream().map(str->"test_"+str).collect(Collectors.toList());
        System.out.println(collect);
    }
    @Test
    public void flatMapTest(){
        List<String> strings = Arrays.asList("aa", "abc", "aa", "ab1", "b2", "bca", "b6fa");
        List<Character> collect = strings.stream().flatMap(str -> Test_Filter.getCharacterByString(str)).collect(Collectors.toList());
        System.out.println(collect);
    }


    public static Stream<Character> getCharacterByString(String str){
        ArrayList<Character> characterList = new ArrayList<>();
        for(Character character : str.toCharArray()){
            characterList.add(character);
        }
        return characterList.stream();
    }

}
