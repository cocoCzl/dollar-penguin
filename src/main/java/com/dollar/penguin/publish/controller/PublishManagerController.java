package com.dollar.penguin.publish.controller;

import com.dollar.penguin.publish.model.CustomerModel;
import com.dollar.penguin.publish.service.PublishManagerService;
import com.dollar.penguin.util.Result;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(value = "/manage/publish")
public class PublishManagerController {

    @Autowired
    PublishManagerService publishManagerService;

    @RequestMapping(value = "/insertCustomer", method = RequestMethod.GET)
    public Result insertCustomer(@RequestParam(value = "cCode", required = true) String cCode,
            @RequestParam(value = "cName", required = true) String cName) {
        try {
            boolean success = publishManagerService.insertCustomer(cCode, cName);
            if (success) {
                return Result.success();
            } else {
                return Result.failure("[新增客户失败]");
            }
        } catch (Exception e) {
            log.error("insertCustomer error:{}", e.getMessage(), e);
            return Result.failure("[新增客户异常]");
        }
    }

    @RequestMapping(value = "/queryCustomer", method = RequestMethod.GET)
    public Object queryCustomer() {
        try {
            List<CustomerModel> customerModelList = publishManagerService.queryAllCustomer();
            return Result.success(customerModelList);
        } catch (Exception e) {
            log.error("queryCustomer error:{}", e.getMessage(), e);
            return Result.failure("[查询客户异常]");
        }
    }
}
