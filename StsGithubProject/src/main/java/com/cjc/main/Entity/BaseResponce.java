package com.cjc.main.Entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponce<T>
{
  private int ResponceStatus;
  private String responseMsg;
  private Date responseDate;
  private T responceData;
}
