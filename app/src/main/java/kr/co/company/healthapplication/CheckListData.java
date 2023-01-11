package kr.co.company.healthapplication;

// 체크리스트 데이터 액티비티 (2023-01-04 인범 생성)
public class CheckListData {

    private String tvListNum;
    private int ivProfile;
    private String tvContent;

    public CheckListData(String tvListNum, int ivProfile, String tvContent) {
        this.tvListNum = tvListNum;
        this.ivProfile = ivProfile;
        this.tvContent = tvContent;
    }

    public String getTvListNum() {
        return tvListNum;
    }

    public void setTvListNum(String tvListNum) {
        this.tvListNum = tvListNum;
    }

    public int getIvProfile() {
        return ivProfile;
    }

    public void setIvProfile(int ivProfile) {
        this.ivProfile = ivProfile;
    }

    public String getTvContent() {
        return tvContent;
    }

    public void setTvContent(String tvContent) {
        this.tvContent = tvContent;
    }
}
