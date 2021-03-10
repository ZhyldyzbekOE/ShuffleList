package com.company.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class ShuffleList {

    List<Integer> list = new ArrayList<>();
    Integer[] array = {3, 4, 5, 1, 1, 1, 7};
    int k = 0;

    public void checkList(){
        list = Arrays.asList(array);

        while (true){
            Collections.shuffle(list);

            if (list.get(0)==list.get(1) && list.get(0) == list.get(2))
            {
                showList();
                break;
            }else {
                Collections.shuffle(list);
                k++;
            }
        }
    }

    private void showList() {
        for (Integer item:list) {
            System.out.print(item+"  ");
        }
        System.out.println("\n");
        System.out.println("Количество попыток: " + k);
    }


}
