import java.lang.String;
import java.util.Vector;

public class StringHelper {
    public Vector<Integer> obt_pos(String input) {
        Vector<Integer> ans = new Vector<Integer>();

        for(int i = 0; i < (int) input.length(); i++) {
            if(input.charAt(i) == '/')
                ans.add(i);
        }

        return ans;
    }
    public String apaterno(String input) {
        Vector<Integer> pos;
        pos = obt_pos(input);

        String ans = "";

        for(int i = pos.get(1)+1; i < pos.get(2); i++)
            ans += input.charAt(i);

        return ans;
    }

    public String amaterno(String input) {
        Vector<Integer> pos;
        pos = obt_pos(input);

        String ans = "";

        for(int i = pos.get(2)+1; i < input.length(); i++)
            ans += input.charAt(i);

        return ans;
    }

    public String nombre1(String input) {
        Vector<Integer> pos;
        pos = obt_pos(input);

        String ans = "";

        for(int i = 0; i < pos.get(0); i++)
            ans += input.charAt(i);

        return ans;
    }

    public String nombre2(String input) {
        Vector<Integer> pos;
        pos = obt_pos(input);

        String ans = "";

        for(int i = pos.get(0)+1; i < pos.get(1); i++)
            ans += input.charAt(i);

        return ans;
    }
}
