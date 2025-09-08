/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;
import javax.persistence.*;

import java.io.*;
/**
 *
 * @author Shrinivas
 */
@Entity
@Table(name = "student")
public class Student {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String message;
public void Student(int id,String name,String message)
{
    this.id=id;
    this.name=name;
    this.message=message;
}
    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }  
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getMessage()
    {
        return message;
    }
    public void setMessage(String message)
    {
        this.message=message;
    }
}
