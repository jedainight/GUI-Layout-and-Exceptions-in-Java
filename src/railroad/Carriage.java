package railroad;

public abstract class Carriage {

	private int id;	
	private String type;
	
	public Carriage(int id, String type) {
		this.id=id;
		this.type=type;
	}
	
	protected int getId(){
		return id;
	}
	
	protected void setId(int id){
		this.id=id;
	}
	
	public String getType(){
		return type;
	}
}
