package com.example.demo.service.impl;

import com.example.demo.entity.TbUser;
import com.example.demo.service.TbUserService;
import com.example.demo.dao.TbUserDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户表(TbUser)表服务实现类
 *
 * @author Helen
 * @since 2020-06-01 16:31:35
 */
@Service("tbUserService")
public class TbUserServiceImpl  extends ServiceImpl<TbUserDao, TbUser>  implements TbUserService {
  
}