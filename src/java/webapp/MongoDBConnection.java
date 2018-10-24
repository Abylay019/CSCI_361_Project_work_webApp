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
public class MongoDBConnection {
    public String host;
    public int port;
    public String username;
    public String password;
    
    public MongoDBConnection(String host, int port){
        this.host = host;
        
        
    }
}
