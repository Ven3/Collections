package image;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.DosFileAttributeView;
import java.util.*;

/**
 * Created by Han on 2017/10/24.
 */
public class ImageProperties {


    //将文件设为隐藏，只读
    public void setAttribute(File file) {
        DosFileAttributeView dosview = Files.getFileAttributeView(file.toPath(), DosFileAttributeView.class);
        try {
            dosview.setHidden(true);//隐藏
            dosview.setReadOnly(true);//只读
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public Map<String, String> getInfos(File img) {
        System.out.println("File Name:" + img.getName());

        Metadata metadata = null;
        try {

            metadata = ImageMetadataReader.readMetadata(img);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ImageProcessingException e) {
            e.printStackTrace();
        }
//        System.out.println("Directory Count: " + metadata.getDirectoryCount());
//        System.out.println();

        //输出所有附加属性数据

        Map<String, String> infos = new HashMap<String, String>();
        for (Directory directory : metadata.getDirectories()) {
//            System.out.println("**********************" + directory.getName() + "**************************");
            for (Tag tag : directory.getTags()) {
//                System.out.println(tag.getTagName() + ":" + tag.getDescription());
                infos.put(tag.getTagName(), tag.getDescription());
            }
//            System.out.println();
//            System.out.println();

        }

        return infos;
    }


    public static void main(String[] args) {

        double startTime=System.currentTimeMillis();
        ImageProperties imageProperties = new ImageProperties();

        File file = new File("D:\\Documents\\毕业设计");
        if(file.isDirectory()){
            File[] files=file.listFiles();
            for(File img:files){

                System.out.println(img.getName());
                Map<String,String> infos= imageProperties.getInfos(img);

                System.out.println(infos.get("GPS Longitude"));
                ImgInfo imgInfo=new ImgInfo(infos);

                System.out.println(imgInfo.toString());
                System.out.println(imgInfo.getGps_Latitude()+":"+imgInfo.getGps_Longitude());
                System.out.println();
            }
        }

        double stopTime=System.currentTimeMillis();
        System.out.println(stopTime-startTime);







    }
}
