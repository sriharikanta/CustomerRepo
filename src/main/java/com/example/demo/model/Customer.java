package com.example.demo.model;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Customer {
@Id
private int  id;
private String name;
private String date;
private Character status;
}
