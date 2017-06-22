/**
 * Created by VADVASX on 6/22/2017.
 */

public class Person {

    private string username;
    private string treatment;
    private string diagnosis;
    private string clinical_trial;
    private string location;
    private string age;
    private string gender;
    private string hospital;
    private string description;
    private Person[] favorites;
    private Chats[] myChats;

    public Person(string myUsername, string myTreatment, string mylocation){

        this.username = myUsername;
        this.treatment = myTreatment;
        this.location = myLocation;

    }


}
