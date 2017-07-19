package hello;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {
	
@NotNull
@Size(min=2,max=30)
private String name;

@NotNull
@Min(18)
private int age;

public String getName()
{
	return this.name;
}
public void setName(String name)
{
	 this.name=name;
}
public int getAge()
{
	return this.age;
}
public void setAge(int age)
{
	this.age=age;
}
public String toString()
{
	return "Person(Name: " + this.name + ", Age:" + this.age + ")";
}
}
