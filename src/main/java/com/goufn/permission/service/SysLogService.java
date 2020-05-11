package com.goufn.permission.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.goufn.permission.common.page.PageRequest;
import com.goufn.permission.common.page.PageResult;
import com.goufn.permission.model.SysLog;

public interface SysLogService extends IService<SysLog> {

    PageResult findPage(PageRequest pageRequest);
}
