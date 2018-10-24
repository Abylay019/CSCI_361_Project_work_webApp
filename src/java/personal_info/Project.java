/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal_info;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Yerassyl
 */
public class Project {
    
    /*
        Date must be entered in the format of dd/MM/yyyy
    */
    private Date from;
    private Date to;
    private String topic;
    private String area;
    
    void Project(String from, String to, String topic, String area){
        try{
            DateFormat format = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
            
            // Setting time and converting them to Date Object
            this.setFrom(format.parse(from));
            this.setTo(format.parse(to));
            
            // Assigning values to other fields
            this.setTopic(topic);
            this.setArea(area);
            
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
     * @return the topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * @param topic the topic to set
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }
}
