package com.yehiacompany.FacebookApp.codeJava;

public class DataTimeLine {
    private int profilePictureBig;
    private int contentPhotoPost;
    private int profilePhotoSmall;
    private String userName;
    private int timePost;
    private String contentTextPost;


    public DataTimeLine(int profilePictureBig, int contentPhotoPost, int profilePhotoSmall, String userName, int timePost, String contentTextPost) {

        this.profilePictureBig = profilePictureBig;
        this.contentPhotoPost = contentPhotoPost;
        this.profilePhotoSmall = profilePhotoSmall;
        this.userName = userName;
        this.timePost = timePost;
        this.contentTextPost = contentTextPost;

    }

    public int getProfilePictureBig() {
        return profilePictureBig;
    }

    public void setProfilePictureBig(int profilePictureBig) {
        this.profilePictureBig = profilePictureBig;
    }

    public int getContentPhotoPost() {
        return contentPhotoPost;
    }

    public void setContentPhotoPost(int contentPhotoPost) {
        this.contentPhotoPost = contentPhotoPost;
    }

    public int getProfilePhotoSmall() {
        return profilePhotoSmall;
    }

    public void setProfilePhotoSmall(int profilePhotoSmall) {
        this.profilePhotoSmall = profilePhotoSmall;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getTimePost() {
        return timePost;
    }

    public void setTimePost(int timePost) {
        this.timePost = timePost;
    }

    public String getContentTextPost() {
        return contentTextPost;
    }

    public void setContentTextPost(String contentTextPost) {
        this.contentTextPost = contentTextPost;
    }
}

