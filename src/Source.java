public class Source
{
    public static void main (String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Source s = (Source) Class.forName("xD").newInstance();
    }

    
}