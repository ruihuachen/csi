package edu.team.entity;

import java.sql.Timestamp;

/**
 * 文件类
 * @author dailiwen
 * @date 2019/06/25
 */
public class Document {
    private Integer id;
    private String title;
    private String fileName;
    private String remake;
    private Timestamp createDate;
    private Integer userId;
    private String userName;

    public Document() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", fileName='" + fileName + '\'' +
                ", remake='" + remake + '\'' +
                ", createDate=" + createDate +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
