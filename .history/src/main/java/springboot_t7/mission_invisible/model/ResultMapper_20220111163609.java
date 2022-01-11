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
     * @param match
     */
    /** UPDATE RESULT SET USER1=1 WHERE TURN=1; */
    @Update("UPDATE RESULT SET USER1=#{user1} WHERE TURN=#{turn}")
    void updateByUser1(int )
}