package Java.sem5;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*Создать структуру для хранения Номеров паспортов и Фамилий
сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
📌 Вывести данные по сотрудникам с фамилией Иванов. */

public class zadacha1 {
    /**
     * Innerzadacha1
     */
    public static void main(String[] args) {

        String name = "Иванов";

        //HashMap<Integer, String> passportData = new HashMap<>();
        LinkedHashMap<Integer, String> passportData = new LinkedHashMap<>(); //Сортирует по ключам
        passportData.put(123456, "Иванов");
        passportData.put(321456, "Васильев");
        passportData.put(234561, "Петрова");
        passportData.put(234432, "Иванов");
        passportData.put(654321, "Петрова");
        passportData.put(345678, "Иванов");
        
        System.out.println("Данные по сотрудникам с фамилией " + name);
        for (Integer passportNumber : passportData.keySet()) { //Получаем список всех ключей    
            String currentName = passportData.get(passportNumber);
             
            if(currentName.equals(name)){
                System.out.println("Паспорт: " + passportNumber + ", Фамилия " + currentName);
            } 
            
                        
        }
    }
}
