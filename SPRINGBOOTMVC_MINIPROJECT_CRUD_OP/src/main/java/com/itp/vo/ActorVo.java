package com.itp.vo;

public class ActorVo {
   private int aid;
   private String aname;
   private String addrs;
   private String cat;
   private double fees;
   
   public int getAid() {
	return aid;
   }
   public void setAid(int aid) {
	this.aid = aid;
   }
   public String getAname() {
	return aname;
   }
   public void setAname(String aname) {
	this.aname = aname;
   }
   public String getAddrs() {
	return addrs;
   }
   public void setAddrs(String addrs) {
	this.addrs = addrs;
   }
   public String getCat() {
	return cat;
   }
   public void setCat(String cat) {
	this.cat = cat;
   }
   public double getFees() {
	return fees;
   }
   public void setFees(double fees) {
	this.fees = fees;
   }
   @Override
   public String toString() {
	return "ActorVo [aid=" + aid + ", aname=" + aname + ", addrs=" + addrs + ", cat=" + cat + ", fees=" + fees + "]";
   }
  
  
}
