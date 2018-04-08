package comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args){
        PhoneNumber p1 = new PhoneNumber(123,456,789);
        PhoneNumber p2 = new PhoneNumber(223,456,789);
        PhoneNumber p3 = new PhoneNumber(223,333,789);
        List<PhoneNumber> list = Arrays.asList(new PhoneNumber[]{p1,p2,p3});
        Collections.sort(list);
        System.out.println(list);
    }
}
