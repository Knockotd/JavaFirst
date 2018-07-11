package arrayList;

import java.util.PriorityQueue;
import java.util.Stack;

public class Stackandqueue {

	public static void main(String[] args) {
		//Stack - LIFO
		Stack <String> stack = new Stack<>();
		stack.push("C");
		stack.push("C++");
		stack.push("Python");
		stack.push("Java");
		//데이터가 역순으로 리턴됩니다. - 제거되면서 리턴
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		
		PriorityQueue <String> queue = new PriorityQueue<>();
		queue.add("고라파덕");
		queue.add("피카츄");
		queue.add("이브이");
		queue.add("버터플");
		queue.add("뮤");
		queue.add("메타몽"); //저장 순서대로 저장하는 게 아니라 크기에 따라 번호를 붙여서 저장한다.
		System.out.println(queue);
		//크기가 작은 것부터 리턴
		System.out.println(queue.poll());
		System.out.println(queue.poll()); //꺼낼때만 순서대로 꺼내진다.
		System.out.println(queue);
		
		
		
	}

}
