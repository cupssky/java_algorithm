package programmers.level1;

import doit.chap03.BinSearch;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    //마라톤 참가자중 완료에 없으면 리턴 (동명이인 있을수도 있음, 참가자가 두명이면 완료자한명 참가자 한명은 완료 X)
    /*System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"},
        new String[]{"stanko", "ana", "mislav"}));*/
    Map<String, String> map = new HashMap<>();
    String[] s = new String[]{"leo", "kiki", "eden", "eden"};
    for (String value : s) {
        map.put(value,  map.getOrDefault(value, "a") + "b");
    }
   System.out.println(map);
//    System.out.println(solution(new String[]{"leo", "kiki", "eden"},
//        new String[]{"eden", "kiki"}));

  }

  public static String solution(String[] participant, String[] completion) {
    Map<String, Integer> map = new HashMap<>();
    for (String p : participant) {
      map.put(p, map.getOrDefault(p, 0) + 1);
    }

    return null;
  }
}
