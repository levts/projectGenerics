package org.example;

public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBoxString = new MagicBox<>(5);
        MagicBox<Integer> magicBoxInteger = new MagicBox<>(5);
        MagicBox<Integer> magicBoxException = new MagicBox<>(5);
        magicBoxString.add("Privet5");
        magicBoxString.add("Privet4");
        magicBoxString.add("Privet3");
        magicBoxString.add("Privet2");
        magicBoxString.add("Privet1");
        magicBoxInteger.add(1);
        magicBoxInteger.add(2);
        magicBoxInteger.add(3);
        magicBoxInteger.add(4);
        magicBoxInteger.add(5);
        System.out.println(magicBoxString.pick());
        System.out.println(magicBoxInteger.pick());
        System.out.println(magicBoxException.pick());
    }
}