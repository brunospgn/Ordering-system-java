package model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private int id;
    private Product product;
    private int quantity;
    private Order order;

}
