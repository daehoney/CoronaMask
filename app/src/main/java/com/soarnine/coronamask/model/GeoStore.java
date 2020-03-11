package com.soarnine.coronamask.model;

import java.util.List;

public class GeoStore {

    /**
     * count : 0
     * stores : [{"code":"string","name":"string","addr":"string","type":"string","lat":0,"lng":0,"stock_at":"string","remain_stat":"string","created_at":"string"}]
     */

    private int count;
    private List<StoresBean> stores;
    /**
     * error : {"errorCode":"300","message":"Not Found Exception","details":"URL not found."}
     */

    private ErrorBean error;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<StoresBean> getStores() {
        return stores;
    }

    public void setStores(List<StoresBean> stores) {
        this.stores = stores;
    }

    public ErrorBean getError() {
        return error;
    }

    public void setError(ErrorBean error) {
        this.error = error;
    }

    public static class StoresBean {
        /**
         * code : string
         * name : string
         * addr : string
         * type : string
         * lat : 0
         * lng : 0
         * stock_at : string
         * remain_stat : string
         * created_at : string
         */

        private String code;
        private String name;
        private String addr;
        private String type;
        private float lat;
        private float lng;
        private String stock_at;
        private String remain_stat;
        private String created_at;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public float getLat() {
            return lat;
        }

        public void setLat(float lat) {
            this.lat = lat;
        }

        public float getLng() {
            return lng;
        }

        public void setLng(float lng) {
            this.lng = lng;
        }

        public String getStock_at() {
            return stock_at;
        }

        public void setStock_at(String stock_at) {
            this.stock_at = stock_at;
        }

        public String getRemain_stat() {
            return remain_stat;
        }

        public void setRemain_stat(String remain_stat) {
            this.remain_stat = remain_stat;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        @Override
        public String toString() {
            return "StoresBean{" +
                    "code='" + code + '\'' +
                    ", name='" + name + '\'' +
                    ", addr='" + addr + '\'' +
                    ", type='" + type + '\'' +
                    ", lat=" + lat +
                    ", lng=" + lng +
                    ", stock_at='" + stock_at + '\'' +
                    ", remain_stat='" + remain_stat + '\'' +
                    ", created_at='" + created_at + '\'' +
                    '}';
        }
    }


    public static class ErrorBean {
        /**
         * errorCode : 300
         * message : Not Found Exception
         * details : URL not found.
         */

        private String errorCode;
        private String message;
        private String details;

        public String getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(String errorCode) {
            this.errorCode = errorCode;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }
    }

    @Override
    public String toString() {
        return "GeoStore{" +
                "count=" + count +
                ", stores=" + stores +
                ", error=" + error +
                '}';
    }
}
