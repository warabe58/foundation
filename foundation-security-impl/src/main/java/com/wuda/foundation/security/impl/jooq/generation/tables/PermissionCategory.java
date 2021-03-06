/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.security.impl.jooq.generation.tables;


import com.wuda.foundation.security.impl.jooq.generation.FoundationSecurity;
import com.wuda.foundation.security.impl.jooq.generation.Indexes;
import com.wuda.foundation.security.impl.jooq.generation.Keys;
import com.wuda.foundation.security.impl.jooq.generation.tables.records.PermissionCategoryRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * permission分类
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PermissionCategory extends TableImpl<PermissionCategoryRecord> {

    private static final long serialVersionUID = -1892322872;

    /**
     * The reference instance of <code>foundation_security.permission_category</code>
     */
    public static final PermissionCategory PERMISSION_CATEGORY = new PermissionCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PermissionCategoryRecord> getRecordType() {
        return PermissionCategoryRecord.class;
    }

    /**
     * The column <code>foundation_security.permission_category.permission_category_id</code>.
     */
    public final TableField<PermissionCategoryRecord, ULong> PERMISSION_CATEGORY_ID = createField(DSL.name("permission_category_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_security.permission_category.parent_id</code>. 父级
     */
    public final TableField<PermissionCategoryRecord, ULong> PARENT_ID = createField(DSL.name("parent_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "父级");

    /**
     * The column <code>foundation_security.permission_category.name</code>. category name
     */
    public final TableField<PermissionCategoryRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "category name");

    /**
     * The column <code>foundation_security.permission_category.description</code>. 描述
     */
    public final TableField<PermissionCategoryRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "描述");

    /**
     * The column <code>foundation_security.permission_category.create_time</code>.
     */
    public final TableField<PermissionCategoryRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_security.permission_category.create_user_id</code>.
     */
    public final TableField<PermissionCategoryRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_security.permission_category.last_modify_time</code>.
     */
    public final TableField<PermissionCategoryRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_security.permission_category.last_modify_user_id</code>.
     */
    public final TableField<PermissionCategoryRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_security.permission_category.is_deleted</code>.
     */
    public final TableField<PermissionCategoryRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_security.permission_category</code> table reference
     */
    public PermissionCategory() {
        this(DSL.name("permission_category"), null);
    }

    /**
     * Create an aliased <code>foundation_security.permission_category</code> table reference
     */
    public PermissionCategory(String alias) {
        this(DSL.name(alias), PERMISSION_CATEGORY);
    }

    /**
     * Create an aliased <code>foundation_security.permission_category</code> table reference
     */
    public PermissionCategory(Name alias) {
        this(alias, PERMISSION_CATEGORY);
    }

    private PermissionCategory(Name alias, Table<PermissionCategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private PermissionCategory(Name alias, Table<PermissionCategoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("permission分类"), TableOptions.table());
    }

    public <O extends Record> PermissionCategory(Table<O> child, ForeignKey<O, PermissionCategoryRecord> key) {
        super(child, key, PERMISSION_CATEGORY);
    }

    @Override
    public Schema getSchema() {
        return FoundationSecurity.FOUNDATION_SECURITY;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PERMISSION_CATEGORY_IDX_PARENT_ID);
    }

    @Override
    public UniqueKey<PermissionCategoryRecord> getPrimaryKey() {
        return Keys.KEY_PERMISSION_CATEGORY_PRIMARY;
    }

    @Override
    public List<UniqueKey<PermissionCategoryRecord>> getKeys() {
        return Arrays.<UniqueKey<PermissionCategoryRecord>>asList(Keys.KEY_PERMISSION_CATEGORY_PRIMARY, Keys.KEY_PERMISSION_CATEGORY_PERMISSION_CATEGORY_ID);
    }

    @Override
    public PermissionCategory as(String alias) {
        return new PermissionCategory(DSL.name(alias), this);
    }

    @Override
    public PermissionCategory as(Name alias) {
        return new PermissionCategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PermissionCategory rename(String name) {
        return new PermissionCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PermissionCategory rename(Name name) {
        return new PermissionCategory(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, ULong, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
