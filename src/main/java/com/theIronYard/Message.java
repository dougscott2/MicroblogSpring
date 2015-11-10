package com.theIronYard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by DrScott on 11/9/15.
 */
@Entity
public class Message {
    @Id
    @GeneratedValue
    Integer id;


    String text;


}
