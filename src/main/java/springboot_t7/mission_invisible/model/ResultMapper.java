package springboot_t7.mission_invisible.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Insert;
import java.util.ArrayList;

@Mapper
public interface ResultMapper {

    /**
     * @param result
     */
    /** UPDATE RESULT SET USER1=1 WHERE TURN=1; */
    @Update("UPDATE RESULT SET USER1=#{user1} WHERE TURN=#{turn}")
    void updateUser1(int user1, int turn);

    @Update("UPDATE RESULT SET USER2=#{user2} WHERE TURN=#{turn}")
    void updateUser2(int user2, int turn);

    @Update("UPDATE RESULT SET USER3=#{user3} WHERE TURN=#{turn}")
    void updateUser3(int user3, int turn);

    @Select("SELECT * FROM RESULT")
    ArrayList<Result> selectAll();

    @Update("UPDATE RESULT SET USER1=0, USER2=0, USER3=0")
    void resetResult();

}