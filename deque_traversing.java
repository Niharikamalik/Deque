import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Deque<Integer> d = new LinkedList<Integer>();
		d.offerFirst(23);// push front 
		d.offerFirst(43);
		d.offerLast(24);//push back
		d.offerLast(34);
		Iterator it = d.iterator();
		while(it.hasNext()){
		    System.out.print(it.next()+ " ");
		}
		System.out.println();
		for(int x : d){
		    System.out.print(x + " ");
		}
	}
}
