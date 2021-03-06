## 该Demo 由来

[是否懒得创建新项目? 想偷懒直接 copy创建新项目直接投入使用? 直接点击下载 我用双手成就你的梦想](https://github.com/XiaoZhangClassmate/SpringBoot-Demo)

##  项目配置
`⭐ 1.此项目用于 Easy Code 进行极速开发[Easy Code 操作说明](https://www.jianshu.com/p/e4192d7c6844) 

⭐  2.mybatis-plus  QueryMapper` 为您提速更快的查询 [QueryMapper官方文档](https://mp.baomidou.com/guide/)

⭐  3.默认安装 Lombok 插件

---------- 

 // 逆向工程等等速度超快,自用项目模板已经复制好了[Easy Code 配套模板](https://blog.csdn.net/github_39019743/article/details/106490633)
 
 // 如果需要  EasyCode Token-> 直接+企鹅 102309292
 
---------- 

 Easy Code配置   ![image](https://github.com/XiaoZhangClassmate/SpringBoot-Demo/blob/master/src/main/sql/1.png)
  

 


## 准备数据
⭐️ Mysql
```sql
-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `create_date` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_date` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '账号',
  `pass_word` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('4bf8dbd314e243d6ae333c7edf4c5d1e', '2020-06-01 11:49:41', '2020-06-01 11:49:43', 'admin', '123456');
INSERT INTO `tb_user` VALUES ('aed9063be8ee463ab8e831aac8c936ab', '2020-06-01 17:39:52', '2020-06-01 17:39:54', 'test', 'password');

SET FOREIGN_KEY_CHECKS = 1;
```

## 接口代码演示
```/**
     * 分页查询
     * 可以加入排序
     */
    @GetMapping(value = "/query")
    public List<TbUser> queryList() {
        QueryWrapper<TbUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id","4bf8dbd314e243d6ae333c7edf4c5d1e"); // 查询条件
        queryWrapper.orderByAsc("createDate"); // 排序
        List<TbUser> list = tbUserService.list(queryWrapper);
        return  list;
    }
```

## 项目启动后 接口测试
```
   http://localhost:8080/user/query
```

## 重要提示
```
  自定义项目 记得在启动类里面加上@MapperScan("com.example.demo.dao")注解。(com.example.demo.dao 请根据实际情况进行修改)
```
