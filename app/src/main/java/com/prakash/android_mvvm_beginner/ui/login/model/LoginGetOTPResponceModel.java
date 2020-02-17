package com.prakash.android_mvvm_beginner.ui.login.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginGetOTPResponceModel {

    @SerializedName("data")
    @Expose
    private OTPDataModel otpDataModel;
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("userid")
    @Expose
    private UserId userid;
    @SerializedName("message")
    @Expose
    private String message;

    public OTPDataModel getOtpDataModel() {
        return otpDataModel;
    }

    public void setOtpDataModel(OTPDataModel otpDataModel) {
        this.otpDataModel = otpDataModel;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public UserId getUserid() {
        return userid;
    }

    public void setUserid(UserId userid) {
        this.userid = userid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
