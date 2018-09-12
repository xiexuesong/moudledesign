package com.wangzhen.admin.moudledesign;

import android.os.Build;

/**
 * Created by admin on 2018/9/10.
 */

public class ShareDesc {

    private String url ;
    private String desc ;
    private String code;
    private String title ;

    public ShareDesc(Builder builder) {
        this.url = builder.url;
        this.desc = builder.desc;
        this.code = builder.code;
        this.title = builder.title;
    }

    public static class Builder{
        private String url;
        private String desc;
        private String code;
        private String title;

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public ShareDesc build(){
            return new ShareDesc(this);
        }
    }

}
