package com.nttdata.bootcamp.demo1;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class book {
private String idbook;
}