package com.xgz.shortlink.admin.utils;

import org.junit.jupiter.api.Test;

/**
 * @Author xuguozhu
 * @Create 2024/4/12 18:58
 * Level:
 * Description:  如何生成不唯一的gid
 */

/**
 * 这是一个生成随机id的工具类
 * 如果想要生成一个不重复的id?
 *     -使用set集合存储并保存在数据库中或者redis中
 */
public class RandomNumberGenerate {
    public static String generateRandomString(int length) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (alphabet.length() * Math.random());
            sb.append(alphabet.charAt(index));
        }
        return sb.toString();
    }
    @Test
    public void test(){
        String s = generateRandomString(6);
        System.out.println("s = " + s);}
}
