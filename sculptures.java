
public class sculptures extends masterpieces {
    int volume;
    String material;

    public sculptures(int index,String cr,int y,String mov,String con,int vol,String mat)
    {
        super(index,cr,y,mov,con);

        volume = vol;
        material = mat;
        System.out.printf("Creating an instance of sculpture...\n\n");
    }

    void getInfo()
    {
        super.getInfo();
        System.out.printf(" | Volume: " + volume + " | Material: " + material);
    }

    boolean evaluate(String mov,String con)
    {
        if (condition.equals("empty"))
        {
            String current = "excellent";
            if (mov.equals(movement) && con.equals(current))
                return true;
            else 
                return false;
        } 
        else if (mov.equals(movement) && con.equals(condition))
            return true;
        else return false;
    }
}
