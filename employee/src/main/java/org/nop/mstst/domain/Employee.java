package org.nop.mstst.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Employee {

    @Id
    private String id;
    private String name;
    private String email;
}
