import java.util.*;


public class Main {
    public static void main(String[] args) {

        check();
    }
    public static void check(){
        Set<String> stringhe = new HashSet<>(Arrays.asList("1","2","3"));
        Iterator<String> iterator = stringhe.iterator();
        String test = "1";

        System.out.println(stringhe);

        while (iterator.hasNext()){
            String i = iterator.next();
            if(test.equals(i)){
                iterator.remove();
            }
        }
        System.out.println(stringhe);
        stringhe.clear();
        System.out.println(stringhe);
    }
}