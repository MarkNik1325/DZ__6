package DZ_6;

import java.lang.reflect.Type;
import java.util.*;

public class testDrive {
    public static void main(String[] args) {
        Nout Laptop1 = new Nout(1531);
        Laptop1.setColor("White");
        Laptop1.setHdd(500);
        Laptop1.setOS("Windows");
        Laptop1.setRam(8);
        Laptop1.setModel("Lenovo");
        Laptop1.setId(1531);

        Nout Laptop2 = new Nout(1533);
        Laptop2.setColor("Black");
        Laptop2.setHdd(1000);
        Laptop2.setOS("Windows");
        Laptop2.setRam(8);
        Laptop2.setModel("Dell");
        Laptop2.setId(1533);

        Nout Laptop3 = new Nout(1534);
        Laptop3.setColor("White");
        Laptop3.setHdd(1000);
        Laptop3.setOS("MacOS");
        Laptop3.setRam(16);
        Laptop3.setModel("Apple");
        Laptop3.setId(1534);

        Nout Laptop4 = new Nout(1535);
        Laptop4.setColor("Red");
        Laptop4.setHdd(2000);
        Laptop4.setOS("Windows");
        Laptop4.setRam(32);
        Laptop4.setModel("MSI");
        Laptop4.setId(1535);

        Nout Laptop5 = new Nout(1536);
        Laptop5.setColor("White");
        Laptop5.setHdd(500);
        Laptop5.setOS("Windows");
        Laptop5.setRam(8);
        Laptop5.setModel("Linux");
        Laptop5.setId(1536);

        List Lap = new ArrayList();
        Lap.add(Laptop1);
        Lap.add(Laptop2);
        Lap.add(Laptop3);
        Lap.add(Laptop4);
        Lap.add(Laptop5);

        List Res = new ArrayList();

        System.out.println("Введите желаемый  минимальный объем памяти ноутбука");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Object> filters = new HashMap<>();
        Integer hdd = scanner.nextInt();
        filters.put("HDD", hdd);

        for (Map.Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("HDD")){
                Iterator it = Lap.iterator();
                while(it.hasNext()){
                    Nout lap = (Nout) it.next();
                    if(lap.getHdd()>=(Integer)entry.getValue()){
                        Res.add(lap);
                    }
                }
            }

        }
        System.out.println(Res);
    }
}
