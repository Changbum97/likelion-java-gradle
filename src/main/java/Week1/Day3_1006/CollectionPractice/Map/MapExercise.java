package Week1.Day3_1006.CollectionPractice.Map;

import java.util.HashMap;

public class MapExercise {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        int length = 88;
        NameList nameList = new NameList();
        AddressList addressList = new AddressList();

        String[] nameLists = nameList.get();
        String[] addressLists = addressList.get();

        for(int i = 0 ; i < length ; i ++) {
            map.put(nameLists[i], addressLists[i]);
        }
        System.out.println(map.size());
        System.out.println(map);
    }
}
