package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.TbUser;
import com.example.demo.service.TbUserService;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 用户表(TbUser)表控制层
 *
 * @author Helen
 * @since 2020-06-01 16:43:20
 */
@RestController
@RequestMapping("user")
public class TbUserController {
    /**
     * 服务对象
     */
    @Autowired
    private TbUserService tbUserService;

  
    /**
     * 分页查询
     */
    @GetMapping(value = "/list")
    public IPage<TbUser> queryPageList(@RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                                       @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize) {
        Page page = new Page<>(pageNo, pageSize);
        return  tbUserService .page(page);
    }

    /**
     * 分页查询
     * 可以加入排序
     */
    @GetMapping(value = "/query")
    public List<TbUser> queryList() {
        QueryWrapper<TbUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id","4bf8dbd314e243d6ae333c7edf4c5d1e");
        queryWrapper.orderByAsc("createDate");
        // 更多QueryWrapper 查询条件请查询 https://mp.baomidou.com/guide/
        List<TbUser> list = tbUserService.list(queryWrapper);
        return  list;
    }

    /**
     * 分页查询 加入各种判断条件
     */
    @GetMapping(value = "/queryList")
    public IPage<TbUser> queryList(@RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                                  @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize) {
        // 请求参数....  进行配置
        QueryWrapper<TbUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id","4bf8dbd314e243d6ae333c7edf4c5d1e");
        queryWrapper.orderByAsc("createDate");
        Page page = new Page<>(pageNo, pageSize);
        // 更多QueryWrapper 查询条件请查询 https://mp.baomidou.com/guide/
        IPage<TbUser> list = tbUserService.page(page, queryWrapper);
        return  list;
    }

    /**
     *  //TODO  可根据此模板进行修改
     *  //      Result 接口返回数据格式
     *	public Result<?> queryById(@RequestParam(name="id",required=true) String id) {
	 *	  UserService userModel = userService.getById(id);
	 *	  if(userModel==null) {
	 *	 	return Result.error("未找到对应数据");
	 *	  }
	 *	 return Result.ok(userModel);
     *   }
     /*

    /**
     * 通过id查询
     * @param id 需要查询的ID
     * @return  {"id":"4bf8dbd314e243d6ae333c7edf4c5d1e","createDate":"2020-06-01 11:49:41","updateDate":"2020-06-01 11:49:43","userName":"admin","passWord":"123456"}
     */
    @GetMapping(value = "/queryById")
    public TbUser queryById(@RequestParam(name = "id", required = true) String id) {
        return  tbUserService .getById(id);
    }
    
    /**
     * 添加
     */
    @PostMapping(value = "/add")
    public boolean add(@RequestBody TbUser model) {
        return  tbUserService .save(model);
    }


    /**
     * 编辑
     */
    @PutMapping(value = "/edit")
    public boolean edit(@RequestBody TbUser model) {
        return tbUserService .updateById(model);
    }

    /**
     * 通过id删除
     */
    @DeleteMapping(value = "/delete")
    public boolean delete(@RequestParam(name = "id", required = true) String id) {
        return tbUserService .removeById(id);
    }
    
    
	
}