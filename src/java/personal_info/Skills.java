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
public class Skills {
    private List<String> skills;
    
    public void Skills(List<String> skills){
        skills.forEach((skill) -> { this.skills.add(skill); });
    }
    
    public void addSkills(String skill) {
        this.skills.add(skill);
    }
}
