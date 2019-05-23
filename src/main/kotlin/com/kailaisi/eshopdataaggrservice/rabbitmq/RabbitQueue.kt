package com.kailaisi.eshopdataaggrservice.rabbitmq

/**
 *描述：rabbit消息队列
 *<p/>作者：wu
 *<br/>创建时间：2019/5/20 15:57
 */
object RabbitQueue {
    val DATA_CHANGE_QUEUE: String = "data-change-queue"
    val AGGR_DATA_CHANGE_QUEUE: String = "aggr-data-change-queue"
}


/**
 * 数据修改对应的数据
 */
class DataChange(var event_type: String, var data_type: String, var id: Long, var productId: Long?)

/**
 * 聚合数据修改对应的数据
 */
class AggrDataChange(var dim_type: String, var id: Long, var productId: Long?)

/**
 * 数据修改类型
 */
object EventType {
    val ADD: String = "add"
    val DELETE: String = "delete"
    val UPDATE: String = "update"
}

/**
 * 数据修改类型
 */
object DataType {
    val BRAND: String = "brand"
    val CATEGORY: String = "category"
    val PRODUCT_DESC: String = "productDesc"
    val PRODUCT_PROPERTY: String = "productProperty"
    val PRODUCT: String = "product"
    val PRODUCT_SPECIFICATION: String = "productSpecification"
}