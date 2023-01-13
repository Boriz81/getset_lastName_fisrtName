public class User {
    String firstName, lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User() {this.firstName = " ";this.lastName = " ";


    }

    public String getFullName() {
        String sentence = " ";
        if (this.firstName != " " && this.lastName != " ") {sentence = this.firstName + " " + this.lastName;}
        else if (this.firstName != " " && this.lastName == " ") { sentence = this.firstName;}

        return sentence;
    }
}
