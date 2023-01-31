import java.util.*;
public class BracketCheck {
    public static void main(String[] args) {
        System.out.println("Nhập một biểu thức để check ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='('||arr[i]==')')
            {
                stack.push(arr[i]);
            }
        }
        if(stack.size()%2==0)
        {
            System.out.println("Well");
        }else
            System.out.println("Not Well");


    }
}