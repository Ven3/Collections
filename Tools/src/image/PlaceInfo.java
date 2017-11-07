package image;


import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Han on 2017/10/27.
 */
public class PlaceInfo {



    public String getPlace(String gpsInfo){
        String url="http://restapi.amap.com/v3/geocode/regeo?key=3ffeab9082e9e216cb06f17643b4e249&location=";

        String place="";
        try {
            URL get=new URL(url+gpsInfo);
            HttpURLConnection connection= (HttpURLConnection) get.openConnection();
            connection.setRequestMethod("POST");
            connection.setConnectTimeout(5*1000);

            InputStream inputStream=connection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String readLine=null;
            while ((readLine = bufferedReader.readLine()) != null) {
                place=getCityInfo(readLine);

            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return place;
    }

    public String getCityInfo(String jsonStr) {
//        String jsonStr="{\"status\":\"1\",\"info\":\"OK\",\"infocode\":\"10000\",\"regeocode\":{\"formatted_address\":\"山西省运城市平陆县曹川镇玉颜山\",\"addressComponent\":{\"country\":\"中国\",\"province\":\"山西省\",\"city\":\"运城市\",\"citycode\":\"0359\",\"district\":\"平陆县\",\"adcode\":\"140829\",\"township\":\"曹川镇\",\"towncode\":\"140829104000\",\"neighborhood\":{\"name\":[],\"type\":[]},\"building\":{\"name\":[],\"type\":[]},\"streetNumber\":{\"street\":[],\"number\":[],\"direction\":[],\"distance\":[]},\"businessAreas\":[[]]}}}";
//        String jsonStr="{\"status\":\"1\",\"info\":\"OK\",\"infocode\":\"10000\",\"regeocode\":{\"formatted_address\":\"北京市朝阳区望京街道方恒国际中心B座方恒国际中心\",\"addressComponent\":{\"country\":\"中国\",\"province\":\"北京市\",\"city\":[],\"citycode\":\"010\",\"district\":\"朝阳区\",\"adcode\":\"110105\",\"township\":\"望京街道\",\"towncode\":\"110105026000\",\"neighborhood\":{\"name\":\"方恒国际中心\",\"type\":\"商务住宅;楼宇;商住两用楼宇\"},\"building\":{\"name\":\"方恒国际中心B座\",\"type\":\"商务住宅;楼宇;商务写字楼\"},\"streetNumber\":{\"street\":\"阜通东大街\",\"number\":\"6-2号楼\",\"location\":\"116.48129,39.9902869\",\"direction\":\"西南\",\"distance\":\"25.9205\"},\"businessAreas\":[{\"location\":\"116.47089234140496,39.9976009239991\",\"name\":\"望京\",\"id\":\"110105\"},{\"location\":\"116.47305065693433,39.98350093430656\",\"name\":\"花家地\",\"id\":\"110105\"},{\"location\":\"116.48976000793644,39.984900765873\",\"name\":\"大山子\",\"id\":\"110105\"}]}}}";
//
//
        JSONObject total=new JSONObject(jsonStr);
        System.out.println(total.get("regeocode"));
        JSONObject regeocode=new JSONObject(total.get("regeocode").toString());

        return regeocode.get("formatted_address").toString();

    }

}
