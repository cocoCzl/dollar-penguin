package com.dollar.penguin.publish.service;

import com.dollar.penguin.publish.model.CustomerModel;
import java.util.List;

public interface PublishManagerService {

    List<CustomerModel> queryAllCustomer();

    boolean insertCustomer(String cCode, String cName);
}
