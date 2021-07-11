package com.smanov;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean isEndA = false;
        int aI = 0;
        while (!isEndA){
            String element = scanner.nextLine();
            listA.add(element);
            if(aI==4){
                isEndA = true;
            }
            aI++;
        }

        boolean isEndB = false;
        int bI = 0;
        while (!isEndB){
            String element = scanner.nextLine();
            listB.add(element);
            if(bI==4){
                isEndB = true;
            }
            bI++;
        }

        boolean isEnd = false;
        int f = 0;

        int a = 0;
        int b = 4;
        boolean ab = true;
        while (!isEnd){
            f++;
            if(f>=10){
                isEnd = true;
            }
            if(ab){
                listC.add(listA.get(a));
                a++;
                ab = false;
            }else {
                listC.add(listB.get(b));
                b--;
                ab = true;
            }
        }

        System.out.println(listC);

        listC.sort(Comparator.comparing(String::length));

        System.out.println(listC);

        /*ArrayList<String> strings = new ArrayList<>();
        strings.add("Kutman");
        strings.add("Ilya");
        strings.add("Askar");
        strings.add("Adam");
        strings.add(3,"Albert");

        ArrayList<Integer> ints = new ArrayList<>();

        ints.add(1);
        ints.add(111);
        ints.add(123);
        ints.add(11);
        ints.add(10);

        for(String name:strings){
            System.out.println(name);
        }
        String kutman = "Kutman";
        if(strings.contains(kutman)){
            strings.remove(kutman);
        }

        for(String name:strings){
            System.out.println(name);
        }*/

        /*ArrayList<User> users = new ArrayList<>();

        users.add(new User("Kutman", 27));
        users.add(new User("Askar", 25));
        users.add(new User("Sultan", 22));

        users.sort(Comparator.comparing(User::getAge));

        for (User user: users){
            System.out.println(user.toString());
        }

        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Collections.sort(strings);
        //Collections.sort(ints);

        //strings.sort(Comparator.comparing(String::length));

        /*for(Integer integer:ints){
            System.out.println(integer);
        }*/

        /*ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Black");

        colors.ensureCapacity(6);

        colors.add("White");
        colors.add("Pink");

        Collections.reverse(colors);

        for(String color:colors){
            System.out.println(color);
        }

        System.out.println("__________________");

        Collections.shuffle(colors);

        for(String color:colors){
            System.out.println(color);
        }
         Map<String, User> userMap = new HashMap<>();

         userMap.put("kelly", new User("Kelly", 17));*/

    }
}
