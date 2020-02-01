import java.util.*;

public class Min_ElementInStack
{
	public static void main(String args[])
	{
		//minStack s=new minStack();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		int size=sc.nextInt();
		Stack<Integer> s1=new Stack<Integer>();
		for(int i=0;i<size;i++)
		{
			s1.push(sc.nextInt());
		}
		int min=s1.pop();
		while(!s1.isEmpty())
		{
			int x=s1.pop();
			min=Math.min(min, x);
		}
		System.out.println(min);
		sc.close();
	}
}