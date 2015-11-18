
public class JSONArrayVariable extends JSONVariable{
	
	private JSONArray value = new JSONArray();
	
	public JSONArrayVariable(String name, JSONArray value)
	{
		super(name);
		this.value = value;
	}

	void display() {
		System.out.println(this.name + " -> ");
		this.value.display();
	}

}
