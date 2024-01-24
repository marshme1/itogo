package itog;
// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и

// методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
// хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import Seminar6.HomeworkSem6.Laptop;
import itog.Laptop;


public class Task1 {
    public static Map<Integer, String> redactCriteria(Map<Integer, String> criterias, int del) {
        Map<Integer, String> criteriasNew = new HashMap<>();
        boolean findDel = false;
        for (int i = 1; i < criterias.size(); i++) {
            if (i == del) {
                findDel = true;
            }
            if (!findDel) {
                criteriasNew.put(i, criterias.get(i));
            } else {
                criteriasNew.put(i, criterias.get(i+1));
            }
        }

        return criteriasNew;
    }
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("DEXP", "Intel Celeron N4020", "Intel UHD Graphics 600", "Silver", "China", "DEXP Aquilon", 8, 128, 14.1, 37, 2022, 20199, "Windows 11 Pro");
        Laptop laptop2 = new Laptop("GIGABYTE", "Intel Core i5-12500H", "Intel Iris Xe Graphics", "Black", "China", "GIGABYTE G5 MF", 16, 512, 15.6, 54, 2023, 79999);
        Laptop laptop3 = new Laptop("ASUS", "Intel Core i5-1235U", "Intel Iris Xe Graphics", "Blue", "China", "ASUS Vivobook X1704ZA-AU123", 16, 512, 17, 50, 2023, 58999, "Windows 10");
        Laptop laptop4 = new Laptop("Fujitsu", "Intel Core i5-12500H", "Intel Iris Xe Graphics", "Black", "Japan", "Fujitsu LIFEBOOK E5412", 32, 4096, 14, 60, 2021, 136300, "Windows 11");
        Laptop laptop5 = new Laptop("Apple", "Apple M1", "Apple M1 7-core", "Gray", "USA", "Apple MacBook Air", 8, 256, 13.3, 49.9, 2022, 95699, "macOS");

        Laptop laptop6 = new Laptop("Fujitsu", "Intel Core i5-12500H", "Intel Iris Xe Graphics", "Black", "Japan", "Fujitsu LIFEBOOK E5412", 32, 4096, 14, 60, 2021, 136300, "Windows 11");
        Laptop laptop7 = new Laptop("Apple", "Apple M1", "Apple M1 7-core", "Gray", "USA", "Apple MacBook Air", 8, 256, 13.3, 49.9, 2022, 95699, "macOS");
        Laptop laptop8 = new Laptop("DEXP", "Intel Celeron N4020", "Intel UHD Graphics 600", "Silver", "China", "DEXP Aquilon", 8, 128, 14.1, 37, 2022, 20199, "Windows 11 Pro");
        Laptop laptop9 = new Laptop("GIGABYTE", "Intel Core i5-12500H", "Intel Iris Xe Graphics", "Black", "China", "GIGABYTE G5 MF", 16, 512, 15.6, 54, 2023, 79999);
        Laptop laptop10 = new Laptop("ASUS", "Intel Core i5-1235U", "Intel Iris Xe Graphics", "Blue", "China", "ASUS Vivobook X1704ZA-AU123", 16, 512, 17, 50, 2023, 58999, "Windows 10");

        HashSet<Laptop> laptops = new HashSet<Laptop>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7, laptop8, laptop9, laptop10));
        Scanner choiceSc = new Scanner(System.in);
        Scanner findUse = new Scanner(System.in);
        Scanner choiseTwo = new Scanner(System.in);
        Scanner getError = new Scanner(System.in);
        Scanner next = new Scanner(System.in);
        boolean choiceError = true;
        int countFind = 0;
        Map<Integer, String> criterias = new HashMap<Integer, String>();
        criterias.put(1, "Фирма");
        criterias.put(2, "Процессор");
        criterias.put(3, "Видеокарта");
        criterias.put(4, "Цвет");
        criterias.put(5, "Страна изготовления");
        criterias.put(6, "Модель ноутбука");
        criterias.put(7, "ОЗУ");
        criterias.put(8, "Размер жесткого диска");
        criterias.put(9, "Диагональ экрана");
        criterias.put(10, "Емкость аккамулятора");
        criterias.put(11, "Год изготовления");
        criterias.put(12, "Операционная система");
        criterias.put(13, "Цена");
        HashSet<Laptop> laptopsFind = new HashSet<>();
        while (choiceError) {
            if (!laptopsFind.isEmpty()) {
                laptops = laptopsFind;
                laptopsFind = new HashSet<>();
            }
            System.out.println("По какому критерию хотите производить поиск?");
            for (Integer criteria : criterias.keySet()) {
                System.out.println(criteria + " - " + criterias.get(criteria));
            }
            int choice = choiceSc.nextInt();
            String choiceCriteria = criterias.get(choice);
            switch (choiceCriteria) {
                case "Фирма":
                    System.err.println("Введите название фирмы ноутбука:");
                    String find = findUse.nextLine();
                    System.out.println();
                    find = find.toLowerCase();
                    for (Laptop laptop : laptops) {
                        String getFind = laptop.getFirm().toLowerCase();
                        boolean differend = false;
                        if (find.length() > getFind.length()) {
                            differend = true;
                        } else {
                            for (int i = 0; i < find.length(); i++) {
                                if (find.charAt(i) != getFind.charAt(i)) {
                                    differend = true;
                                    i = find.length();
                                }
                            }
                        }
                        if (!differend) {
                            laptopsFind.add(laptop);
                            countFind++;
                        }
                    }
                    System.out.println("Чтобы показать результаты поиска, введите 1");
                    System.out.println("Чтобы добавить еще один критерий поиска, введите любое другое значение");
                    String nexInput = next.nextLine();
                    if (nexInput.equals("1")) {
                        choiceError = false;
                    } else {
                        criterias = redactCriteria(criterias, choice);
                        countFind = 0;
                    }
                    break;
                case "Процессор":
                    System.err.println("Введите название процессора:");
                    find = findUse.nextLine();
                    System.out.println();
                    find = find.toLowerCase();
                    for (Laptop laptop : laptops) {
                        String getFind = laptop.getCPU().toLowerCase();
                        boolean differend = false;
                        if (find.length() > getFind.length()) {
                            differend = true;
                        } else {
                            for (int i = 0; i < find.length(); i++) {
                                if (find.charAt(i) != getFind.charAt(i)) {
                                    differend = true;
                                    i = find.length();
                                }
                            }
                        }
                        if (!differend) {
                            laptopsFind.add(laptop);
                            countFind++;
                        }
                    }
                    System.out.println("Чтобы показать результаты поиска, введите 1");
                    System.out.println("Чтобы добавить еще один критерий поиска, введите любое другое значение");
                    nexInput = next.nextLine();
                    if (nexInput.equals("1")) {
                        choiceError = false;
                    } else {
                        criterias = redactCriteria(criterias, choice);
                        countFind = 0;
                    }
                    break;
                case "Видеокарта":
                    System.err.println("Введите название видеокарты:");
                    find = findUse.nextLine();
                    System.out.println();
                    find = find.toLowerCase();
                    for (Laptop laptop : laptops) {
                        String getFind = laptop.getVideoCard().toLowerCase();
                        boolean differend = false;
                        if (find.length() > getFind.length()) {
                            differend = true;
                        } else {
                            for (int i = 0; i < find.length(); i++) {
                                if (find.charAt(i) != getFind.charAt(i)) {
                                    differend = true;
                                    i = find.length();
                                }
                            }
                        }
                        if (!differend) {
                            laptopsFind.add(laptop);
                            countFind++;
                        }
                    }
                    System.out.println("Чтобы показать результаты поиска, введите 1");
                    System.out.println("Чтобы добавить еще один критерий поиска, введите любое другое значение");
                    nexInput = next.nextLine();
                    if (nexInput.equals("1")) {
                        choiceError = false;
                    } else {
                        criterias = redactCriteria(criterias, choice);
                        countFind = 0;
                    }
                    break;
                case "Цвет":
                    System.err.println("Введите желаемый цвет ноутбука:");
                    find = findUse.nextLine();
                    System.out.println();
                    find = find.toLowerCase();
                    for (Laptop laptop : laptops) {
                        String getFind = laptop.getColor().toLowerCase();
                        boolean differend = false;
                        if (find.length() > getFind.length()) {
                            differend = true;
                        } else {
                            for (int i = 0; i < find.length(); i++) {
                                if (find.charAt(i) != getFind.charAt(i)) {
                                    differend = true;
                                    i = find.length();
                                }
                            }
                        }
                        if (!differend) {
                            laptopsFind.add(laptop);
                            countFind++;
                        }
                    }
                    System.out.println("Чтобы показать результаты поиска, введите 1");
                    System.out.println("Чтобы добавить еще один критерий поиска, введите любое другое значение");
                    nexInput = next.nextLine();
                    if (nexInput.equals("1")) {
                        choiceError = false;
                    } else {
                        criterias = redactCriteria(criterias, choice);
                        countFind = 0;
                    }
                    break;
                case "Страна изготовления":
                    System.err.println("Введите страну изготовления ноутбука:");
                    find = findUse.nextLine();
                    System.out.println();
                    find = find.toLowerCase();
                    for (Laptop laptop : laptops) {
                        String getFind = laptop.getCountryOfManufacture().toLowerCase();
                        boolean differend = false;
                        if (find.length() > getFind.length()) {
                            differend = true;
                        } else {
                            for (int i = 0; i < find.length(); i++) {
                                if (find.charAt(i) != getFind.charAt(i)) {
                                    differend = true;
                                    i = find.length();
                                }
                            }
                        }
                        if (!differend) {
                            laptopsFind.add(laptop);
                            countFind++;
                        }
                    }
                    System.out.println("Чтобы показать результаты поиска, введите 1");
                    System.out.println("Чтобы добавить еще один критерий поиска, введите любое другое значение");
                    nexInput = next.nextLine();
                    if (nexInput.equals("1")) {
                        choiceError = false;
                    } else {
                        criterias = redactCriteria(criterias, choice);
                        countFind = 0;
                    }
                    break;
                case "Модель ноутбука":
                    System.err.println("Введите модель ноутбука:");
                    find = findUse.nextLine();
                    System.out.println();
                    find = find.toLowerCase();
                    for (Laptop laptop : laptops) {
                        String getFind = laptop.getModel().toLowerCase();
                        boolean differend = false;
                        if (find.length() > getFind.length()) {
                            differend = true;
                        } else {
                            for (int i = 0; i < find.length(); i++) {
                                if (find.charAt(i) != getFind.charAt(i)) {
                                    differend = true;
                                    i = find.length();
                                }
                            }
                        }
                        if (!differend) {
                            laptopsFind.add(laptop);
                            countFind++;
                        }
                    }
                    System.out.println("Чтобы показать результаты поиска, введите 1");
                    System.out.println("Чтобы добавить еще один критерий поиска, введите любое другое значение");
                    nexInput = next.nextLine();
                    if (nexInput.equals("1")) {
                        choiceError = false;
                    } else {
                        criterias = redactCriteria(criterias, choice);
                        countFind = 0;
                    }
                    break;
                case "ОЗУ":
                    System.err.println("Введите колличество оперативной памяти:");
                    int findNum = findUse.nextInt();
                    findUse.nextLine();
                    System.out.println();
                    System.out.println("Чтобы показать результаты с большей оперативной памятью, введите 1.");
                    System.out.println(
                            "Чтобы показать результаты с меньшей оперативной памятью, введите любое другое значение.");
                    String choiceFind = choiseTwo.nextLine();
                    if (choiceFind.equals("1")) {
                        for (Laptop laptop : laptops) {
                            if (laptop.getRAM() >= findNum) {
                                laptopsFind.add(laptop);
                                countFind++;
                            }
                        }
                    } else {
                        for (Laptop laptop : laptops) {
                            if (laptop.getRAM() <= findNum) {
                                laptopsFind.add(laptop);
                                countFind++;
                            }
                        }
                    }
                    System.out.println("Чтобы показать результаты поиска, введите 1");
                    System.out.println("Чтобы добавить еще один критерий поиска, введите любое другое значение");
                    nexInput = next.nextLine();
                    if (nexInput.equals("1")) {
                        choiceError = false;
                    } else {
                        criterias = redactCriteria(criterias, choice);
                        countFind = 0;
                    }
                    break;
                case "Размер жесткого диска":
                    System.err.println("Введите размер жесткого диска:");
                    findNum = findUse.nextInt();
                    findUse.nextLine();
                    System.out.println();
                    System.out.println("Чтобы показать результаты с большим размером жесткого диска, введите 1.");
                    System.out.println(
                            "Чтобы показать результаты с меньшим размером жесткого диска, введите любое другое значение.");
                    choiceFind = choiseTwo.nextLine();
                    if (choiceFind.equals("1")) {
                        for (Laptop laptop : laptops) {
                            if (laptop.getHardDrive() >= findNum) {
                                laptopsFind.add(laptop);
                                countFind++;
                            }
                        }
                    } else {
                        for (Laptop laptop : laptops) {
                            if (laptop.getHardDrive() <= findNum) {
                                laptopsFind.add(laptop);
                                countFind++;
                            }
                        }
                    }
                    System.out.println("Чтобы показать результаты поиска, введите 1");
                    System.out.println("Чтобы добавить еще один критерий поиска, введите любое другое значение");
                    nexInput = next.nextLine();
                    if (nexInput.equals("1")) {
                        choiceError = false;
                    } else {
                        criterias = redactCriteria(criterias, choice);
                        countFind = 0;
                    }
                    break;
                case "Диагональ экрана":
                    System.err.println("Введите диагональ:");
                    double findDouble = findUse.nextDouble();
                    findUse.nextLine();
                    System.out.println();
                    System.out.println("Чтобы показать результаты с большим размером диагонали, введите 1.");
                    System.out.println("Чтобы показать результаты с меньшим размером диагонали, введите любое другое значение.");
                    choiceFind = choiseTwo.nextLine();
                    if (choiceFind.equals("1")) {
                        for (Laptop laptop : laptops) {
                            if (laptop.getScreenDiagonal() >= findDouble) {
                                laptopsFind.add(laptop);
                                countFind++;
                            }
                        }
                    } else {
                        for (Laptop laptop : laptops) {
                            if (laptop.getScreenDiagonal() <= findDouble) {
                                laptopsFind.add(laptop);
                                countFind++;
                            }
                        }
                    }
                    System.out.println("Чтобы показать результаты поиска, введите 1");
                    System.out.println("Чтобы добавить еще один критерий поиска, введите любое другое значение");
                    nexInput = next.nextLine();
                    if (nexInput.equals("1")) {
                        choiceError = false;
                    } else {
                        criterias = redactCriteria(criterias, choice);
                        countFind = 0;
                    }
                    break;
                case "Емкость аккамулятора":
                    System.err.println("Введите емкость аккамулятора:");
                    findDouble = findUse.nextDouble();
                    findUse.nextLine();
                    System.out.println();
                    System.out.println("Чтобы показать результаты с большей емкостью аккамулятора, введите 1.");
                    System.out.println("Чтобы показать результаты с меньшей емкостью аккамулятора, введите любое другое значение.");
                    choiceFind = choiseTwo.nextLine();
                    if (choiceFind.equals("1")) {
                        for (Laptop laptop : laptops) {
                            if (laptop.getBattery() >= findDouble) {
                                laptopsFind.add(laptop);
                                countFind++;
                            }
                        }
                    } else {
                        for (Laptop laptop : laptops) {
                            if (laptop.getBattery() <= findDouble) {
                                laptopsFind.add(laptop);
                                countFind++;
                            }
                        }
                    }
                    System.out.println("Чтобы показать результаты поиска, введите 1");
                    System.out.println("Чтобы добавить еще один критерий поиска, введите любое другое значение");
                    nexInput = next.nextLine();
                    if (nexInput.equals("1")) {
                        choiceError = false;
                    } else {
                        criterias = redactCriteria(criterias, choice);
                        countFind = 0;
                    }
                    break;
                case "Год изготовления":
                    System.err.println("Введите год изготовления:");
                    findNum = findUse.nextInt();
                    findUse.nextLine();
                    System.out.println();
                    System.out.println("Чтобы показать более новые модели, введите 1.");
                    System.out.println("Чтобы показать более старые модели, введите 2");
                    System.out.println("Чтобы показать модели только необходимового вам года, введите любое другое значение");
                    choiceFind = choiseTwo.nextLine();
                    if (choiceFind.equals("1")) {
                        for (Laptop laptop : laptops) {
                            if (laptop.getYearOfManufacture() >= findNum) {
                                laptopsFind.add(laptop);
                                countFind++;
                            }
                        }
                    } else if (choiceFind.equals("2")) {
                        for (Laptop laptop : laptops) {
                            if (laptop.getYearOfManufacture() <= findNum) {
                                laptopsFind.add(laptop);
                                countFind++;
                            }
                        }
                    } else {
                        for (Laptop laptop : laptops) {
                            if (laptop.getYearOfManufacture() == findNum) {
                                laptopsFind.add(laptop);
                                countFind++;
                            }
                        }
                    }
                    System.out.println("Чтобы показать результаты поиска, введите 1");
                    System.out.println("Чтобы добавить еще один критерий поиска, введите любое другое значение");
                    nexInput = next.nextLine();
                    if (nexInput.equals("1")) {
                        choiceError = false;
                    } else {
                        criterias = redactCriteria(criterias, choice);
                        countFind = 0;
                    }
                    break;
                case "Операционная система":
                    System.err.println("Введите название операционной системы:");
                    System.out.println(
                            "(Чтобы произвести поиск всех ноутбуков без установленной операционной системой, введите null)");
                    System.out.println(
                            "(Чтобы произвести поиск всех ноутбуков с установленной операционной системой, введите all)");
                    find = findUse.nextLine();
                    System.out.println();
                    find = find.toLowerCase();
                    for (Laptop laptop : laptops) {
                        String getFind = laptop.getOperatingSystem().toLowerCase();
                        boolean differend = false;
                        if (find.equals("all")) {
                            if (!getFind.equals("не установлена")) {
                                laptopsFind.add(laptop);
                                countFind++;
                            }
                        } else if (find.equals("null")) {
                            if (getFind.equals("не установлена")) {
                                laptopsFind.add(laptop);
                                countFind++;
                            }
                        } else {
                            if (find.length() > getFind.length()) {
                                differend = true;
                            } else {
                                for (int i = 0; i < find.length(); i++) {
                                    if (find.charAt(i) != getFind.charAt(i)) {
                                        differend = true;
                                        i = find.length();
                                    }
                                }
                            }
                            if (!differend) {
                                laptopsFind.add(laptop);
                                countFind++;
                            }
                        }

                    }
                    System.out.println("Чтобы показать результаты поиска, введите 1");
                    System.out.println("Чтобы добавить еще один критерий поиска, введите любое другое значение");
                    nexInput = next.nextLine();
                    if (nexInput.equals("1")) {
                        choiceError = false;
                    } else {
                        criterias = redactCriteria(criterias, choice);
                        countFind = 0;
                    }
                    break;
                case "Цена":
                    System.err.println("Введите цену ноутбука:");
                    findNum = findUse.nextInt();
                    findUse.nextLine();
                    System.out.println();
                    System.out.println("Чтобы показать результаты с большим ценовым диапазоном, введите 1.");
                    System.out.println("Чтобы показать результаты с меньшим ценовым диапазоном, введите любое другое значение.");
                    choiceFind = choiseTwo.nextLine();
                    if (choiceFind.equals("1")) {
                        for (Laptop laptop : laptops) {
                            if (laptop.getPrice() >= findNum) {
                                laptopsFind.add(laptop);
                                countFind++;
                            }
                        }
                    } else {
                        for (Laptop laptop : laptops) {
                            if (laptop.getPrice() <= findNum) {
                                laptopsFind.add(laptop);
                                countFind++;
                            }
                        }
                    }
                    System.out.println("Чтобы показать результаты поиска, введите 1");
                    System.out.println("Чтобы добавить еще один критерий поиска, введите любое другое значение");
                    nexInput = next.nextLine();
                    if (nexInput.equals("1")) {
                        choiceError = false;
                    } else {
                        criterias = redactCriteria(criterias, choice);
                        countFind = 0;
                    }
                    break;
                default:
                    System.out.println("Ошибка! Пожалуйста выберите один из указанных критериев поиска!");
                    String getErrorInput = getError.nextLine();
                    break;
            }
        }

        for (Laptop laptop : laptopsFind) {
            System.out.println(laptop);
            System.out.println();
        }
        System.out.println("Найдено результатов - " + countFind);
        next.close();
        getError.close();
        choiseTwo.close();
        choiceSc.close();
        findUse.close();
    }
}