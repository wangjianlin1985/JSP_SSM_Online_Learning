package com.xafdy.model;

import java.util.Date;

public class Notice {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.id
     *
     * @mbg.generated Thu Mar 29 14:57:15 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.title
     *
     * @mbg.generated Thu Mar 29 14:57:15 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.record_time
     *
     * @mbg.generated Thu Mar 29 14:57:15 CST 2018
     */
    private Date recordTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.content
     *
     * @mbg.generated Thu Mar 29 14:57:15 CST 2018
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.id
     *
     * @return the value of notice.id
     *
     * @mbg.generated Thu Mar 29 14:57:15 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.id
     *
     * @param id the value for notice.id
     *
     * @mbg.generated Thu Mar 29 14:57:15 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.title
     *
     * @return the value of notice.title
     *
     * @mbg.generated Thu Mar 29 14:57:15 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.title
     *
     * @param title the value for notice.title
     *
     * @mbg.generated Thu Mar 29 14:57:15 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.record_time
     *
     * @return the value of notice.record_time
     *
     * @mbg.generated Thu Mar 29 14:57:15 CST 2018
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.record_time
     *
     * @param recordTime the value for notice.record_time
     *
     * @mbg.generated Thu Mar 29 14:57:15 CST 2018
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.content
     *
     * @return the value of notice.content
     *
     * @mbg.generated Thu Mar 29 14:57:15 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.content
     *
     * @param content the value for notice.content
     *
     * @mbg.generated Thu Mar 29 14:57:15 CST 2018
     */
    public void setContent(String content) {
        this.content = content;
    }
}