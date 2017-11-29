package concurrent.linkedblockingdeque.tests;

public class LinkedBlockingDequeTest {
	
	BlockingDeque<String> deque1 = new LinkedBlockingDeque<String>();

	deque1.addFirst("1");
	deque1.addLast("2");

	String two = deque1.takeLast();
	String one = deque1.takeFirst();

}