package cn.ggp.domain;

/**
 * @author ggp
 * @version V1.0
 * @Package cn.ggp.domain
 * @date 2019/6/24 18:15
 * @Copyright © 2019-2020
 */
public class ItemsMain {
    public static void main(String[] args) {
        Items items = new Items();
        items.setSex(1);

        System.out.println(items.getSexStr());
    }
}
