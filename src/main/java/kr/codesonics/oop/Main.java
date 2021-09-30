package kr.codesonics.oop;

import kr.codesonics.oop.logic.BubbleSort;
import kr.codesonics.oop.logic.JavaSort;
import kr.codesonics.oop.logic.Sort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sort<Integer> sort = new JavaSort<>();
        List arList = Arrays.asList(args);
        System.out.println("[Result] " + sort.sort(arList));
    }
}
