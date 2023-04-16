import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class dz{
    public static void main(String[] args) {
        laptop lap1=new laptop("123a",6,"Acer");
        lap1.setColor("white");
        lap1.setHDD(400);
        lap1.setOS("Windows");
        lap1.setRAM(16);
        
        laptop lap2=new laptop("1234a",7,"Acer");
        lap2.setColor("black");
        lap2.setHDD(500);
        lap2.setOS("Windows");
        lap2.setRAM(8);

        laptop lap3=new laptop("1b",8,"Acer");
        lap3.setColor("grey");
        lap3.setHDD(900);
        lap3.setOS("Windows");
        lap3.setRAM(16);

        HashSet <laptop> laptops = new HashSet<>(Arrays.asList(lap1,lap2,lap3));
        HashSet <laptop> res = new HashSet<>();

        System.out.println("Здравствуйте");
        System.out.print("Введите цифру,:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while(n!=5){
        if(n==1){
            System.out.println("Введите минимальную оперативную память");
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("RAM", temp);
        }
        if(n==2){
            System.out.println("Введите минимальный объем ЖД" );
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("HDD", temp);
        }
        if(n==3){
            System.out.println("Введите ОС");
            String temp = sc.nextLine();
            filters.put("OS", temp);
        }
        if(n==4){
            System.out.println("Введите цвет");
            String temp = sc.nextLine();
            filters.put("color", temp);
        }
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        n = sc.nextInt();
        sc.nextLine();
    }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("RAM")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptop lap = (laptop) it.next();
                    if(lap.getRAM()>=(Integer)entry.getValue()){
                        res.add(lap);
                    }
                }
                }
             if(entry.getKey().equals("HDD")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptop lap = (laptop)it.next();
                    if(lap.getHDD()>=(Integer)entry.getValue()){
                        res.add(lap);
                        }
                    }
                    }
            if(entry.getKey().equals("OS")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptop lap = (laptop)it.next();
                        if(lap.getOS().equals(entry.getValue())){
                            res.add(lap);
                            }
                        }
                        }
            if(entry.getKey().equals("color")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptop lap = (laptop)it.next();
                        if(lap.getColor().equals(entry.getValue())){
                            res.add(lap);
                                    }
                                }
                                }
            }
        
            Iterator it = res.iterator();
            while(it.hasNext()){
                laptop lap = (laptop)it.next();
            System.out.println(lap.toString());
            System.out.println();
        }
        
        
    }}