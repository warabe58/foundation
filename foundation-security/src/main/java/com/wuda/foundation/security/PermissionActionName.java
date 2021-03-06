package com.wuda.foundation.security;

import com.wuda.foundation.lang.UniqueCodeDescriptor;

/**
 * 对于文件来说,可以是read,write,为了防止字符串散落在代码各处,
 * 因此用强类型管理,实现类推荐使用枚举实现该接口.
 *
 * <a href ="https://docs.microsoft.com/en-us/aspnet/core/mvc/controllers/routing?view=aspnetcore-3.1">英文单词来源</a>
 */
public interface PermissionActionName extends UniqueCodeDescriptor<String> {

    default Class<PermissionActionNameSchema> getSchemaClass(){
        return PermissionActionNameSchema.class;
    }
}
