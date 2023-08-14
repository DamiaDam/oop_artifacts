public class paintings extends masterpieces {
    int length;
    int width;
    String technique;

    public paintings(int index,String cr,int y,String mov,String con,int len,int wid,String tech)
    {
        super(index,cr,y,mov,con);

        length = len;
        width = wid;
        technique = tech;
        System.out.printf("Creating an instance of painting...\n\n");
    }

    void getInfo()
    {
        super.getInfo();
        System.out.printf(" | Length: " + length + " | Width: " + width + " | Technique: " + technique + " ,with surface: "+ length * width);
    }

    boolean evaluate(String mov,String con)
    {
        if (condition.equals("empty"))
        {
            String current = "good";
            if (mov.equals(movement) && con.equals(current))
                return true;
            else 
                return false;
        } 
        else if (mov.equals(movement) && con.equals(condition))
            return true;
        else if (mov.equals(movement) && con.equals("good") && condition.equals("excellent"))
            return true;
        else 
            return false;
    }
    
    boolean evaluate(String str)
    {
        condition  = "good";
        if (str.equals(movement))
            return true;
        else 
            return false;
    }
}
