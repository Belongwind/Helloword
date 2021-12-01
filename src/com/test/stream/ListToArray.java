package com.test.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * list转array
 * array转list
 */
public class ListToArray {

    public static void main(String[] args) {
        //list转array
        List<String> list = new ArrayList<String>(){{
        add("a");
        add("b");
        add("c");
        }};
        String [] arrays = list.toArray(new String[0]);
        System.out.println(Arrays.toString(arrays));
        System.out.println(Arrays.deepToString(arrays));

        String [] s = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(s));

        //array转list
        //方法1：Arrays.asList 该方法不支持add，remove
        List<String> strList = Arrays.asList(new String[]{"a","b"});
        System.out.println(strList);
        //strList.add("c");
        //strList.remove("a");
        System.out.println(strList);
        //方法2：
        String [] temp =new String[]{"a","b"};
        List<String> listTemp = new ArrayList<String>();
        for(String st:temp){
            listTemp.add(st);
        }
        System.out.println(listTemp);
        //方法3：
        List<String> listTemp1 = new ArrayList(Arrays.asList(temp));
        System.out.println(listTemp1);
        listTemp1.add("d");
        System.out.println(listTemp1);
        //方法4：

    }

}
