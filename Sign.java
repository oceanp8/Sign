public class Sign
{
    private String message; 
    private int width;

    public Sign(String a, int b)
    {
        message = a;
        width = b;
    }

    public int numberOfLines()
    {
        int lines = message.length()/width;
        if(message.length()%width == 0) return lines;
        return lines + 1;
    }

    public String getLines()
    {
        if(message.length()==0) return null;
        String s = "";
        int i = 0;
        while(i < message.length()){
            s+=message.substring(i,i+1);
            i++;
            if(i%width == 0 && i != message.length()) s+=";";
        }
        return s;
    }
}