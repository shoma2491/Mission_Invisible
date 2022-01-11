package springboot_t7.mission_invisible.model;

import org.springframework.stereotype.Component;

@Component
public interface MatchMapper{

    /**
     * @param match
     */
    @Insert("INSERT INTO match (userId,turn,imgNum) VALUES (#{userId},#{turn},#{imgNum});")
    void insertMatch(int userId,int turn,int imgNum);

    @Select("SELECT COUNT(*) FROM MATCH WHERE USERID = #{userId} AND TURN = #{turn};")
    int countByIdAndTurn(int userId, int turn);

    @Select("SELECT IMGNUM FROM MATCH WHERE USERID = #{userId} AND TURN = #{turn};")
    int selectImgNumByIdAndTurn(int userId, int turn);

    @Select("SELECT USERID FROM MATCH WHERE TURN = #{turn} AND imgNum = #{imgNum} AND userId NOT LIKE #{userId};")
    ArrayList<Integer> selectUserIdNotOniId(int turn,int imgNum,int userId);

    @Select("SELECT COUNT(*) FROM MATCH WHERE TURN = #{turn} AND imgNum = #{imgNum} AND userId NOT LIKE #{userId};")
    int countUserIdNotOniId(int turn,int imgNum,int userId);
}
