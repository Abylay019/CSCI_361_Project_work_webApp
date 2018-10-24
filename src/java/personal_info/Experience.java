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
public class Experience {
    private List<Workplace> workplaces;
    private List<Project> projects;
    
    public void Experience(List<Workplace> workplaces, List<Project> projects){
        workplaces.forEach((workplace) -> { this.workplaces.add(workplace); });
        projects.forEach((project) -> { this.projects.add(project); });
    }

    /**
     * @return the workplaces
     */
    public List<Workplace> getWorkplaces() {
        return workplaces;
    }

    /**
     * @return the projects
     */
    public List<Project> getProjects() {
        return projects;
    }

    public void addWorkplace(Workplace workplace) {
        this.workplaces.add(workplace);
    }

    public void addProject(Project project) {
        this.projects.add(project);
    }
    
    
}
