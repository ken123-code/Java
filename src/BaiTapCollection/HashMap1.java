package BaiTapCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class HashMap1 {
    public static void test1(){
        HashMap<String, String> map = new HashMap<>();
        map.put("USA", "Washington, D.C.");
        map.put("France", "Paris");
        map.put("Japan","Tokyo");

        // Kiem tra su ton tai cua 1 khoa
        if(map.containsKey("France")){
            System.out.println("Capital of France: "+ map.get("France"));
        }

        // Kiem tra su ton tai cua 1 gia tri
        if(map.containsValue("Tokyo")){
            System.out.println("Tokyo is in the map.");
        }

        // Xoa mot phan tu
        map.remove("Japan");
        System.out.println("###################");

        // in ra cac phan tu con lai trong HashMap
        for (String key: map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
        System.out.println("###################");

        // Lap qua cac cap khoa - gia tri bang cach su dung entrySet()
        for(Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Country: "+ key + ", Capital: "+ value);
        }
        System.out.println("###################");

        // Lay gia tri voi khoa co san
        System.out.println("Value for key 'USA': "+ map.getOrDefault("USA", "Not Found"));

        // Lay gia tri voi khoa khong co san
        System.out.println("Value for key 'C': "+ map.getOrDefault("C", "Not Found"));

        // Them hoac cap nhat gia tri neu khoa khong co mat ( thay doi kieu  gia tri thanh String )
        System.out.println("Value for key 'USA': "+ map.getOrDefault("USA", "Not Found"));

        // Cap nhat gia tri neu  khoa co mat ( thay doi kieu gia tri tu Paris -> Paris ( Updated ) )
        map.computeIfPresent("France", (k, v) -> v + " (Updated");
        System.out.println("Updated  France capital: "+ map.get("France"));
    }

    public static void test2_countWords(){
        String s = "xin chao xin xin chao pho phuong bao phuong pho";
        HashMap<String, Integer> map = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(s);

        while (tokenizer.hasMoreTokens()){
            String word  = tokenizer.nextToken();
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String key : map.keySet()){
            System.out.println(key+ ": "+ map.get(key));
        }
    }



    public static void main(String[] args) {

    }
}
