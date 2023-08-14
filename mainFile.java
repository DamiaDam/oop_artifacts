/* ASKISI JAVA OOP 2021-22
DAMIANAKIS DAMIANOS
1115201800306 */

class mainFile {
    public static void main(String[] args) {

        if( args.length != 3)
        {
            System.out.println("Wrong amount of arguments! Must be 3");
            System.exit(0);
        }

        /* Set up the arguments from command line */
        int numOfSubjects = Integer.parseInt(args[0]); // convert to integer 
        String movement = args[1];
        String condition = args[2];

        /* Define the static arrays with information */
        String arrayTechique[] = {"oil","aquarelle","tempera"};
        String arrayMaterial[] = {"iron","stone","wood"};
        String arrayMovement[] = {"impressionism","expressionism","naturalism"};
        String arrayCondition[] = {"good","bad","excellent","empty"};

        artifacts[] arrayOfArtifacts; // current array to store the artifacts
        arrayOfArtifacts = new artifacts[numOfSubjects]; // allocate memory for artifacts

        // the ranges in arguments are indicative,we can put everything we want 
        // (some painting, as you can see are from the future -_-)
        for (int i = 0 ; i < numOfSubjects; i++) // fill the array with artifacts
        {
            if (other.randNum(0, 2) == 0) // the range 0 to 3 in arrays of condition and movement is because the length of all arrays is three
                arrayOfArtifacts[i] = new paintings(i,other.randCreator(),other.randNum(1900,2100),
                arrayMovement[other.randNum(0,3)],arrayCondition[other.randNum(0,4)],other.randNum(20,200),other.randNum(20,200),arrayTechique[other.randNum(0,3)]); 
            else 
                arrayOfArtifacts[i] = new sculptures(i,other.randCreator(),other.randNum(1900,2100),
                arrayMovement[other.randNum(0,3)],arrayCondition[other.randNum(0,4)],other.randNum(0,100),arrayMaterial[other.randNum(0,3)]); 
        }

        other.auction(arrayOfArtifacts,condition,movement,numOfSubjects);
    }

}