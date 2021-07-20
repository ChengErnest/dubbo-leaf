package cn.nicollcheng.leaf.client;

import cn.nicollcheng.leaf.service.SnowflakeService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.stereotype.Service;

/**
 * <b><code>SnowflakeServiceRpcClient</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2021/7/19 18:03.
 *
 * @author nicollcheng
 * @since dubbo-leaf 2021
 */
@Service
public class SnowflakeServiceRpcClient {
    @DubboReference(
            version = "1.0.0",
            url = "dubbo://127.0.0.1:20880",
            timeout = 100,
            methods = {
                    @Method(name = "getId", timeout = 300)
            }
    )
    private SnowflakeService snowflakeService;

    public void getId(String key){
        System.out.println(snowflakeService.getId("test"));
    }
}
