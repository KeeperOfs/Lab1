import java.util.*;
public class Main {
    public static void main (String[] args)
    {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your line");
        str = input.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for ( int i = 0; i < str.length(); i++ )
        {
            Integer k = map.get(str.charAt(i));
            if ( k == null ) {
                map.put(str.charAt(i), 1);
            }
            else {
                map.put(str.charAt(i), ++k);
            }
        }
        System.out.println(map);
    }
}
