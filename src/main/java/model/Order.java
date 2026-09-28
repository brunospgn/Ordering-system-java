package model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private int id;
    private double price;
    private User user;
    private LocalDate date;
    
}
