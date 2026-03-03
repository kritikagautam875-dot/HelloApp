import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class PalindromeChecker {
        public static void main(String[] args) {
            String input = "racecar";

            // Data Structures
            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();

            System.out.println("Input String: " + input);

            // Flow: Enqueue characters and Push characters to stack
            for (char character : input.toCharArray()) {
                queue.add(character); // Enqueue: adds to the rear
                stack.push(character); // Push: adds to the top
            }

            System.out.println("\n--- Processing Data Structures ---");
            System.out.println("Queue (FIFO order): " + queue);
            System.out.println("Stack (LIFO order): " + stack);


            // Flow: Compare dequeue vs pop (Palindrome check logic)
            boolean isPalindrome = true;
            System.out.println("\n--- Comparing Dequeue vs Pop ---");

            while (!queue.isEmpty()) {
                char queueChar = queue.remove(); // Dequeue from the front (FIFO)
                char stackChar = stack.pop();    // Pop from the top (LIFO)

                System.out.println("Dequeue: " + queueChar + ", Pop: " + stackChar);

                if (queueChar != stackChar) {
                    isPalindrome = false;
                    break; // Mismatch found, not a palindrome
                }
            }
            // Display results
            System.out.println("\n Result ");
            if (isPalindrome) {
                System.out.println("The original string \"" + input + "\" is a palindrome.");
            } else {
                System.out.println("The original string \"" + input + "\" is NOT a palindrome.");
            }
        }
    }
