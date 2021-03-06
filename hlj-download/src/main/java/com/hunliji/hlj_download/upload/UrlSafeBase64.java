package com.hunliji.hlj_download.upload;

import android.util.Base64;

import java.io.UnsupportedEncodingException;

/**
 * URL安全的Base64编码和解码
 */
final class UrlSafeBase64 {

    /**
     * 编码字符串
     *
     * @param data 待编码字符串
     * @return 结果字符串
     */
    public static String encodeToString(String data) {
        try {
            return encodeToString(data.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            //never in
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 编码数据
     *
     * @param data 字节数组
     * @return 结果字符串
     */
    public static String encodeToString(byte[] data) {
        return Base64.encodeToString(data, Base64.URL_SAFE | Base64.NO_WRAP);
    }

    /**
     * 解码数据
     *
     * @param data 编码过的字符串
     * @return 原始数据
     */
    public static byte[] decode(String data) {
        return Base64.decode(data, Base64.URL_SAFE | Base64.NO_WRAP);
    }
}
