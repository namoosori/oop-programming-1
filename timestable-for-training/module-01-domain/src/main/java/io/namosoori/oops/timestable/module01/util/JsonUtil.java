/*
 * COPYRIGHT (c) NEXTREE Inc. 2014
 * This software is the proprietary of NEXTREE Inc.
 * @since 2014. 6. 10.
 */

package io.namosoori.oops.timestable.module01.util;


import com.fatboyindustrial.gsonjavatime.Converters;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JsonUtil {
    //
    private static final Gson prettyGson = Converters.registerZonedDateTime(new GsonBuilder()).setPrettyPrinting().create();
    private static final Gson gson = Converters.registerZonedDateTime(new GsonBuilder()).create();

    public static String toJson(Object object) {
        //
        return gson.toJson(object);
    }

    public static String toJson(Object object, boolean returnNull) {
        //
        if (returnNull && object == null) {
            return null;
        }
        return gson.toJson(object);
    }

    public static String toPrettyJson(Object object) {
        //
        return prettyGson.toJson(object);
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        //
        return gson.fromJson(json, clazz);
    }

    public static <T> T fromJson(String jsonString, Type type) {
        //
        return gson.fromJson(jsonString, type);
    }

    public static <T> List<T> fromJsonList(String json, Class<T> valueType) {
        //
        if(json == null) {
            return null;
        }
        List<T> ObjectList = new ArrayList<>();
        if (StringUtil.isEmpty(json)) {
            return ObjectList;
        }
        Type collectionType = new ListParameterizedType(valueType);
        Collection<T> links = gson.fromJson(json, collectionType);
        if (links == null || links.isEmpty()) {
            return ObjectList;
        }
        ObjectList.addAll(links);
        return ObjectList;
    }

    private static class ListParameterizedType implements ParameterizedType {
        //
        private final Type type;

        private ListParameterizedType(Type type) {
            this.type = type;
        }

        public Type[] getActualTypeArguments() {
            return new Type[] {type};
        }
        public Type getRawType() {
            return Collection.class;
        }
        public Type getOwnerType() {
            return null;
        }
    }
}
