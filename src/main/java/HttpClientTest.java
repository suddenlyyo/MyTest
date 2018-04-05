
import com.sun.istack.internal.Nullable;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.junit.Test;


import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.Charset;


/**
 * @author zhouxun
 */
public class HttpClientTest {
    @Test
    public void test1() throws IOException {
    //最简单的HTTP客户端,用来演示通过GET或者POST方式访问某个页面
        HttpClient client = new HttpClient();
        // 设置代理服务器地址和端口
        //client.getHostConfiguration().setProxy("proxy_host_addr",proxy_port);
        // 使用 GET 方法 ，如果服务器需要通过 HTTPS 连接，那只需要将下面 URL 中的 http 换成 https
       // HttpMethod method=new GetMethod("http://www.baidu.com");
        //使用POST方法
        HttpMethod method = new PostMethod("http://www.baidu.com");
        client.executeMethod(method);

        //打印服务器返回的状态
        System.out.println(method.getStatusLine());
        //打印返回的信息
        String responseBodyAsString = method.getResponseBodyAsString();
        System.out.println(responseBodyAsString);
        //释放连接
        method.releaseConnection();

    }
    /**
     * 上传url文件到指定URL
     * @param fileUrl 上传图片url
     * @param postUrl 上传路径及参数,注意有些中文参数需要使用预先编码 eg : URLEncoder.encode(appName, "UTF-8")
     * @return
     * @throws IOException
     */
    @Test
    public  void doUploadFile() throws IOException {
        String postUrl="http://www.baidu.com";
        String response = "";
        PostMethod postMethod = new PostMethod(postUrl);
        try {
            HttpClient client = new HttpClient();

            client.getHttpConnectionManager().getParams()
                    // 设置连接时间
                    .setConnectionTimeout(50000);

            int status = client.executeMethod(postMethod);
            if (status == HttpStatus.SC_OK) {
                InputStream inputStream = postMethod.getResponseBodyAsStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(
                        inputStream));
                StringBuilder stringBuffer = new StringBuilder();
                String str = "";
                while ((str = br.readLine()) != null) {
                    stringBuffer.append(str);
                }
                response = stringBuffer.toString();
            } else {
                response = "fail";
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放连接
            postMethod.releaseConnection();
        }
        System.out.println(response);
    }
    /**
     * 上传文件到指定URL
     * @param file
     * @param url
     * @return
     * @throws IOException
     */
    public static String doUploadFile(File file, String url) throws IOException {
        String response = "";
        if (!file.exists()) {
            return "file not exists";
        }
        PostMethod postMethod = new PostMethod(url);
        try {
            //----------------------------------------------
            // FilePart：用来上传文件的类,file即要上传的文件
            FilePart fp = new FilePart("file", file);
            Part[] parts = { fp };

            // 对于MIME类型的请求，httpclient建议全用MulitPartRequestEntity进行包装
            MultipartRequestEntity mre = new MultipartRequestEntity(parts,
                    postMethod.getParams());
            postMethod.setRequestEntity(mre);
            //---------------------------------------------
            HttpClient client = new HttpClient();
            client.getHttpConnectionManager().getParams()
                    .setConnectionTimeout(50000);// 由于要上传的文件可能比较大 , 因此在此设置最大的连接超时时间
            int status = client.executeMethod(postMethod);
            if (status == HttpStatus.SC_OK) {
                InputStream inputStream = postMethod.getResponseBodyAsStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(
                        inputStream));
                StringBuffer stringBuffer = new StringBuffer();
                String str = "";
                while ((str = br.readLine()) != null) {
                    stringBuffer.append(str);
                }
                response = stringBuffer.toString();
            } else {
                response = "fail";
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放连接
            postMethod.releaseConnection();
        }
        return response;
    }
}
