package com.kailaisi.eshopdataaggrservice.util

import com.alibaba.fastjson.JSON

object FastJsonUtil {
    fun bean2Json(obj: Any): String {
        return JSON.toJSONString(obj)
    }

    fun <T> json2Bean(jsonStr: String, objClass: Class<T>): T {
        return JSON.parseObject(jsonStr, objClass)
    }
}