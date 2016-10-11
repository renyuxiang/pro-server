package com.ryx.server.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密工具
 * @author ZhangJunyong
 *
 */
public class Md5Util {

    private Md5Util() {
    }

    private static final char[] DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E',
            'F' };
    public static final String LOWER = "lower";
    public static final String UPPER = "upper";

    private static char[] encodeHex(byte[] data) {

        int l = data.length;

        char[] out = new char[l << 1];

        for (int i = 0, j = 0; i < l; i++) {
            out[j++] = DIGITS[(0xF0 & data[i]) >>> 4];
            out[j++] = DIGITS[0x0F & data[i]];
        }

        return out;
    }


    public static String encode(String rawPass, String mode) {

        MessageDigest messageDigest = getMessageDigest();

        byte[] digest = messageDigest.digest(rawPass.getBytes());
        if(UPPER.equals(mode)){
            return new String(encodeHex(digest)).toUpperCase();
        }else {
            return new String(encodeHex(digest)).toLowerCase();
        }
    }

    protected final static MessageDigest getMessageDigest() throws IllegalArgumentException {
        try {
            return MessageDigest.getInstance("MD5");
        }
        catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException("No such algorithm [" + "MD5" + "]");
        }
    }

    public static boolean isPasswordValid(String encPass, String rawPass, String mode) {
        String pass1 = "" + encPass;
        String pass2 = encode(rawPass,mode);

        return pass1.equals(pass2);
    }


    public static void main(String[] args) {
        String result = Md5Util.encode("111111",UPPER);
        System.out.println("password=" + result.toUpperCase());

        boolean isGood = Md5Util.isPasswordValid("96E79218965EB72C92A549DD5A330112", "111111",UPPER);
        System.out.println("isGood=" + isGood);
    }

}
