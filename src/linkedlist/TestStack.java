package linkedlist;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack();
		// ��ջ
		stack.add("jack");
		stack.add("tom");
		stack.add("smith");

		// ��ջ
		// smith, tom , jack
		while (stack.size() > 0) {
			System.out.println(stack.pop());//pop���ǽ�ջ��������ȡ��
		}
	}

}
