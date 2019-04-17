package com.wx.assigntask.dao;

import com.wx.assigntask.entity.Divided;
import com.wx.assigntask.entity.Orderlist;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface OrderlistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderlist
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderlist
     *
     * @mbg.generated
     */
    int insert(Orderlist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderlist
     *
     * @mbg.generated
     */
    Orderlist selectByPrimaryKey(Integer id);

    /**
     * 查询某个算法的有序推荐结果
     * @param releaseid
     * @param algname
     * @return
     */
    List<Orderlist> selectAlgAll(int releaseid,String algname);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderlist
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Orderlist record);
    int updateLstmById(Orderlist record);
    int updateNnById(Orderlist record);
    int updateCnnById(Orderlist record);
    int updateTfidfById(Orderlist record);
    int updateDocById(Orderlist record);
    int updateIndexById(Orderlist record);

    void insertLstmRecord(Orderlist orderlist);
    void insertNnRecord(Orderlist orderlist);
    void insertCnnRecord(Orderlist orderlist);
    void insertTfidfRecord(Orderlist orderlist);
    void insertDocRecord(Orderlist orderlist);
    void insertIndexRecord(Orderlist orderlist);

    /**
     * 有序表里查找某个算法的有序推荐结果
     * @param releaseid
     * @param inputid
     * @param algname
     * @return
     */
    List<Orderlist> selectOrderedReco(int releaseid,int inputid,String algname); //order by score
    List<Orderlist> selectLstmByDividedid(int dividedid); //order by score
    List<Orderlist> selectNnByDividedid(int dividedid);
    List<Orderlist> selectCnnByDividedid(int dividedid);
    List<Orderlist> selectTfiByDividedid(int dividedid);
    List<Orderlist> selectDocByDividedid(int dividedid);
    List<Orderlist> selectIndexByDividedid(int dividedid);

    List<Orderlist> selectLstmRecord(Orderlist orderlist);
    List<Orderlist> selectNnRecord(Orderlist orderlist);
    List<Orderlist> selectCnnRecord(Orderlist orderlist);
    List<Orderlist> selectTfiRecord(Orderlist orderlist);
    List<Orderlist> selectDocRecord(Orderlist orderlist);
    List<Orderlist> selectIndexRecord(Orderlist orderlist);


}