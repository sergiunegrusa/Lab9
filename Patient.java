import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Patient implements Comparable < Patient > {

    private String firstName;
    private String lastName;
    private String illness;
    private int severity;

    /**
     * Constructor
     * @param firstName first name of the patient
     * @param lastName last name of the patient
     * @param illness illness name
     * @param severity severity level
     */
    public Patient(String firstName, String lastName, String illness, int severity){
        setFirstName(firstName);
        setLastName(lastName);
        setIllness(illness);
        setSeverity(severity);
    }

    /**
     * sets the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *sets the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *sets the illness
     */
    public void setIllness(String illness) {
        this.illness = illness;
    }

    /**
     * sets the severity
     */
    public void setSeverity(int severity) {
        if(severity < 6 && severity > 0) {
            this.severity = severity;
        }
        else{
            System.out.println("Error");
        }
    }

    /**
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the illness
     */
    public String getIllness() {
        return illness;
    }

    /**
     * @return the severity
     */
    public int getSeverity() {
        return severity;
    }

    /**
     * @return the first name, last name, illness and severity
     */
    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + ": " + getIllness()+ " "+getSeverity();
    }

    /**
     * method that compares two patients by their severity
     * @param otherPatient is another patient
     * @return 0 if the severity is equal, 1 if the severity of the first patient is lower that the other
     * and -1 if it's higher
     */
    @Override
    public int compareTo(Patient otherPatient) {
        if(this.getSeverity() == otherPatient.getSeverity()){
            return 0;
        }
        else if(this.getSeverity() < otherPatient.getSeverity()){
            return 1;
        }
        else
            return -1;
    }



}
