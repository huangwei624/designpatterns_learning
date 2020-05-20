package life.lovestudy.template;

import java.io.IOException;
import java.io.InputStream;

/**
 * Create by huangwei on 2020/5/20 0020
 * 设备发送心跳的模板
 */
abstract public class AbstractDeviceSendHeartBeat {

    // 发送心跳数据给服务器
    abstract public void sendHeartBeat();

    /**
     * 返回流信息
     * @param inputStream
     * @return
     * @throws IOException
     */
    protected String readStreamInfo(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        StringBuilder stringBuffer = new StringBuilder();
        while (-1 !=inputStream.read(buffer)){
            stringBuffer.append(new String(buffer, "GBK"));
        }
        return stringBuffer.toString();
    }
}
