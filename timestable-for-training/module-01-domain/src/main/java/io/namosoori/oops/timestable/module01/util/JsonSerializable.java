/*
 * COPYRIGHT (c) NEXTREE Inc. 2014
 * This software is the proprietary of NEXTREE Inc.
 * @since 2014. 6. 10.
 */

package io.namosoori.oops.timestable.module01.util;

public interface JsonSerializable {
    //
    default String toJson() {
        //
        return JsonUtil.toJson(this);
    }

    default String toPrettyJson() {
        //
        return JsonUtil.toPrettyJson(this);
    }
}
