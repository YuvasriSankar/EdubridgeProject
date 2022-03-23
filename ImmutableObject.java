package string;

public class ImmutableObject {
	int sampleValue;
	


public ImmutableObject()
{
	sampleValue=1000;
}
public ImmutableObject(int sampleValue)
{
	this.sampleValue=sampleValue;
}
@Override
public String toString() {
	return "ImmutableObject [sampleValue=" + sampleValue + "]";
}
}