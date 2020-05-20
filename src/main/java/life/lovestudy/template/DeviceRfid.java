package life.lovestudy.template;

import java.io.IOException;
import java.io.InputStream;

/**
 * Create by huangwei on 2020/5/20 0020
 * 阅读器设备
 */
@SuppressWarnings("all")
public class DeviceRfid extends AbstractDeviceSendHeartBeat{

    private final String host = "127.0.0.1";

    /**
     * 发送阅读器心跳
     */
    @Override
    public void sendHeartBeat() {
        InputStream inputStream = null;
        try {
            Process exec = Runtime.getRuntime().exec("ping " + this.host);
            inputStream = exec.getInputStream();
            String resInfo = readStreamInfo(inputStream);
            if (resInfo.contains("TTL")) {
                System.out.println("有心跳");
            } else {
                System.out.println("没有心跳");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
