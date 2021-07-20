package cn.nicollcheng.leaf.service;

/**
 * <b><code>SnowflakeService</code></b>
 * <p/>
 * Description 雪花算法模式
 * <p/>
 * <b>Creation Time:</b> 2021/7/19 12:24.
 *
 * @author nicollcheng
 * @since dubbo-leaf 2021
 */
public interface SnowflakeService {
    String getId(String key);
}
