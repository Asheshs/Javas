import java.io.Serializable;
public class District implements Serializable{
    public static long serialVersionUID = 234l;
    private String districtName;
    private String districtProvince;
    District(){}
    District(String districtName, String districtProvince){
        this.districtName=districtName;
        this.districtProvince=districtProvince;
    }
    public String getDistrictName()
    {
        return districtName;

    }

    public String getDistrictProvince()
    {
        return districtProvince;
    }
    public void setDistrictName(String districtName)
    {
        this.districtName=districtName;
    }
    public void setDistrictProvince(String districtProvince)
    {
        this.districtProvince=districtProvince;
    }
    @Override
    public String toString()
    {
        return this.districtName + " " + this.districtProvince;
    }
}