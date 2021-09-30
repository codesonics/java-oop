package kr.codesonics.oop;

import kr.codesonics.oop.logic.BubbleSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BubbleSort<Integer> sort = new BubbleSort<>();
        List arList = Arrays.asList(args);
        System.out.println("[Result] " + sort.sort(arList));
    }
}
