package com.example.appfood.Domain;

public class CategoryDomain {
    private String tille;
    private String pic;

    public CategoryDomain(String tille, String pic) {
        this.tille = tille;
        this.pic = pic;
    }

    public String getTille() {
        return tille;
    }

    public void setTille(String tille) {
        this.tille = tille;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
