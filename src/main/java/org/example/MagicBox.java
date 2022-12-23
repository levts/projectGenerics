package org.example;

import java.util.Random;

public class MagicBox<T> {
    T[] items;
    public MagicBox(int maxItems){
        items = (T[]) new Object[maxItems];
    }
    public boolean add(T item){
        for(int i = 0; i< items.length;i++){
            if(items[i] == null){
                items[i] = item;
                return true;
            }
        }
        return false;
    }
    public T pick(){
        int x = howManyNull();
        if(x == 0) {
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            return items[randomInt];
        } else {
            throw new RuntimeException(String.format("Коробка не полна, осталось заполнить %d ячеек",x));
        }
    }
    private int howManyNull(){
        int x = 0;
        for (T item : items) {
            if (item == null) {
                x++;
            }
        }
        return x;
    }
}
