package io.thecodeproject.themes.vo.response.generic;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ApiStatus {

    private Integer status;
    private String description;

}