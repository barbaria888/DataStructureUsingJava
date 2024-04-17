import java.util.*;
import java.util.Collection;
class jmam{
    public static void main(String[] args) {

        /*ArrayList<Integer> list =new ArrayList<>();
        list.add(0);
        list.add(1);list.add(2);list.add(4);list.add(4);list.add(5);
        System.out.println(list.size());System.out.println(list);
//        list.addAll(list);

        System.out.println(list.size());
        list.remove(list.lastIndexOf(4));
        System.out.println(list);*/
        Comparator<String> stringComparat =new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
            if(o1.charAt(o1.length()-1)<o1.charAt(o1.length()-1))
            {return 1;
                }
                return 0;}
    };
ArrayList <String> str =new ArrayList<>();
str.add("s");
        str.add("t");str.add("r");str.add("i");str.add("n");str.add("g");str.add("1");
        ArrayList <String> str2 =new ArrayList<>();
        str2.add("s");
        str2.add("t");str2.add("r");str2.add("i");str2.add("n");str2.add("g");str2.add("1");
        Collections.sort(str,stringComparat);
        System.out.println(str);
    }
}