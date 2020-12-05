package com.javatodev.api.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConvertedEnum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DynamoDBTable(tableName = "lend")
public class Lend {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;

    @DynamoDBAttribute
    @DynamoDBTypeConvertedEnum
    private LendStatus status;

    @DynamoDBAttribute
    private String startOn;

    @DynamoDBAttribute
    private String dueOn;

    @DynamoDBAttribute
    private String bookId;

    @DynamoDBAttribute
    private String memberId;

}