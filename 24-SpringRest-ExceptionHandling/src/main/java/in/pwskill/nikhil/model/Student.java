package in.pwskill.nikhil.model;

public class Student {
private Integer sid;
private String sname;
private Integer sage;
private String saddress;
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Integer getSage() {
	return sage;
}
public void setSage(Integer sage) {
	this.sage = sage;
}
public String getSaddress() {
	return saddress;
}
public void setSaddress(String saddress) {
	this.saddress = saddress;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + "]";
}
public Student(Integer sid, String sname, Integer sage, String saddress) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sage = sage;
	this.saddress = saddress;
}

}
