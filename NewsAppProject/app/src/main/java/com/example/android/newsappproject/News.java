package com.example.android.newsappproject;

public class News {

    /**
     * title of the article
     */
    private String mTitle;

    /**
     * name of the section
     */
    private String mSection;

    /**
     * date of article
     */
    private String mDate;

    /**
     * get URL of news
     */
    private String mUrl;


    public News(String title, String section, String date, String url) {
        mTitle = title;
        mSection = section;
        mDate = date;
        mUrl = url;
    }


    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }

}
