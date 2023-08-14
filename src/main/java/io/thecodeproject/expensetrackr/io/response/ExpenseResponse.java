package io.thecodeproject.expensetrackr.io.response;

import io.thecodeproject.expensetrackr.constant.ExpenseCode;
import io.thecodeproject.expensetrackr.io.response.generic.ApiStatus;
import io.thecodeproject.expensetrackr.io.response.generic.Result;
import io.thecodeproject.expensetrackr.io.response.generic.Error;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ExpenseResponse {

    private ApiStatus apiStatus;
    private Result result;

    public ExpenseResponse() {
        apiStatus = new ApiStatus();
        result = new Result();
        setSuccessAPIResponse();
    }

    public void setSuccessAPIResponse() {
        this.apiStatus.setStatus(ExpenseCode.SUCCESS.getCode());
        this.apiStatus.setDescription(ExpenseCode.SUCCESS.getMessage());
    }

    public void setResult(Integer response, String description) {
        this.result.setResponse(response);
        this.result.setDescription(description);
    }

    public void setErrorListAPIResponse(List<Error> errors) {
        this.apiStatus.setStatus(ExpenseCode.FAILURE.getCode());
        this.apiStatus.setDescription(ExpenseCode.FAILURE.getMessage());
        this.result.setErrors(errors);
    }

    public void addErrorAPIResponse(Integer code, String message) {
        this.apiStatus.setStatus(ExpenseCode.FAILURE.getCode());
        this.apiStatus.setDescription(ExpenseCode.FAILURE.getMessage());
        Error error = new Error();
        error.setCode(code);
        error.setMessage(message);
        this.result.getErrors().add(error);
    }

}
