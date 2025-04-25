package Task1_Adv_DS.task1.src.main.java.com.example;

import java.util.ArrayList;
import java.util.Comparator;

public class PowerOfTwoMaxHeap<T extends Comparable<T>>{
    private int power;
    private int childCount;
    private ArrayList<T> heap;

    public PowerOfTwoMaxHeap(int power){
        this.power = power;
        this.childCount = (int)Math.pow(2, power) - 1;
        this.heap = new ArrayList<>();
    }

    public void printHeap() {
        System.out.print("\nmodel.PowerOfTwoMaxHeap = ");
        for (int i = 0; i < heap.size(); i++)
            System.out.print(heap.get(i) +" ");
        System.out.println();
    }


    private int heapUp(int childIndex){
        T child = heap.get(childIndex);
        int parentIndex = (int)Math.floor((childIndex - 1) / (childCount + 1));
        if(parentIndex >= 0){
            T parent = heap.get(parentIndex);
            if(child.compareTo(parent) > 0){
                heap.set(childIndex, parent);
                heap.set(parentIndex, child);
                return parentIndex;
            }
        }
        return -1;
    }

    private int heapDown(int parentIndex){
        T parent = heap.get(parentIndex);
        int childIndex = (int)Math.floor((parentIndex * (childCount + 1)) + 1);
        if(childIndex < heap.size()){
            T child = heap.get(childIndex);
            if(child.compareTo(parent) > 0){
                heap.set(parentIndex, child);
                heap.set(childIndex, parent);
                return childIndex;
            }
        }
        return -1;
    }
    public void insert(T value){
        heap.add(value);
        int childIndex = heap.size() - 1;
        while(childIndex >= 0){
            int parentIndex = heapUp(childIndex);
            if(parentIndex == -1) break;
            childIndex = parentIndex;
        }
    }
    public T popMax(){
        if(heap.size() == 0) return null;
        T max = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        int parentIndex = 0;
        while(parentIndex < heap.size()){
            int childIndex = heapDown(parentIndex);
            if(childIndex == -1) break;
            parentIndex = childIndex;
        }
        return max;
    }
    public T getMax(){
        if(heap.size() == 0) return null;
        return heap.get(0);
    }
    public int size(){
        return heap.size();
    }
    public static void main(String[] args) {
        PowerOfTwoMaxHeap<Integer> heap = new PowerOfTwoMaxHeap<>(2);
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(7);
        heap.insert(15);

        System.out.println(heap.popMax()); // 20
        System.out.println(heap.popMax()); // 15
        System.out.println(heap.popMax()); // 10
    }
}
