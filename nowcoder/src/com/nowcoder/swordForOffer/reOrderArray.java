package com.nowcoder.swordForOffer;

import java.util.Arrays;
import java.util.Stack;

public class reOrderArray {
    public static void main(String[] args)
    {
        int[] array = new int[]{4,6,5,8,7,9,3,1};
        reOrderArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reOrderArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        Stack<Integer> bounds = new Stack<>();
        bounds.push(left);
        bounds.push(right);
        boolean boundFlag = true;
        while (!bounds.empty()) {
            right = bounds.pop();
            left = bounds.pop();
            System.out.println("left: " + left + ", right: " + right);
            if (left != right && boundFlag) {
                int mid = (left + right) / 2;
                bounds.push(left);
                bounds.push(mid);
                bounds.push(mid + 1);
                bounds.push(right);
                continue;
            }
            boundFlag = false;
        }
    }
//        while(left != right)
//        {
//            int mid = (left + right)/2;
//            bounds.push(left);
//            bounds.push(mid);
//            bounds.push(right);
//            System.out.println("left: " + left + ", mid: " + mid + ", right: " + right);
//        }
//        int[] temp = new int[array.length];
//        while(!bounds.empty()){
//            int arrayRight = bounds.pop();
//            int arrayMid = bounds.pop();
//            int arrayLeft = bounds.pop();
//            System.out.println("left: " + arrayLeft + ", mid: " + arrayMid + ", right: " + arrayRight);
//            for(int i = arrayLeft; i <= arrayRight; i++)
//            {
//                temp[i] = array[i];
//            }
//            int i1 = arrayLeft, i2 = arrayMid+1;
//            for(int curr = arrayLeft; curr <= arrayRight; curr++)
//            {
//                // 左半部分的子串被合并完了，直接把右部的子串合并进目标串的尾部
//                if(i1 == i2){
//                    array[curr] = temp[i2++];
//                }
//                // 右半部分的子串被合并完了
//                else if(i2 > arrayRight){
//                    array[curr] = temp[i1++];
//                }
//                // 左半部分子串的当前值小于右半部分子串的当前值
//                else if(array[i1] < array[i2]){
//                    array[curr] = array[i1++];
//                }
//                // 右半部分子串的当前值小于左半部分子串的当前值
//                else {
//                    array[curr] = array[i2++];
//                }
//            }
//        }
//    }

//    private static void reOrderArray(int[] array)
//    {
//        LinkedList<Integer> oddNumber = new LinkedList<>();
//        LinkedList<Integer> evenNumber = new LinkedList<>();
//        for(int i = 0; i < array.length; i++)
//        {
//            if(array[i]%2==0)
//            {
//                evenNumber.add(array[i]);
//            }
//            else{
//                oddNumber.add(array[i]);
//            }
//        }
//        int j = 0;
//        for(int i = 0; i < oddNumber.size(); i++)
//        {
//            array[j++] = oddNumber.get(i);
//        }
//        for(int i = 0; i < evenNumber.size(); i++)
//        {
//            array[j++] = evenNumber.get(i);
//        }
//    }

}
