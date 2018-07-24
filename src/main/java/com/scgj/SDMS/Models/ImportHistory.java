package com.scgj.SDMS.Models;

import javax.persistence.Column;
import javax.persistence.Id;

public class ImportHistory {

    @Id
    @Column(name = "importNo")
    private int importNo;

    @Column(name = "uploaderEmail")
    private String uploaderEmail;

    @Column(name = "type")
    private String type;

    @Column(name = "uploadDate")
    private String uploadDate;

    @Column(name = "file")
    private String file;

    @Column(name = "fileName")
    private String fileName;

    public ImportHistory() {
    }

    public ImportHistory(int importNo, String uploaderEmail, String type, String uploadDate, String file, String fileName) {
        this.importNo = importNo;
        this.uploaderEmail = uploaderEmail;
        this.type = type;
        this.uploadDate = uploadDate;
        this.file = file;
        this.fileName = fileName;
    }

    public int getImportNo() {
        return importNo;
    }

    public void setImportNo(int importNo) {
        this.importNo = importNo;
    }

    public String getUploaderEmail() {
        return uploaderEmail;
    }

    public void setUploaderEmail(String uploaderEmail) {
        this.uploaderEmail = uploaderEmail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
