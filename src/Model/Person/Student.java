package Model.Person;

public class Student extends Person {
    private String personID;
    private String name;
    private String personalNumber;
    private String email;
    private String program;

    // Konstruktor
    public Student(String personID, String name, String personalNumber, String email, String program) {
        this.personID = personID;
        this.name = name;
        this.personalNumber = personalNumber;
        this.email = email;
        this.program = program;
    }

    // Getters och Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Student{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", personalNumber='" + personalNumber + '\'' +
                ", email='" + email + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}
