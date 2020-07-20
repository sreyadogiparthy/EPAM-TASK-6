package Epam.Task_6;

import java.util.Arrays;
public class List<E>{
	    //Size of list
	    private int size = 0;
	    //Default capacity list 10
	    private static final int CAPACITY = 10;
	    //This array stores all eles added to list
	    private Object ele[];
	    //Default constructor
	    public List() {
	        ele = new Object[CAPACITY];
	    }
	    //Add 
	    public void add(E e){
	        if (size == ele.length) 
	            Capacity();
	        ele[size++] = e;
	    }
	    //Get 
	    @SuppressWarnings("unchecked")
	    public E get(int i) {
	        if (i >= size || i < 0)
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        return (E) ele[i];
	    }
	    //Remove 
	    @SuppressWarnings("unchecked")
	    public E remove(int i) {
	        if (i >= size || i < 0)
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        Object temp = ele[i];
	        int n = ele.length - (i + 1);
	        System.arraycopy(ele, i + 1, ele, i, n);
	        size--;
	        return (E) temp;
	    }
	    //Size of list
	    public int size() {
	        return size;
	    }
	    @Override
	    public String toString() {
	         StringBuilder sb = new StringBuilder();
	         sb.append('[');
	         for(int i = 0; i < size ;i++) {
	             sb.append(ele[i].toString());
	             if(i < size - 1)
	                 sb.append(",");
	         }
	         sb.append(']');
	         return sb.toString();
	    }
	    private void Capacity() {
	        int newSize = ele.length * 2;
	        ele = Arrays.copyOf(ele,newSize);
	    }             
}