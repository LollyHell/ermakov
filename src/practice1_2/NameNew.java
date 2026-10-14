package practice1_2;

public class NameNew {
    private  String lastName;
    private  String firstName;
    private  String midName;

    public NameNew(String lastName, String firstName, String midName) {
        if (lastName == null) lastName = "";
        if (firstName == null) firstName = "";
        if (midName == null) midName = "";
        this.lastName = lastName;
        this.firstName = firstName;
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }


    @Override
    public String toString() {
        String res = "";
        if (firstName != null){
            res += firstName + " ";
        }
        if (midName != null){
            res += midName + " ";
        }
        if (lastName != null){
            res += lastName + " ";
        }
        return  res;
    }
}

