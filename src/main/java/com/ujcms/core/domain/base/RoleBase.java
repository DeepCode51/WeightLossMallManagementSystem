package com.ujcms.core.domain.base;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.lang.Nullable;

/**
 * This class was generated by MyBatis Generator.
 *
 * @author MyBatis Generator
 */
public class RoleBase {
    /**
     * 数据库表名
     */
    public static final String TABLE_NAME = "role";

    /**
     * 角色ID
     */
    @NotNull
    private Integer id = 0;

    /**
     * 站点ID
     */
    @Nullable
    private Integer siteId;

    /**
     * 名称
     */
    @Length(max = 50)
    @NotNull
    private String name = "";

    /**
     * 描述
     */
    @Length(max = 300)
    @Nullable
    private String description;

    /**
     * 等级
     */
    @NotNull
    private Short rank = 32767;

    /**
     * 排序
     */
    @NotNull
    private Short order = 32767;

    /**
     * 功能权限
     */
    @Nullable
    private String permission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Nullable
    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(@Nullable Integer siteId) {
        this.siteId = siteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }

    public Short getRank() {
        return rank;
    }

    public void setRank(Short rank) {
        this.rank = rank;
    }

    public Short getOrder() {
        return order;
    }

    public void setOrder(Short order) {
        this.order = order;
    }

    @Nullable
    public String getPermission() {
        return permission;
    }

    public void setPermission(@Nullable String permission) {
        this.permission = permission;
    }
}