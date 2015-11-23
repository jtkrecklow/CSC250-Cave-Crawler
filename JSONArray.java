
public class JSONArray 
{
	private JSONVariable[] theVariables;
	private int size;

	public JSONArray()
	{
		this.theVariables = new JSONVariable[50];
		this.size = 0;
	}
	
	public void addVariable(JSONVariable jv)
	{
		if(this.size < this.theVariables.length);
		{
			this.theVariables[size] = jv;
			size++;
		}
	}
	
	public void display()
	{
		System.out.println("JSON Array - number of vars: " + this.size);
		for(int i = 0; i < size; i ++)
		{
			theVariables[i].display();
		}
		
	}
	
	public String exportToJSON()
	{
		String answer = "[";
		
		for (int i = 0; i < size; i++)
		{
			answer += theVariables[i].exportToJSON();
		}
		answer += "]";
		return answer;
	}


}