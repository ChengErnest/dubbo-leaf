package cn.nicollcheng.leaf.service;

import com.sankuai.inf.leaf.segment.SegmentIDGenImpl;

/**
 * <b><code>SegmentService</code></b>
 * <p/>
 * Description 号段模式
 * <p/>
 * <b>Creation Time:</b> 2021/7/19 12:24.
 *
 * @author nicollcheng
 * @since dubbo-leaf 2021
 */
public interface SegmentService {
    String getId(String key);
    SegmentIDGenImpl getIdGen();
}
