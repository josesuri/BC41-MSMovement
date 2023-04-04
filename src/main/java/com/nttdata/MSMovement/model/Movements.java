package com.nttdata.MSMovement.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document("movement")
public class Movements {
    @Id
    private String id;
    private String idProduct;
    private String type;
    private Float amount;
    private String idThirdPartyProduct;
    private Date date;
}
