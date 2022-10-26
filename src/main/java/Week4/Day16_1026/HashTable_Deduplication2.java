package Week4.Day16_1026;

import java.util.ArrayList;
import java.util.List;

public class HashTable_Deduplication2 {

    private int size;
    private List<String>[] table;

    public HashTable_Deduplication2(int size) {
        this.size = size;
        this.table = new ArrayList[size];
    }

    public int hash(String key) {
        int asciiSum = 0;
        for(int i = 0 ; i < key.length() ; i ++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }

    public void insert(String key) {
        int hashIdx = hash(key);
        if(this.table[hashIdx] == null) {
            this.table[hashIdx] = new ArrayList<>();
        }
        this.table[hashIdx].add(key);
    }

    public int search(String key) {
        return this.hash(key);
    }

    public static void main(String[] args) {
        // 학생 이름 80개
        // String[] names = new String[]{"DongyeonKang", "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom", "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang", "JunhaHwang"};

        HashTable_Deduplication2 ht = new HashTable_Deduplication2(200);

        ht.insert("Yoonseo");
        ht.insert("Seoyoon");

        System.out.println(ht.search("Yoonseo"));
        System.out.println(ht.search("Seoyoon"));
    }

}