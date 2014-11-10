public class LinkedList{

	public static void main (String [] args){
		LinkedList ll = new LinkedList(); 
		ll.add("Stuff");


		Node temp = (Node)ll.get(0);
		System.out.println(temp.data);

		while (temp != null){
			System.out.println(temp.data + " ");
			temp = temp.next; 
		}
	}

	private Node head; 
	private int size; 

	public LinkedList(){
		head = new Node(null);
		size = 0; 
	}

	public void add (Object o){
		Node temp = new Node(o);
		Node current = head;
		// starting at the head node, crawl to the end of the list
		while(current.next != null)
		{
			current = current.next;
		}
		// the last node's "next" reference set to our new node
		current.next = temp;
		size++;
	}

	public Object get(int i){
		if(i <= 0)
			return null;

		int index = 0; 
		Node temp = head.next; 
		while (temp.next != null && index != i){
				temp = temp.next; 
				index++; 
		}
		return temp; 
	}

	private class Node{

		Object data; 
		Node next; 

		public Node (Object data){
			this.data = data; 
		}

		public Object getData (){
			return data; 
		}
		public void setData(Object data){
			this.data = data; 
		}
		public Object getNext(){
			return this.next; 
		}
		public void setNext(Node next){
			this.next = next; 
		}
	}
}