package cn.com.lee.util.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class is used to handle collection generic method
 * @author lizhiwei
 *
 */
public class CollectionUtil {
	
	/**
	 * get the max element in a collection, element must implements Comparable interface
	 * @param c
	 * @return
	 * @since JDK 1.5
	 */
	public static <E extends Comparable<E>> E max(Collection<E> c){
		if(c==null || c.isEmpty()) throw new NoSuchElementException();
		
		Iterator<E> iter = c.iterator();
		E largest = iter.next();
		while(iter.hasNext()){
			E next = iter.next();
			if(largest.compareTo(next)<0){
				largest=next;
			}
		}
		return largest;
	}
	
	/**
	 * get the max element of the collection
	 * the element must implements {@link Comparable}
	 * @param c
	 * @return 
	 * @since JDK 1.8
	 */
	public static <E extends Comparable<E>> E getMax(Collection<E> c){
		return c.parallelStream().sorted((e1,e2) -> e2.compareTo(e1)).findFirst().get();
	}
	
	/**
	 * get the max element of the collection
	 * the element must implements {@link Comparable}
	 * @param c
	 * @return the minimal object
	 * @since JDK 1.8
	 */
	public static <E extends Comparable<E>> E getMin(Collection<E> c){
		return c.parallelStream().sorted((e1,e2) -> e1.compareTo(e2)).findFirst().get();
	}
	
	
	public static void main(String[] args) {
		List<Integer> list = Stream.of(7,1,13,30,-6,0,-200,90).collect(Collectors.toList());
		System.out.println(getMax(list));
		Stream.builder().add(1).add(2).build().forEach(System.out::println );
	}
}
