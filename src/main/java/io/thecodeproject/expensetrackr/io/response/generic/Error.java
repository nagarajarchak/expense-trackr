package io.thecodeproject.expensetrackr.io.response.generic;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Error {

    private Integer code;
    private String message;

}