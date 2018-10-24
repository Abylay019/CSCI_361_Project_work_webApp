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
public class UserSignInProfile {
    public String username;
    public String password;
    
    public UserSignInProfile(String username,String password){
        this.username = username;
        this.password = password;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public boolean changePassword(String new_password){
        try{
        this.password = new_password;
        //return "You password has been changed!";
        return true;
        } catch(Exception e){
            e.getStackTrace();
            return false;
        }
    }
    
    public boolean confirmPassword(String to_be_confirmed) throws Exception{
        try{
            assert (to_be_confirmed != null & this.password != null);
            return (this.password == to_be_confirmed);
        } catch(Exception exception){
            return false;
        }
    }
}
