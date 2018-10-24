/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal_info;

import java.util.List;

/**
 *
 * @author Yerassyl
 */
public class Interests {
    private List<String> interests;
    
    public void Interests(List<String> interests){
        interests.forEach((interest) -> { this.getInterests().add(interest); });
    }

    /**
     * @return the interests
     */
    public List<String> getInterests() {
        return interests;
    }

    public void addInterest(String interest) {
        this.interests.add(interest);
    }
}
