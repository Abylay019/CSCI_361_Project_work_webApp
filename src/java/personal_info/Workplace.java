/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal_info;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author Yerassyl
 */
public class Workplace {
    /*
        Date must be entered in the format of dd/MM/yyyy
    */
    private Date from;
    private Date to;
    private String position;
    private String where;
    private List<String> responsibilities = new ArrayList();
    
    void Project(String from, String to, String position, String where, List<String> responsibilities){
        try{
            DateFormat format = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
            
            // Setting time and converting them to Date Object
            this.setFrom(format.parse(from));
            this.setTo(format.parse(to));
            
            // Assigning values to other fields
            this.setPosition(position);
            this.setWhere(where);
            
            responsibilities.forEach((responsibility) -> { this.getResponsibilities().add(responsibility); });
        
        } catch(ParseException ex){
            ex.printStackTrace();
        }
    }

    /**
     * @return the from
     */
    public Date getFrom() {
        return from;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(Date from) {
        this.from = from;
    }

    /**
     * @return the to
     */
    public Date getTo() {
        return to;
    }

    /**
     * @param to the to to set
     */
    public void setTo(Date to) {
        this.to = to;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the where
     */
    public String getWhere() {
        return where;
    }

    /**
     * @param where the where to set
     */
    public void setWhere(String where) {
        this.where = where;
    }

    /**
     * @return the responsibilities
     */
    public List<String> getResponsibilities() {
        return responsibilities;
    }

    /**
     * @param responsibilities the responsibilities to set
     */
    public void setResponsibilities(List<String> responsibilities) {
        this.responsibilities = responsibilities;
    }
    
    /**
     * Add one more responsibility to the list
    */
    public void addResponsibility(String responsibility) {
        this.responsibilities.add(responsibility);
    }
}
