package com.max.b2c.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableUtil {

    /**
     * LOGGER
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(SerializableUtil.class);

    /**
     * 序列化
     *
     * @param object
     * @return byte[]
     * @author Wang926454
     * @date 2018/9/4 15:14
     */
//    public static byte[] serializable(Object object) {
//        ByteArrayOutputStream baos = null;
//        ObjectOutputStream oos = null;
//        try {
//            baos = new ByteArrayOutputStream();
//            oos = new ObjectOutputStream(baos);
//            oos.writeObject(object);
//            return baos.toByteArray();
//        } catch (IOException e) {
//            LOGGER.error("SerializableUtil工具类序列化出现IOException异常:" + e.getMessage());
//            throw new CustomException("SerializableUtil工具类序列化出现IOException异常:" + e.getMessage());
//        } finally {
//            try {
//                if (oos != null) {
//                    oos.close();
//                }
//                if (baos != null) {
//                    baos.close();
//                }
//            } catch (IOException e) {
//                LOGGER.error("SerializableUtil工具类反序列化出现IOException异常:" + e.getMessage());
//                throw new CustomException("SerializableUtil工具类反序列化出现IOException异常:" + e.getMessage());
//            }
//        }
//
//    }
//
//    /**
//     * 反序列化
//     *
//     * @param bytes
//     * @return java.lang.Object
//     * @author Wang926454
//     * @date 2018/9/4 15:14
//     */
//    public static Object unserializable(byte[] bytes) {
//        ByteArrayInputStream bais = null;
//        ObjectInputStream ois = null;
//        try {
//            bais = new ByteArrayInputStream(bytes);
//            ois = new ObjectInputStream(bais);
//            return (byte[]) ois.readObject();
//        } catch (ClassNotFoundException e) {
//            LOGGER.error("SerializableUtil工具类反序列化出现ClassNotFoundException异常:" + e.getMessage());
//            throw new CustomException("SerializableUtil工具类反序列化出现ClassNotFoundException异常:" + e.getMessage());
//        } catch (IOException e) {
//            LOGGER.error("SerializableUtil工具类反序列化出现IOException异常:" + e.getMessage());
//            throw new CustomException("SerializableUtil工具类反序列化出现IOException异常:" + e.getMessage());
//        } finally {
//            try {
//                if (ois != null) {
//                    ois.close();
//                }
//                if (bais != null) {
//                    bais.close();
//                }
//            } catch (IOException e) {
//                LOGGER.error("SerializableUtil工具类反序列化出现IOException异常:" + e.getMessage());
//                throw new CustomException("SerializableUtil工具类反序列化出现IOException异常:" + e.getMessage());
//            }
//        }
//    }
    /**
     * 序列化
     * @param t
     * @return
     * @throws Exception
     */
    public static <T> byte[] serializable(T t) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(t);
        byte[] b = bos.toByteArray();
        bos.close();
        oos.close();
        return b;
    }


    /**
     * 反序列化
     * @param b
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public static <T> T unserializable(byte[] b) throws Exception {
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        ObjectInputStream ois = new ObjectInputStream(bis);
        T t = (T) ois.readObject();
        bis.close();
        ois.close();
        return t;
    }
}
