package com.cjc.main.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private int customerId;
  private String customerName;
  private String customerPass;
  private String customerAddr;
  private String customerMob;
  
  @OneToOne(cascade = CascadeType.ALL)
  private Address address;
  
}
