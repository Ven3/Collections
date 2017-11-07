package image;

import java.io.File;
import java.util.Arrays;

/**
 * Created by Han on 2017/10/27.
 */
public class Test {
    public static void main(String[] args) {

        File img=new File("D:\\Documents\\毕业设计\\WP_20150120_15_20_46_Raw.jpg");
        ImageProperties imageProperties=new ImageProperties();
        ImgInfo imgInfo=new ImgInfo(imageProperties.getInfos(img));

        if(imgInfo.getGps_Longitude()!=null&&imgInfo.getGps_Latitude()!=null){
            String gpsinfo=imgInfo.getGps_Longitude()+imgInfo.getGps_Latitude();
            gpsinfo=changeState(gpsinfo);
            System.out.println(gpsinfo);


            PlaceInfo placeInfo=new PlaceInfo();
            System.out.println(placeInfo.getPlace(gpsinfo));
        }else {
            System.out.println("No GPS Info");
        }




    }

    public  static String changeState(String gpsinfo){
        System.out.println(gpsinfo);
        String done=null;
        //去掉空格
        if (gpsinfo.length()<4)
            return done;
        gpsinfo=gpsinfo.replaceAll(" ","");

        String[] cells=gpsinfo.split("°|'|\"|:");

        double[] cell=new double[cells.length];
        for(int i=0;i<cell.length;i++){
            cell[i]=Double.parseDouble(cells[i]);
        }
        cell[0]=cell[0]+cell[1]/60+cell[2]/3600;
        cell[3]=cell[3]+cell[4]/60+cell[5]/3600;
        done=cell[0]+","+cell[3];

        return done;
    }
}
