package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016/10/12.
 */
public class ListTest {
    public List courseToSelect;

    public ListTest() {
        this.courseToSelect = new ArrayList();
    }

    /**
     * 用于往coursesToSelect中添加课程
     */
    public void testAdd() {
        //创建一个课程对象,并通过调用add方法添加到List中
        Course cr1 = new Course("1", "数据结构");
        courseToSelect.add(cr1);
        Course temp = (Course) courseToSelect.get(0);
        System.out.println("添加了课程"+temp.id+":"+temp.name);

        Course cr2 = new Course("2","C语言");
        courseToSelect.add(0,cr2);
        Course temp2 = (Course) courseToSelect.get(0);
        System.out.println("添加了课程"+temp2.id+":"+temp2.name);

        Course cr3 = new Course("3","test");
//        courseToSelect.add(4,);
    }

    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.testAdd();
    }
}
