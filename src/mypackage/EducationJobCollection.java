package mypackage;
import java.util.*;
import java.util.List;

public class EducationJobCollection {
    public static void main(String[] args) {

        QuestionYesNo qs = new QuestionYesNo();

        Scanner inEnter = new Scanner(System.in);                                                  //для ввода в консоль
        int a1, a2;
        System.out.println("Сравнение двух чисел или вывод чисел 10, 100(если ввести 2 одинаковых числа)");
        System.out.print("Введите число: ");
        a1 = inEnter.nextInt();
        System.out.print("Введите второе число: ");
        a2 = inEnter.nextInt();

        if (a1 < a2)
            System.out.println(a1 + " < " + a2);                                                               //условие
        else if (a1 > a2)
            System.out.println(a1 + " > " + a2);
        else if (a1 == 100 && a2 == 100) {

            int[] arr = new int[101];                                                                    //создал массив

            System.out.println("Вывод массива от 100 до 10: ");
            for (int i = 100; i >= 10; i = i - 10) {
                arr[i] = i;                                                                 //Цикл инициализации массива
            }
            for (int i = 100; i >= 10; i = i - 10)
                System.out.println(arr[i]);                                              //Цикл вывода элементов массива
        } else if (a1 == 10 && a2 == 10) {
            System.out.println("Вывожу десятки от 10 до 100: ");
            for (int i = 10; i <= 100; i = i + 10) {
                System.out.println(i);                                                               //Цикл от 10 до 100
            }
        } else {
            System.out.println(a1 + " = " + a2);
        }


        qs.qst("List");

        //Работа с коллекцией List(увеличение размера списка)
        List<Integer> list = new ArrayList<>();                                                    //Создал новый список
        //Добавляю элементы в список
        list.add(5);
        list.add(15);
        list.add(38);

        System.out.println();
        System.out.println("Вывод первого элемента: " + list.get(1));                      //вывод элемента с индексом 1

        list.set(1, 20);                                                      //изменение значения элемента с индексом 1
        System.out.println("Вывод первого элемента: " + list.get(1));

        System.out.println("Количество элементов в списке: " + list.size());                             //размер списка
        list.remove(1);                                                  //удаление значения элемента с индексом 1
        System.out.println("Вывод первого элемента: " + list.get(1));
        System.out.println("Количество элементов в списке: " + list.size());

        List<Integer> list1 = new ArrayList<>();                                                   //Создал новый список

        list1.add(56);                                                                      //Добавляю элементы в список
        list1.add(45);
        list1.add(88);

        list.addAll(list1);                                                      //Добавил все элементы из list1  в list
        System.out.println("Количество элементов в списке list после добавления: " + list.size());
        System.out.println("Количество элементов в списке list1: " + list1.size());

        list.removeAll(list1);                                                           //Удалил из list элементы list1
        System.out.println("Количество элементов в списке list после удаления: " + list.size());

        System.out.println();
        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        System.out.println("Пустой ли лист: " + list2.isEmpty());                     //метод узнать пустой лист или нет
        list2.clear();
        System.out.println("Пустой ли лист: " + list2.isEmpty());

        System.out.println();
        System.out.println("Есть ли 45 в list1: " + list1.contains(45));                     //Узнать есть ли элемент 45
        System.out.println("Есть ли 28 в list1: " + list1.contains(28));                     //Узнать есть ли элемент 28

        qs.qst("Set");

        //Работа с коллекцией Set(множество объектов без индекса(но являются уникальными))
        Set<Integer> set1 = new HashSet<>();                                                    //выделил память под Set
        set1.add(10);                                                                                 //добавляю объекты
        set1.add(11);

        System.out.println("Вывод размера set1: " + set1.size());                                          //размер set1
        System.out.println();

        System.out.println("Вывод всех значений set1");             //цикл вывода всех значений set1 с помощью итератора
        Iterator<Integer> iteratorSet = set1.iterator();
        for (int i : set1){
            System.out.print(iteratorSet.next() + " ");
        }


        set1.add(550);
        set1.add(55);
        set1.add(550);

        set1.remove(550);                                                                         //удаление значений
        Iterator<Integer> iteratorSet1 = set1.iterator();
        System.out.println("");
        System.out.println("Вывод всех значений set1 после удаления 550");
        for (int i : set1){
            System.out.print(iteratorSet1.next() + " ");
        }

        System.out.println("");                                                    //Проверка на наличие значений в set1
        System.out.println("Проверка есть ли значение 55: " + set1.contains(55));
        System.out.println("Проверка есть ли значение 33: " + set1.contains(33));

        qs.qst("Map");
        //Работа с коллекцией Map(элементы с указанием уникальных ключей и значений))
        System.out.println("");
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Black");           //Добавление эллеменов в map1 с указанием уникальных ключей и указанием значений
        map1.put(2, "White");
        map1.put(3, "Yellow");

        System.out.println("Вывод значений ключа 3: " + map1.get(3));                           //Вывод значений ключа 3
        System.out.println("Вывод размера map1: " + map1.size());                                   //Вывод размера map1
        map1.clear();                                                                              //Очистка списка map1
        System.out.println("Вывод размера map1 после очистки: " + map1.size());
        map1.put(1, "Black");           //Добавление эллеменов в map1 с указанием уникальных ключей и указанием значений
        map1.put(2, "White");
        map1.put(3, "Green");
        System.out.println("Вывод размера map1 после добавления 2х эллементов: " + map1.size());
        System.out.println("Есть ли кеу 10: " + map1.containsKey(10));              //Проверка наличия ключей и значений
        System.out.println("Есть ли кеу 2: " + map1.containsKey(2));
        System.out.println("Проверка наличия значения White: " + map1.containsValue("White"));

        System.out.println("");                                                                    //Вывод всех значений
        System.out.println("Вывод всех значений Map1: ");
        Set<Integer> keys = map1.keySet();
        Iterator<Integer> iterator1 = keys.iterator();
        int num = 1;
        for (int i : keys) {
            System.out.println(num  + ") " + map1.get(iterator1.next()) + "; ");
            num++;
        }

        System.out.println("");
        System.out.println("Вывод значения 3 Мар до изменения: " + map1.get(3));
        map1.put(3, "Red");                                                                    //Изменить значение ключа
        System.out.println("");
        System.out.println("Вывод значения 3 Мар после изменения: " + map1.get(3));

        Map<String, String> map2 = new HashMap<>();                      //Создал Мар с ключем String и значением String
        map2.put("Вася", "Рогов");
        map2.put("Антон", "Дукалис");
        map2.put("Рашид", "Шишкин");
        Set<String> keys2 = map2.keySet();
        Iterator<String> iterator2 = keys2.iterator();
                                                                                              //Вывод всех значений мар2
        System.out.println("Вывод всех значений мар2: ");
        for (String i : keys2) {
            System.out.println(map2.get(iterator2.next()) + "; ");
        }
        System.out.println("Вася " + map2.get("Вася"));
    }
}
