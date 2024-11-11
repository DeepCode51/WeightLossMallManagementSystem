package com.ujcms.core.mapper;

import com.ujcms.core.domain.Storage;
import com.ofwise.util.query.QueryInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 存储 Mapper
 *
 * @author PONY
 */
@Mapper
@Repository
public interface StorageMapper {
    /**
     * 插入数据
     *
     * @param bean 实体对象
     * @return 插入条数
     */
    int insert(Storage bean);

    /**
     * 更新数据
     *
     * @param bean 实体对象
     * @return 更新条数
     */
    int update(Storage bean);

    /**
     * 删除数据
     *
     * @param id 主键ID
     * @return 删除条数
     */
    int delete(Integer id);

    /**
     * 根据主键获取数据
     *
     * @param id 主键ID
     * @return 实体对象。没有找到数据，则返回 {@code null}
     */
    @Nullable
    Storage select(Integer id);

    /**
     * 根据查询条件获取列表
     *
     * @param queryInfo 查询条件
     * @return 数据列表
     */
    List<Storage> selectAll(@Nullable @Param("queryInfo") QueryInfo queryInfo);

    /**
     * 根据类型获取列表
     *
     * @param mode 存储类型
     * @return 数据列表
     */
    List<Storage> listByMode(short mode);
}