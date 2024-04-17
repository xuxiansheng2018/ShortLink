package com.xgz.shortlink.project.utils;

/**
 * @Author xuguozhu
 * @Create 2024/4/16 15:49
 * Level:
 * Description:
 */

import cn.hutool.core.lang.hash.MurmurHash;
import org.junit.jupiter.api.Test;

/**
 * HASH 工具类
 */
public class HashUtil {

    private static final char[] CHARS = new char[]{
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    private static final int SIZE = CHARS.length;

    // TODO: 2024/4/16  没看懂
    private static String convertDecToBase62(long num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int i = (int) (num % SIZE);
            sb.append(CHARS[i]);
            num /= SIZE;
        }
        return sb.reverse().toString();
    }

    public static String hashToBase62(String str) {
        int i = MurmurHash.hash32(str);
        System.out.println("i = " + i);
        long num = i < 0 ? Integer.MAX_VALUE - (long) i : i;
        System.out.println("num = " + num);
        return convertDecToBase62(num);
    }

    @Test
    public void test(){
        String s = hashToBase62("xvcbcvxbdf");
        System.out.println("s = " + s);


    }



}