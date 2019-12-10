package com.zlm.tk.service;

import com.zlm.tk.mapper.CommentMapper;
import com.zlm.tk.model.Comment;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author heps
 * @date 2019/8/16 21:27
 */
@Service
public class CommentService {

    private CommentMapper commentMapper;

    public CommentService(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    public List<Comment> selectByBuyerNick(String buyerNick) {
        Example example = new Example(Comment.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("buyerNick", "abc");
        return commentMapper.selectByExample(example);
    }
}
