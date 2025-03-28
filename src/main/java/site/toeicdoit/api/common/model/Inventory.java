package site.toeicdoit.api.common.model;

import java.util.ArrayList;
import java.util.Scanner;


public class Inventory <T> {
    private final ArrayList<T> inventory;

    public Inventory(){
        inventory = new ArrayList<>();
    }

    public boolean add(T t){return inventory.add(t);}

    public T remove(int index){return inventory.remove(index);}

    public boolean contains(T t){return inventory.contains(t);}

    public T get(int index){return inventory.get(index);}

    public void clear(){inventory.clear();}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Inventory<Object> i = new Inventory<>();
        System.out.println("5단어 입력");
        while(i.inventory.size() < 5) i.add(scan.next());
        i.inventory.forEach(System.out::println);

    }
}