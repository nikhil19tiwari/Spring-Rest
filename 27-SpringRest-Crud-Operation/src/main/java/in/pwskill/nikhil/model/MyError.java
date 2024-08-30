package in.pwskill.nikhil.model;

public class MyError {
private String date;
private String  status;
private Integer code;
private String msg;
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Integer getCode() {
	return code;
}
public void setCode(Integer code) {
	this.code = code;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
@Override
public String toString() {
	return "MyError [date=" + date + ", status=" + status + ", code=" + code + ", msg=" + msg + "]";
}
public MyError(String date, String status, Integer code, String msg) {
	super();
	this.date = date;
	this.status = status;
	this.code = code;
	this.msg = msg;
}


}
