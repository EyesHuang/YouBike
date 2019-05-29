package com.yt.youbike;

import com.google.gson.annotations.SerializedName;

public class Records {
    @SerializedName("sna")
    private String name;

    @SerializedName("ar")
    private String address;

    @SerializedName("tot")
    private String totalNumber;

    @SerializedName("sbi")
    private String lendNumber;

    @SerializedName("bemp")
    private String returnNumber;

    @SerializedName("lat")
    private String latitude;

    @SerializedName("lng")
    private String longitude;

    private String sareaen;
    private String sarea;
    private String snaen;
    private String act;
    private String sno;
    private String aren;
    private String mday;

    /*sno(站點代號)、
    sna(中文場站名稱)、
    tot(場站總停車格)、
    sbi(可借車位數)、
    sarea(中文場站區域)、
    mday(資料更新時間)、
    lat(緯度)、
    lng(經度)、
    ar(中文地址)、
    sareaen(英文場站區域)、
    snaen(英文場站名稱)、
    aren(英文地址)、
    bemp(可還空位數)、
    act(場站是否暫停營運)*/

    public Records(String name, String address,
                   String totalNumber, String lendNumber,
                   String returnNumber, String latitude, String longitude) {
        this.name = name;
        this.address = address;
        this.totalNumber = totalNumber;
        this.lendNumber = lendNumber;
        this.returnNumber = returnNumber;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    // Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    // Total Number
    public String getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(String totalNumber) {
        this.totalNumber = totalNumber;
    }


    // Lend Number
    public String getLendNumber() {
        return lendNumber;
    }

    public void setLendNumber(String lendNumber) {
        this.lendNumber = lendNumber;
    }


    // Return Number
    public String getReturnNumber() {
        return returnNumber;
    }

    public void setReturnNumber(String returnNumber) {
        this.returnNumber = returnNumber;
    }


    // Latitude
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }


    // Longitude
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }


    /***************************************************************/
    public String getSareaen ()
    {
        return sareaen;
    }

    public void setSareaen (String sareaen)
    {
        this.sareaen = sareaen;
    }

    public String getSarea ()
    {
        return sarea;
    }

    public void setSarea (String sarea)
    {
        this.sarea = sarea;
    }

    public String getSnaen ()
    {
        return snaen;
    }

    public void setSnaen (String snaen)
    {
        this.snaen = snaen;
    }

    public String getAct ()
    {
        return act;
    }

    public void setAct (String act)
    {
        this.act = act;
    }

    public String getSno ()
    {
        return sno;
    }

    public void setSno (String sno)
    {
        this.sno = sno;
    }

    public String getAren ()
    {
        return aren;
    }

    public void setAren (String aren)
    {
        this.aren = aren;
    }

    public String getMday ()
    {
        return mday;
    }

    public void setMday (String mday)
    {
        this.mday = mday;
    }
}
