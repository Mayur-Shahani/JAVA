import java.util.Stack;

public class ReverseStringWithStack {
    public static void main(String[] args) {
        Stack <Character> c = new Stack<Character>();
        c.push('H');
        c.push('E');
        c.push('L');
        c.push('L');
        c.push('O');

        for(int i = 4; i >= 0; i--)
        {
            
            System.out.println(c.pop());
        }
    }
}
