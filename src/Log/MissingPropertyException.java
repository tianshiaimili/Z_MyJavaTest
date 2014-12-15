package Log;

public class MissingPropertyException extends Exception
{
    private String m_missingProperty = null;
    
    public MissingPropertyException(String exceptionStr, String propertyName) {
	super(exceptionStr);
	m_missingProperty = propertyName;
    }
    
    public String getMissingProperty() {
	return m_missingProperty;
    }
    
    protected MissingPropertyException() {
	/* empty */
    }
    
    protected MissingPropertyException(String s) {
	super(s);
    }
}
