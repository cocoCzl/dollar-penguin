package com.dollar.penguin.publish.model;

import java.sql.Timestamp;
import lombok.Data;

@Data
public class CustomerModel {

    private int id;
    private String cCode;
    private String cName;
    private Timestamp createAt;
    private Timestamp updatedAt;
}
