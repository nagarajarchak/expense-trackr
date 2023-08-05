package io.thecodeproject.expensetrackr.vo.response.generic;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Result {

    private Integer response;
    private String description;
    private List<Error> errors = new ArrayList<>();

}