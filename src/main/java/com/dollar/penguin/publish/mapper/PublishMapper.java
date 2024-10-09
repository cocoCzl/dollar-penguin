package com.dollar.penguin.publish.mapper;

import com.dollar.penguin.publish.model.CustomerModel;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PublishMapper {

    List<CustomerModel> queryAllCustomer();

    int insertCustomer(String cCode, String cName);
}
