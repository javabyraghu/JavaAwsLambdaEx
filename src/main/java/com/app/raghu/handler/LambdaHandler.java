package com.app.raghu.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<Integer, String> {

    @Override
    public String handleRequest(Integer input, Context context) {
        int result = performOperation(input);
        return "Result: " + result;
    }

    private int performOperation(int input) {
    	//dummy logic..
        return input * 2;
    }
}
