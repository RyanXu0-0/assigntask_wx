package com.wx.assigntask.dao;

import com.wx.assigntask.entity.Recommend;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RecommandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recommand
     *
     * @mbg.generated
     */
    int insert(Recommend record);

    /**
     * 查找某个算法对应的所有推荐结果
     * @param tablename
     * @return
     */
    List<Recommend> selectAll(String tablename);

}