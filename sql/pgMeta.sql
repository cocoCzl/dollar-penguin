---客户表
DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
    id SERIAL PRIMARY KEY,               -- 自增主键
    c_code VARCHAR(20) UNIQUE NOT NULL,  -- 客户代码，唯一且不能为空
    c_name VARCHAR(50) NOT NULL,         -- 客户名称，不能为空
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,  -- 创建时间，默认为当前时间
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP   -- 修改时间，默认为当前时间
);
