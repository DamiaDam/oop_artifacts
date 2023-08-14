abstract class artifacts {
    int indexNum;
    String creator;
    int year;

    public artifacts(int index,String cr,int y) // constructor
    {
        indexNum = index;
        creator = cr;
        year  = y;
        System.out.printf("Creating an instance of artifact...\n");
    }

    void getInfo()
    {
        System.out.printf("Creator: " + creator + " | Year: " + year + " |");
    }

    void getIndex()
    {
        System.out.printf("Arifact[" + indexNum + "]: ");
    }

    abstract boolean evaluate(String mov, String con);
}
