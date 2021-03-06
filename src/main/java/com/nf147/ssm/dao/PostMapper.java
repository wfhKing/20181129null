package com.nf147.ssm.dao;

import com.nf147.ssm.entity.Post;
import java.util.List;

public interface PostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer postId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated
     */
    int insert(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated
     */
    Post selectByPrimaryKey(Integer postId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated
     */
    List<Post> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Post record);
}