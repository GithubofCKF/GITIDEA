package com.ckf.java;

import com.ckf.bean.Customer;

import java.util.ArrayList;

/**
 * @author ckf
 * @DATE 2020/6/11 - 13:33
 */
public class TemplatesTest {

    //模板六：prsf生成 private static final
    private static final Customer CUST = new Customer();
    //变形：psf
    public static final int NUM = 1;
    //变形：psfi/psfs
    public static final int NUM2 = 2;
    public static final String MSG = "china";



    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println();
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num = 10;
        System.out.println("num = " + num);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num);

        //模板三：fori
        String[] arr = new String[]{"tom","jerry","han"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }


        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Object o : list) {

        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形:list.forr倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }


    }

    public void method(){
        System.out.println("TemplatesTest.method");

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        //模板五:ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }
        //变形:xx.nn/xxx.n
        if (list != null) {

        }
    }
}
