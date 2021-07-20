package cn.nicollcheng.leaf.client;

import cn.nicollcheng.leaf.service.SegmentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.stereotype.Service;

/**
 * <b><code>SegmentServiceRpcClient</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2021/7/19 18:00.
 *
 * @author nicollcheng
 * @since dubbo-leaf 2021
 */
@Service
public class SegmentServiceRpcClient {
    @DubboReference(
            version = "1.0.0",
            url = "dubbo://127.0.0.1:20880",
            timeout = 100,
            methods = {
                    @Method(name = "getId", timeout = 300)
            }
    )
    private SegmentService segmentService;

    public void getId(String key){
        System.out.println(segmentService.getId("test"));
    }
}
