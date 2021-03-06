package com.nowcoder.swordForOffer;

/**
 * Author: Sean
 * Date: Created In 23:08 2019/4/22
 * Title: 查找二维数组
 * Description: 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * Version: 0.1
 * Update History:
 * [Date][Version][Author] What has been done;
 */

public class FindTargetInTwoDimension {
    public static void main(String[] args){
        int[][] a = {{1,2,3,4}, {2,3,4,5}, {3,4,5,6}, {4,5,6,7}};
        System.out.println(Find2(6, a));
        System.out.println("hello world!");
    }

    public static boolean Find(int target, int[][] array){
        int row = 0, col = 0;
        for(int i = 0; i < array.length; i++){
            int low = 0;
            int high = array[i].length-1;
            while(low <= high){
                int mid = (low+high)/2;
                if(target > array[i][mid]){
                    low = mid + 1;
                }
                else if(target < array[i][mid]){
                    high = mid -1;
                }
                else {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean Find2(int target, int[][] array){
        int row = 0;
        int col = array[0].length-1;
        while(row <= array.length-1 && col >= 0){
            if(array[row][col] > target){
                col--;
            }
            else if(array[row][col] < target){
                row++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
