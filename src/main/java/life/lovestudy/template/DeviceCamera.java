package life.lovestudy.template;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * Create by huangwei on 2020/5/20 0020
 * 摄像机设备
 */
@SuppressWarnings("all")
public class DeviceCamera extends AbstractDeviceSendHeartBeat{

    private final String host = "106.14.58.20";

    /**
     * 发送心跳数据
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


    public static void main(String[] args) {
        AbstractDeviceSendHeartBeat deviceCamera = new DeviceCamera();
        deviceCamera.sendHeartBeat();
    }
}
