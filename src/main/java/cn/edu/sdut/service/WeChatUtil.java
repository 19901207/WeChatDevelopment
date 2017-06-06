package cn.edu.sdut.service;
/* *
 * 封装两个工具类
 * 用于调用微信公众平台的access_token接口
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
 
public class WeChatUtil {  
    /*** V型知识库 www.vxzsk.com 
     * 模拟get请求 
     * @param url 
     * @param charset 
     * @param timeout 
     * @return 
     */  
     public static String sendGet(String url, String charset, int timeout)  
      {  
        String result = "";  
        try  
        {  
          URL u = new URL(url);  
          try  
          {  
            URLConnection conn = u.openConnection();  
            conn.connect();  
            conn.setConnectTimeout(timeout);  
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), charset));  
            String line="";  
            while ((line = in.readLine()) != null)  
            {  
               
              result = result + line;  
            }  
            in.close();  
          } catch (IOException e) {  
            return result;  
          }  
        }  
        catch (MalformedURLException e)  
        {  
          return result;  
        }  
         
        return result;  
      }  
          
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        String appid="wxe583981c2b539da0";//应用ID  
        String appSecret="cd8e2e2069903ddc0ded16619da8ccf3";//(应用密钥)  
        String url ="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appid+"&secret="+appSecret+"";  
        String backData=WeChatUtil.sendGet(url, "utf-8", 10000);  
        System.out.println("返回："+backData);  
    }  
   
} 
