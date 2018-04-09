package hackereath;

public class Customer {

	private String column_name;
	private String datatype;
	private int length;
	public String getColumn_name() {
		return column_name;
	}
	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}
	public String getDatatype() {
		return datatype;
	}
	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public String toString(){
		return "[column_name="+column_name+",  datatype="+datatype+",    length="+length+"]";
	}
}
