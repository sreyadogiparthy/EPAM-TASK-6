package Epam.Task_6;

public class Main{
    public static void main(String[] args) {
    	List<Integer> list = new List<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.size());
    }
}
