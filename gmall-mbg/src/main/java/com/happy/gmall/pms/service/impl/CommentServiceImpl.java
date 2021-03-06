package com.happy.gmall.pms.service.impl;

import com.happy.gmall.pms.entity.Comment;
import com.happy.gmall.pms.mapper.CommentMapper;
import com.happy.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2019-12-25
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
