package services;

public class PasswordValidationService {

    public PasswordValidationService() {
    }

    public int passwordValidation(String password){

        boolean[] pendencies = {false,false,false,false}; //this array will help to count how many type of char need insert
        int numberPendencies = 0; //it will be used to count the number of type of characters need insert
        int needAdd = 0;

        for (int i = 0; i<password.length(); i++){ //this for loop will change the array pendencies position to true according for each char type

            char positionChar = password.charAt(i);
            String positionString = positionChar+"";//it is a way to parse a char to String

            if(positionString.matches("[A-Z]*")){
                pendencies[0] = true;
            }
            else if(positionString.matches("[a-z]*")){
                pendencies[1] = true;
            }
            else if(positionString.matches("[0-9]*")){
                pendencies[2] = true;
            }
            else if(positionString.matches("[!@#$%^&*()\\-+]*")){
                pendencies[3] = true;
            }
        }

        //here it will count how many char are missing
        for (boolean pendency : pendencies) {
            if (!pendency) {
                numberPendencies++;
            }
        }

        //it will test if the requirements are in agreement
        if(password.length()<6){
            if(numberPendencies > (6 - password.length())){
                needAdd = numberPendencies;
            }

            else {
                needAdd = 6 - password.length();
            }
        }

        else if(password.length()>=6 && numberPendencies > 0){
            needAdd = numberPendencies;
        }

        return needAdd;
    }
}
