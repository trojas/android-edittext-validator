package com.andreabaccega.widget.async;

/**
 * Created by tracyrojas on 1/25/16.
 */
public interface AsyncValidatorCallback {

    void isValid();

    void isNotValid(String errorMessage);
}
