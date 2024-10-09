package com.dollar.penguin.publish.service.impl;

import com.dollar.penguin.publish.model.CustomerModel;
import com.dollar.penguin.publish.mapper.PublishMapper;
import com.dollar.penguin.publish.service.PublishManagerService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PublishManagerServiceImpl implements PublishManagerService {

    @Autowired
    PublishMapper publishMapper;

    @Override
    public List<CustomerModel> queryAllCustomer() {
        return publishMapper.queryAllCustomer();
    }

    @Override
    public boolean insertCustomer(String cCode, String cName) {
        int count = publishMapper.insertCustomer(cCode, cName);
        return count > 0;
    }
}
