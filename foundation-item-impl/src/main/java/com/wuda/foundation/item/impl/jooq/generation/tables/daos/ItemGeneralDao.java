/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.item.impl.jooq.generation.tables.daos;


import com.wuda.foundation.item.impl.jooq.generation.tables.ItemGeneral;
import com.wuda.foundation.item.impl.jooq.generation.tables.records.ItemGeneralRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.ULong;


/**
 * 物品基本信息，也可以表示物品某个规格的基本信息，如果variation id不等于0
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemGeneralDao extends DAOImpl<ItemGeneralRecord, com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral, ULong> {

    /**
     * Create a new ItemGeneralDao without any configuration
     */
    public ItemGeneralDao() {
        super(ItemGeneral.ITEM_GENERAL, com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral.class);
    }

    /**
     * Create a new ItemGeneralDao with an attached configuration
     */
    public ItemGeneralDao(Configuration configuration) {
        super(ItemGeneral.ITEM_GENERAL, com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral object) {
        return object.getItemGeneralId();
    }

    /**
     * Fetch records that have <code>item_general_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral> fetchRangeOfItemGeneralId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemGeneral.ITEM_GENERAL.ITEM_GENERAL_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>item_general_id IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral> fetchByItemGeneralId(ULong... values) {
        return fetch(ItemGeneral.ITEM_GENERAL.ITEM_GENERAL_ID, values);
    }

    /**
     * Fetch a unique record that has <code>item_general_id = value</code>
     */
    public com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral fetchOneByItemGeneralId(ULong value) {
        return fetchOne(ItemGeneral.ITEM_GENERAL.ITEM_GENERAL_ID, value);
    }

    /**
     * Fetch records that have <code>item_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral> fetchRangeOfItemId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemGeneral.ITEM_GENERAL.ITEM_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>item_id IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral> fetchByItemId(ULong... values) {
        return fetch(ItemGeneral.ITEM_GENERAL.ITEM_ID, values);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(ItemGeneral.ITEM_GENERAL.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral> fetchByName(String... values) {
        return fetch(ItemGeneral.ITEM_GENERAL.NAME, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(ItemGeneral.ITEM_GENERAL.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral> fetchByCreateTime(LocalDateTime... values) {
        return fetch(ItemGeneral.ITEM_GENERAL.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemGeneral.ITEM_GENERAL.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral> fetchByCreateUserId(ULong... values) {
        return fetch(ItemGeneral.ITEM_GENERAL.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral> fetchRangeOfLastModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(ItemGeneral.ITEM_GENERAL.LAST_MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_time IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral> fetchByLastModifyTime(LocalDateTime... values) {
        return fetch(ItemGeneral.ITEM_GENERAL.LAST_MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>last_modify_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral> fetchRangeOfLastModifyUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemGeneral.ITEM_GENERAL.LAST_MODIFY_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral> fetchByLastModifyUserId(ULong... values) {
        return fetch(ItemGeneral.ITEM_GENERAL.LAST_MODIFY_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemGeneral.ITEM_GENERAL.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemGeneral> fetchByIsDeleted(ULong... values) {
        return fetch(ItemGeneral.ITEM_GENERAL.IS_DELETED, values);
    }
}