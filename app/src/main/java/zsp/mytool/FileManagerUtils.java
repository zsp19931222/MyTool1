package zsp.mytool;

import android.os.Environment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2016/10/11.
 */

public class FileManagerUtils {
    /**
     * 创建文件夹 用于存储头像
     */
    public static String mkdirFile(String documentName) {
        String path = Environment.getExternalStorageDirectory().getAbsolutePath();  //得到手机S卡根目录
        File file = new File(path + "/aiCare/temp/"+documentName);  //创建一个File对象
        if (!file.exists()) {
            file.mkdirs();  //创建文件夹
        }
        return path + "/aiCare/temp/"+documentName;
    }

    /**
     * 读取SD卡中的文本数据
     * @param path  文件路径
     * @return
     */
    public static String readTextData(String path)
    {
        File file=new File(path);
        String content="";  //存储文本内容
        if (file.isDirectory())
        {

        }else {
            try {
                InputStream inputStream=new FileInputStream(file);  //创建一个输入流对象
                if (inputStream!=null)
                {
                    InputStreamReader inputReader=new InputStreamReader(inputStream);  //创建一个读入流对象
                    BufferedReader bufferedReader=new BufferedReader(inputReader);  //创建一个读入包装类
                    String line;
                    //分行读取
                    while ((line=bufferedReader.readLine())!=null)
                    {
                        content+=line+"\n";
                    }
                    inputStream.close();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return content;
    }

    /**
     * 保存json数据到SD卡
     * @param content  存储内容
     * @param path   保存路径
     * @param fileName   文件名称
     */
    public static void saveDataToSDCard(String content, String path, String fileName)
    {
        try {
            FileOutputStream outputStream=new FileOutputStream(path+"/"+fileName+".txt",true);  //创建一个输出流对象 输出文件到SD卡
            OutputStreamWriter writer=new OutputStreamWriter(outputStream,"gb2312");  //创建一个 输出流写入 对象
            writer.write(content);  //写入内容
            writer.flush();
            writer.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
