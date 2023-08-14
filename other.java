public class other { // a class to create some function for the needs of project

    static String randCreator() // a function to create random string for the name of creator
    {
        int length = 10; // the length of string is indicative 10 ,means that the creator is going to be 10 characters
        String alphabet = "abcdefghijklmnopqrstuvxyz"; // a string with the english alphabet 
  
        StringBuilder buffer = new StringBuilder(length); // create the buffer of string
  
        for (int i = 0; i < length; i++) 
        {
            int index = (int)(alphabet.length() * Math.random()); // generate random char from alphabet
            buffer.append(alphabet.charAt(index)); // one by one char to create string
        }

        return buffer.toString();
    }

    static public int randNum(int min ,int max)  // generate random numbers from min to max
    {
        return (int) ((Math.random() * (max - min)) + min);
    }

    static public void auction(artifacts[] arrayOfArtifacts,String con,String mov,int numOfSub)
    {
        for (int i = 0; i < numOfSub; i++)
        {
            arrayOfArtifacts[i].getIndex();
            arrayOfArtifacts[i].getInfo();

            if (arrayOfArtifacts[i].evaluate(mov, con) == true)
                System.out.printf("\nAcceptable\n");
            else 
                System.out.printf("\nNOT acceptable\n");

            System.out.println("");
        }
    }

    

}
