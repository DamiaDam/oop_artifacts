 abstract public class masterpieces extends artifacts {
    String movement;
    String condition;

    masterpieces(int index,String cr,int y,String mov,String con)
    {   
        super(index,cr,y);

        movement = mov ;
        condition = con;
        System.out.printf("Creating an instance of masterpiece...\n");
    }

    void getInfo()
    {
        super.getInfo();
        System.out.printf(" Movement: " + movement + " | Condition: " + condition);
    }

    abstract boolean evaluate(String mov,String con);
}
