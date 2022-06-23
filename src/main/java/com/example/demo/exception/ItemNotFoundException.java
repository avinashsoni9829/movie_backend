package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class ItemNotFoundException extends RuntimeException {
     private String errorMessage;
     
}
