package com.company;
import java.io.*;
import  java.util.*;


public class Main {
    public static ArrayList<Integer> ArraySort (ArrayList<Integer> list) { //Соритровка массива
        for (int i=0; i<list.size()-1; i++)
        {
            for (int j=i; j<list.size(); j++)
            {
                if (list.get(i)>=list.get(j))
                {
                    Integer temp = list.get(i);
                    list.add(i, list.get(j));
                    list.remove(j+1);

                }
            }
        }
        return list;
    }

    public static void percent (ArrayList<Integer> list){ //Расчет перценталя
        float p = list.size() * 90/100;
        System.out.println(p);
    }

    public static void med (ArrayList<Integer> list){
        float m;
        ArraySort(list);
        Integer p= list.size();
        if (( p % 2)==0){
            m= (float) ((list.get(p/ 2) + list.get((p / 2) -1)) / 2.0); //если четное

            System.out.println(list.get(p/ 2));
            System.out.println(list.get((p / 2) -1));

        }
        else {m=list.get(list.size()/2); } // если не четное
        System.out.println(m);
    }
    public static void Min (ArrayList<Integer> list) { //минимальный элемент
        ArraySort(list);
        System.out.println(list.get(0));
    }
    public static void Max (ArrayList<Integer> list) { //максимальный элемент
        ArraySort(list);

        System.out.println(list.get(list.size()-1));
    }

    public static void Sred (ArrayList<Integer> list) { //среднее
        double sred=0;
        for (Integer numbers : list)
        {sred= sred + numbers;}
        sred = (float) sred / (list.size()+1);
        System.out.println(sred);
    }
    public static void main(String[] args) throws  IOException {

        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        String s = reader.readLine();

            Scanner scan = new Scanner(new File(s));
            while(scan.hasNextLine()) {
                String line = scan.nextLine(); //Считываем строку
                list.add(Integer.parseInt(line)); //Заносим ее в массив
            }
            percent(list);
            med(list);
            Min(list);
            Max(list);
            


    }
}
