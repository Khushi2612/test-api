package com.api.testapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReturnRequest {
    @JsonProperty(value = "return_method")
    String returnMethod;

    public String getReturnMethod() {
        return returnMethod;
    }

    public void setReturnMethod(String returnMethod) {
        this.returnMethod = returnMethod;
    }
}
