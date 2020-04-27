package com.tai.eureka.domain;

/**
 * ���ӹ�����Ϣ��
 */
public class T_bh_dcasemsg implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	 private String case_id ;
     private String group_id;
     private String case_phone ;
     private String case_optime ;
     private String autocheck_result;
     private String case_pdf;
     private String isPhoto;
     private String yul01;
     private String yul02;
     private String yul03;

     public static long getSerialVersionUID() {
          return serialVersionUID;
     }

     public String getCase_id() {
          return case_id;
     }

     public void setCase_id(String case_id) {
          this.case_id = case_id;
     }

     public String getGroup_id() {
          return group_id;
     }

     public void setGroup_id(String group_id) {
          this.group_id = group_id;
     }

     public String getCase_phone() {
          return case_phone;
     }

     public void setCase_phone(String case_phone) {
          this.case_phone = case_phone;
     }

     public String getCase_optime() {
          return case_optime;
     }

     public void setCase_optime(String case_optime) {
          this.case_optime = case_optime;
     }

     public String getAutocheck_result() {
          return autocheck_result;
     }

     public void setAutocheck_result(String autocheck_result) {
          this.autocheck_result = autocheck_result;
     }

     public String getCase_pdf() {
          return case_pdf;
     }

     public void setCase_pdf(String case_pdf) {
          this.case_pdf = case_pdf;
     }

     public String getIsPhoto() {
          return isPhoto;
     }

     public void setIsPhoto(String isPhoto) {
          this.isPhoto = isPhoto;
     }

     public String getYul01() {
          return yul01;
     }

     public void setYul01(String yul01) {
          this.yul01 = yul01;
     }

     public String getYul02() {
          return yul02;
     }

     public void setYul02(String yul02) {
          this.yul02 = yul02;
     }

     public String getYul03() {
          return yul03;
     }

     public void setYul03(String yul03) {
          this.yul03 = yul03;
     }
}