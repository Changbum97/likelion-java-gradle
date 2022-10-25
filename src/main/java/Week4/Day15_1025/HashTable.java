package Week4.Day15_1025;

import java.util.HashSet;
import java.util.Set;

public class HashTable {

    private int size = 10000;
    private int[] table = new int[size];

    public HashTable() { }

    public HashTable(int size) {
        this.size = size;
        this.table = new int[size];
    }

    public int hash(String key) {
        int asciiSum = 0;
        for(int i = 0 ; i < key.length() ; i ++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }

    public void insert(String key, int value) {
        int hashCode = hash(key);
        this.table[hashCode] = value;
        System.out.println(key + " : " + hashCode + "번 방에 저장이 완료되었습니다.");
    }

    public int search(String key) {
        return this.table[hash(key)];
    }

    public static void main(String[] args) {
        // 학생 이름 80개
        String[] names = new String[]{"DongyeonKang", "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom", "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang", "JunhaHwang"};

        HashTable ht = new HashTable(200);
        Set<Integer> nameSet = new HashSet<>();

        for(int i = 0 ; i < names.length ; i ++) {
            ht.insert(names[i], ht.hash(names[i]));
        }

        for(int i = 0 ; i < names.length ; i ++) {
            nameSet.add(ht.hash(names[i]));
        }
        System.out.printf("입력 수 : %d, 중복 수 : %d\n", names.length, names.length - nameSet.size());

        System.out.println("ChangbumAn : " + ht.search("ChangbumAn") + "번 방에 저장되어 있음");
    }

}