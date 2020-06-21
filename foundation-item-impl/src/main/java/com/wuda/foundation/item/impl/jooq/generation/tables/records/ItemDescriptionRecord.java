/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.item.impl.jooq.generation.tables.records;


import com.wuda.foundation.item.impl.jooq.generation.tables.ItemDescription;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * item的描述信息，通常作为详情的一个字段，但是，由于描述信息通常内容较多，很多orm框架都是select *，分开了可以避免查询出来（有时候根本就没用到），而且大数据量的字段更新性能较差，如果需要更新，会影响到核心item表，因此单独作为一个表保存。也可以表示物品某个规格的描述信息，如果variation 
 * id不等于0
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemDescriptionRecord extends UpdatableRecordImpl<ItemDescriptionRecord> implements Record9<ULong, ULong, ULong, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = -1622211278;

    /**
     * Setter for <code>item.item_description.item_description_id</code>.
     */
    public void setItemDescriptionId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>item.item_description.item_description_id</code>.
     */
    public ULong getItemDescriptionId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>item.item_description.item_id</code>.
     */
    public void setItemId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>item.item_description.item_id</code>.
     */
    public ULong getItemId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>item.item_description.item_variation_id</code>.
     */
    public void setItemVariationId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>item.item_description.item_variation_id</code>.
     */
    public ULong getItemVariationId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>item.item_description.content</code>. 描述内容
     */
    public void setContent(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>item.item_description.content</code>. 描述内容
     */
    public String getContent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>item.item_description.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>item.item_description.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>item.item_description.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>item.item_description.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>item.item_description.last_modify_time</code>.
     */
    public void setLastModifyTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>item.item_description.last_modify_time</code>.
     */
    public LocalDateTime getLastModifyTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>item.item_description.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>item.item_description.last_modify_user_id</code>.
     */
    public ULong getLastModifyUserId() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>item.item_description.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>item.item_description.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, ULong, ULong, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<ULong, ULong, ULong, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return ItemDescription.ITEM_DESCRIPTION.ITEM_DESCRIPTION_ID;
    }

    @Override
    public Field<ULong> field2() {
        return ItemDescription.ITEM_DESCRIPTION.ITEM_ID;
    }

    @Override
    public Field<ULong> field3() {
        return ItemDescription.ITEM_DESCRIPTION.ITEM_VARIATION_ID;
    }

    @Override
    public Field<String> field4() {
        return ItemDescription.ITEM_DESCRIPTION.CONTENT;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return ItemDescription.ITEM_DESCRIPTION.CREATE_TIME;
    }

    @Override
    public Field<ULong> field6() {
        return ItemDescription.ITEM_DESCRIPTION.CREATE_USER_ID;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return ItemDescription.ITEM_DESCRIPTION.LAST_MODIFY_TIME;
    }

    @Override
    public Field<ULong> field8() {
        return ItemDescription.ITEM_DESCRIPTION.LAST_MODIFY_USER_ID;
    }

    @Override
    public Field<ULong> field9() {
        return ItemDescription.ITEM_DESCRIPTION.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getItemDescriptionId();
    }

    @Override
    public ULong component2() {
        return getItemId();
    }

    @Override
    public ULong component3() {
        return getItemVariationId();
    }

    @Override
    public String component4() {
        return getContent();
    }

    @Override
    public LocalDateTime component5() {
        return getCreateTime();
    }

    @Override
    public ULong component6() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime component7() {
        return getLastModifyTime();
    }

    @Override
    public ULong component8() {
        return getLastModifyUserId();
    }

    @Override
    public ULong component9() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getItemDescriptionId();
    }

    @Override
    public ULong value2() {
        return getItemId();
    }

    @Override
    public ULong value3() {
        return getItemVariationId();
    }

    @Override
    public String value4() {
        return getContent();
    }

    @Override
    public LocalDateTime value5() {
        return getCreateTime();
    }

    @Override
    public ULong value6() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime value7() {
        return getLastModifyTime();
    }

    @Override
    public ULong value8() {
        return getLastModifyUserId();
    }

    @Override
    public ULong value9() {
        return getIsDeleted();
    }

    @Override
    public ItemDescriptionRecord value1(ULong value) {
        setItemDescriptionId(value);
        return this;
    }

    @Override
    public ItemDescriptionRecord value2(ULong value) {
        setItemId(value);
        return this;
    }

    @Override
    public ItemDescriptionRecord value3(ULong value) {
        setItemVariationId(value);
        return this;
    }

    @Override
    public ItemDescriptionRecord value4(String value) {
        setContent(value);
        return this;
    }

    @Override
    public ItemDescriptionRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public ItemDescriptionRecord value6(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public ItemDescriptionRecord value7(LocalDateTime value) {
        setLastModifyTime(value);
        return this;
    }

    @Override
    public ItemDescriptionRecord value8(ULong value) {
        setLastModifyUserId(value);
        return this;
    }

    @Override
    public ItemDescriptionRecord value9(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public ItemDescriptionRecord values(ULong value1, ULong value2, ULong value3, String value4, LocalDateTime value5, ULong value6, LocalDateTime value7, ULong value8, ULong value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ItemDescriptionRecord
     */
    public ItemDescriptionRecord() {
        super(ItemDescription.ITEM_DESCRIPTION);
    }

    /**
     * Create a detached, initialised ItemDescriptionRecord
     */
    public ItemDescriptionRecord(ULong itemDescriptionId, ULong itemId, ULong itemVariationId, String content, LocalDateTime createTime, ULong createUserId, LocalDateTime lastModifyTime, ULong lastModifyUserId, ULong isDeleted) {
        super(ItemDescription.ITEM_DESCRIPTION);

        set(0, itemDescriptionId);
        set(1, itemId);
        set(2, itemVariationId);
        set(3, content);
        set(4, createTime);
        set(5, createUserId);
        set(6, lastModifyTime);
        set(7, lastModifyUserId);
        set(8, isDeleted);
    }
}
