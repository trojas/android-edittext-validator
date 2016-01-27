package com.andreabaccega.widget.async;

/**
 * Created by tracyrojas on 1/25/16.
 */
public class AsyncValidationContext {

    private String textToValidate;
    private AsyncValidatorCallback callback;

    public AsyncValidationContext(String textToValidate, AsyncValidatorCallback callback) {
        this.textToValidate = textToValidate;
        this.callback = callback;
    }

    public String getTextToValidate() {
        return textToValidate;
    }

    public void setTextToValidate(String textToValidate) {
        this.textToValidate = textToValidate;
    }

    public AsyncValidatorCallback getCallback() {
        return callback;
    }

    public void setCallback(AsyncValidatorCallback callback) {
        this.callback = callback;
    }
}
