# [美团Leaf Dubbo Rpc调用支持](https://github.com/Meituan-Dianping/Leaf.git)

基于[Meituan-Dianping/Leaf](https://github.com/Meituan-Dianping/Leaf.git)更新部分依赖已经添加Dubbo RPC远程调用支持

> client-simple：Dubbo客户端远程调用示例
>
> dubbo-api：Leaf-Dubbo服务接口
>
> dubbo-leaf-core：基于leaf-core更新
>
> dubbo-leaf-server：基于leaf-server更新

## Quick Start

配置参考：https://github.com/Meituan-Dianping/Leaf/blob/master/README_CN.md

### 运行Leaf Server

```bash
git clone git@github.com:Meituan-Dianping/Leaf.git
//按照上面的号段模式在工程里面配置好
cd dubbo-leaf
mvn clean install -DskipTests
cd dubbo-leaf-server
```

### 运行服务
注意:首先得先配置好数据库表或者zk地址
```bash
mvn spring-boot:run
```
### 测试
```bash
#segment
curl http://localhost:8080/api/segment/get/leaf-segment-test
#snowflake
curl http://localhost:8080/api/snowflake/get/test
```

### 监控页面
号段模式：http://localhost:8080/cache