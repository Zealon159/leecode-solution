package cn.zealon.linkedlist;

import java.util.LinkedList;
import java.util.Random;

/**
 * @auther: Zealon
 * @Date: 2018-10-24 10:59
 */
public class LUR {

    // 缓存容器
    private static LinkedList<Object> list = new LinkedList<Object>();
    // 容量
    private static int capacity = 10;

    public static void main(String[] args){
        System.out.println("初始大小："+list.size());
        for(int i=0;i<50;i++){
            String data = "NO"+new Random().nextInt(99);
            System.out.println("进行缓存数据，"+data);
            saveCachedData(data);
            for(int j=0;j<list.size();j++){
                System.out.print(list.get(j)+" , ");
            }
            System.out.println(" <--- 当前缓存数据");

        }
    }

    public static void saveCachedData(String newData){

        // 是否存在
        boolean exist = false;
        // 存在的位置
        int index = 0;

        // 遍历缓存
        for(int i=0;i<list.size();i++){
            if(newData.equals(list.get(i))){
                index = i;
                exist = true;
                break;
            }
        }

        // 如果此数据没有在缓存链表中
        if (!exist){
            // 如果此时缓存未满，则将此结点直接插入到链表的头部
            if(list.size() < capacity){
                list.addFirst(newData);
            }else{
                // 如果此时缓存已满，则链表尾结点删除，将新的数据结点插入链表的头部
                list.removeLast();
                list.addFirst(newData);
            }
        }else{
            // 如果此数据之前已经被缓存在链表中了，我们遍历得到这个数据对应的结点，
            // 并将其从原来的位置删除，然后再插入到链表的头部。
            list.remove(index);
            list.addFirst(newData);
        }

    }
}
