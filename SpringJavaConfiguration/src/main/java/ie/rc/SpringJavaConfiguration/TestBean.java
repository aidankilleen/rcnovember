package ie.rc.SpringJavaConfiguration;

public class TestBean {
	
	private String name = "Default Name";
	
	public TestBean() {
		
	}
	
	public TestBean(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		
		return "TestBean: name=" + name;
	}
	
	
}
