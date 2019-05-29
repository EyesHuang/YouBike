package com.yt.youbike;

public class Result {
    private String total;
    private Records[] records;
    private String limit;
    private String resource_id;
    private Fields[] fields;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Records[] getRecords() {
        return records;
    }

    public void setRecords(Records[] records) {
        this.records = records;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getResource_id() {
        return resource_id;
    }

    public void setResource_id(String resource_id) {
        this.resource_id = resource_id;
    }

    public Fields[] getFields() {
        return fields;
    }

    public void setFields(Fields[] fields) {
        this.fields = fields;
    }
}
