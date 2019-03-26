import Implementation.MyMap;

import java.util.Dictionary;

public class Application {
    public static void main(String[] args) {
        MyMap<Integer,String> map1 = new MyMap<>();
        map1.put(2131321,"Hi");
        Dictionary
        System.out.println(map1.get(2131321));
        MyMap<String,String> map = new MyMap<>();
        map.put("Darova1","darova1");
        map.put("Darova2","darova2");
        map.put("Darova3","darova3");
        map.put("Darova4","darova4");
        map.put("Darova5","darova5");
        map.put("Darova6","darova6");
        map.put("Darova7","darova7");
        map.put("Darova8","darova8");
        map.put("Darova9","darova9");
        map.put("Darova10","darova10");
        map.put("Darova11","darova11");
        map.put("Darova12","darova12");
        map.put("Darova13","darova13");
        map.put("Darova14","darova14");
        map.put("Darova15","darova15");
        map.put("Darova16","darova16");
        map.put("Darova17","darova17");
        map.put("Darova18","darova18");
        for (int i = 1; i < map.size()+1;i++){
            System.out.println(map.get("Darova"+i));
        }
    }
}
