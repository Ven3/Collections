package image;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Han on 2017/10/25.
 */
public class ImgInfo {


    //    光圈    F-Number:f/2.2
    String f_Number;

    //    感光度    ISO Speed Ratings:100
    String iso_Speed;

    //    曝光时长 Exposure Time  1/8000 sec
    String exposure_Time;

    //    拍摄日期    Date/Time Digitized:2015:01:20 15:17:31
    String shut_date;

    //    宽度    Image Width:1728 pixels
    String width;

    //    高度    Image Height:3072 pixels
    String height;

    //    厂家    Make:Nokia
    String make;

    //    型号    Model:Lumia 1020
    String model;

    //    纬度
    String gps_Latitude;

    //经度
    String gps_Longitude;

    public String getExposure_Time() {
        return exposure_Time;
    }

    public void setExposure_Time(String exposure_Time) {
        this.exposure_Time = exposure_Time;
    }

    Map<String, String> infos = new HashMap<String, String>();

    public ImgInfo(Map<String, String> infos) {
        this.infos = infos;
        initImg();
    }

    private ImgInfo() {
    }

    private void initImg() {
        setF_Number(this.infos.get("F-Number"));
        setIso_Speed(this.infos.get("ISO Speed Ratings"));
        setShut_date(this.infos.get("Date/Time Digitized"));
        setWidth(this.infos.get("Image Width"));
        setHeight(this.infos.get("Image Height"));
        setMake(this.infos.get("Make"));
        setModel(this.infos.get("Model"));
        setExposure_Time(this.infos.get("Exposure Time"));
        setGps_Latitude(this.infos.get("GPS Latitude"));
        setGps_Longitude(this.infos.get("GPS Longitude"));
    }

    public String getF_Number() {
        return f_Number;
    }

    public void setF_Number(String f_Number) {
        this.f_Number = f_Number;
    }

    public String getIso_Speed() {
        return iso_Speed;
    }

    public void setIso_Speed(String iso_Speed) {
        this.iso_Speed = iso_Speed;
    }

    public String getShut_date() {
        return shut_date;
    }

    public void setShut_date(String shut_date) {
        this.shut_date = shut_date;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGps_Latitude() {
        return gps_Latitude;
    }

    public void setGps_Latitude(String gps_Latitude) {
        this.gps_Latitude = gps_Latitude;
    }

    public String getGps_Longitude() {
        return gps_Longitude;
    }

    public void setGps_Longitude(String gps_Longitude) {
        this.gps_Longitude = gps_Longitude;
    }
}
