package com.andreabaccega.widget.async;

/**
 * Created by tracyrojas on 1/25/16.
 */
public abstract class DefaultAsyncValidatorCallback implements AsyncValidatorCallback {

    @Override
    public abstract void isValid();

    @Override
    public abstract void isNotValid(String message);
}
