package Talaba;

public class talaba {
    private String fam;
    private String ism;
    private Integer yosh;

    public talaba(String fam, String ism, int yosh) {
        this.fam = fam;
        this.ism = ism;
        this.yosh = yosh;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public Integer getYosh() {
        return yosh;
    }

    public void setYosh(Integer yosh) {
        this.yosh = yosh;
    }

    @Override
    public String toString() {
        return "talaba{" +
                "fam='" + fam + '\'' +
                ", ism='" + ism + '\'' +
                ", yosh=" + yosh +
                '}';
    }
}
