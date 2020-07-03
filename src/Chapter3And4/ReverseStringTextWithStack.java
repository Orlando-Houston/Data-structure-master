package Chapter3And4;

import java.util.Stack;

public class ReverseStringTextWithStack {
    // Function to reverse the words
// of the given sentence

    static void reverse(String m)  {
        // Create an empty character array stack
        Stack<String> s = new Stack<>();
            String[] take = m.split(" ");
        // Push words into the stack
            for(int i = 0; i < take.length; i++)
            {
                s.push(take[i]);
            }
            while (!s.empty())
            {
                // Get the words in reverse order
                System.out.print(s.peek() + " ");
                s.pop();
            }
        }

        public static void main(String[] args)
        {
            String m = "java is fun";
            reverse(m);
        }
    }

