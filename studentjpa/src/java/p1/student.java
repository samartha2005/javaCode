/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

/**
 *
 * @author lenovo
 */
@Entity
@Table(name="student")
public class student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String message;
    public student()
    {
        
    }
    public student(String name, String message)
    {
        this.name = name;
        this.message=message;
    }

   
    public String getName()
    {
        return name;
    }
    public String getMessage()
    {
        return message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setMessage(String message)
    {
        this.message=message;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof student)) {
            return false;
        }
        student other = (student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "p1.student[ id=" + id + " ]";
    }
    
}
