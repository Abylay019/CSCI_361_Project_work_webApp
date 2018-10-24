/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp;

/**
 *
 * @author Yerassyl
 */
public class UserSignUpProfile implements UserInterface{
    public String first_name;
    public String second_name;
    public String email;
    public String date_of_birth;
    
    public UserSignUpProfile(String first_name, String second_name, String email, String date_of_birth) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.email = email;
        this.date_of_birth = date_of_birth;
    }
    
    @Override
    public String getFirstName() {
        return this.first_name;
    }

    @Override
    public String getSecondName() {
        return this.second_name;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String getDateOfBirth() {
        return this.date_of_birth;
    }
    
    @Override
    public void changeSignUpProfile(String first_name, String second_name, String email, String date_of_birth) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.email = email;
        this.date_of_birth = date_of_birth;
    }
}
