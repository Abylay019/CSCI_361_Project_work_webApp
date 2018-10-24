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
public interface UserInterface {
    public String getFirstName();
    public String getSecondName();
    public String getEmail();
    public String getDateOfBirth();
    public void changeSignUpProfile(String first_name, String second_name, String email, String date_of_birth);
}
