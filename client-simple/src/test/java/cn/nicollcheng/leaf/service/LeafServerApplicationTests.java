package cn.nicollcheng.leaf.service;

import cn.nicollcheng.leaf.client.SegmentServiceRpcClient;
import cn.nicollcheng.leaf.client.SnowflakeServiceRpcClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeafServerApplicationTests {
	@Autowired
	private SegmentServiceRpcClient segmentServiceRpcClient;
	@Autowired
	private SnowflakeServiceRpcClient snowflakeServiceRpcClient;

	@Test
	public void segmentServiceRpcClientGetId() {
		segmentServiceRpcClient.getId("test");
	}

	@Test
	public void snowflakeServiceRpcClientGetId() {
		snowflakeServiceRpcClient.getId("test");
	}

}
