package com.max.b2c.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public class JsonXMLUtils {

    /**
     *序列化，将pojo对象转为json对象
      * @param object
     * @return
     * @throws Exception
     */
    public static String obj2json(Object object) throws Exception{
            return JSON.toJSONString(object);
        }

    /**
     * 反序列化，将json对象转为pojo对象
     * @param jsonStr
     * @param clazz
     * @param <T>
     * @return
     * @throws Exception
     */
        public static  <T> T json2obj(String jsonStr,Class<T> clazz) throws Exception{
            return JSON.parseObject(jsonStr,clazz);
        }



        public static  <T> Map<String,Object> json2map(String jsonstr) throws Exception{
            return JSON.parseObject(jsonstr, Map.class);
        }

        public static <T> T map2object(Map<?,?> map,Class<T> clazz) throws Exception{
            return JSON.parseObject(JSON.toJSONString(map),clazz);
        }

    /**
     * 从json对象中获得指定属性的值
     * @param str
     * @return
     * @throws Exception
     */
        public static JSONObject objectjson(String str) throws Exception{
            return JSON.parseObject(str);
        }

        public static <T> String objectToJson(T t){
            return JSONObject.toJSONString(t);
    }
}
