package org.lion.core.utils;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * base64,md5,sha等加密
 * Created by chenll on 2016/12/27.
 */
public class EncryptionUtil {
    public static void main(String[] args) {
        System.out.println("base64: " + base64Encode("9999-ddd-333-fff"));

        System.out.println("Debase64: " +new String(base64Decode("OTk5OS1kZGQtMzMzLWZmZg==")) );
    }

    /**
     * base64编码
     * @param data
     * @return
     */
    public static String base64Encode(String data){
        return Base64.encodeBase64String(data.getBytes());
    }

    /**
     * base64解码
     * @param data
     * @return
     */
    public static byte[] base64Decode(String data){
        return Base64.decodeBase64(data.getBytes());
    }

    public static String md5(String data) {
        return DigestUtils.md5Hex(data);
    }

    public static byte[] sha1(String data) {
        return DigestUtils.sha1(data);
    }

    public static String sha256Hex(String data) {
        return DigestUtils.sha256Hex(data);
    }
}
