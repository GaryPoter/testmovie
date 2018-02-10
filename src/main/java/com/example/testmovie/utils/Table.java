package com.example.testmovie.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class Table {
    //表名
    private String tableName;

    //属性键值对
    private String[] k;

    private String[] v;

    //cols要查找的cols
    private String[] cols;

    public Table(String tableName) {
        this.tableName = tableName;
    }

    public Table(String tableName, String[] cols) {
        this.tableName = tableName;
        this.cols = cols;
    }

    public Table(String tableName, String[] cols, String[] k, String[] v) {
        this.tableName = tableName;
        this.k = k;
        this.v = v;
        this.cols = cols;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String[] getK() {
        return k;
    }

    public void setK(String[] k) {
        this.k = k;
    }

    public String[] getV() {
        return v;
    }

    public void setV(String[] v) {
        this.v = v;
    }

    public String[] getCols() {
        return cols;
    }

    public void setCols(String[] cols) {
        this.cols = cols;
    }

    public Table() {
    }

    @Override
    public String toString() {
        return queryStatement();
    }

    public String queryStatement(){
        StringBuffer sb = new StringBuffer();
        sb.append("SELECT ");
        //select cols from table where cols=vals
        if(cols != null && cols.length != 0) {
            for (String col : cols) {
                sb.append(col + ", ");
            }
            sb.delete(sb.length()-2, sb.length() - 1);
        }else {
            sb.append("* ");
        }

        sb.append(" FROM " + tableName);

        if(null != k && k.length != 0){
            int end = k.length;
            sb.append(" WHERE ");
            for (int start = 0; start < end; start++){
                sb.append(k[start] + " = " + v[start] + " AND ");
            }
            return sb.substring(0, sb.length() - 4);
        }else{
            return sb.toString();
        }


    }
}
