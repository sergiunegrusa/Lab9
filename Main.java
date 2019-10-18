import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args){

        ArrayList<Patient> patientArrayList = new ArrayList<>();
        String filename = "patients";
        File inputFile = new File(filename);
        Scanner in = null;

        try {
            in = new Scanner(inputFile);
        }
        catch (FileNotFoundException e) {

            System.out.println ("Cannot open " + filename);
            System.exit (0);

        }

        while(in.hasNext()) {

            String firstName = in.nextLine();
            String lastName = in.nextLine();
            String illness = in.nextLine();
            int severity = in.nextInt();

            patientArrayList.add(new Patient(firstName, lastName, illness, severity));

            in.nextLine();

        }

        PriorityQueue<Patient> patientQueue = new PriorityQueue<>();

        for(int i=0;i<patientArrayList.size();i++){
            patientQueue.add(patientArrayList.get(i));
        }

        while (!patientQueue.isEmpty()) {
            System.out.println(patientQueue.remove());
        }

    }
}
