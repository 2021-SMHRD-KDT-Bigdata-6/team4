package mini;

public class rankVO {

	
	private String name;
	private String point;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public rankVO(String name, String point) {		
		this.name = name;
		this.point = point;
	}
}
