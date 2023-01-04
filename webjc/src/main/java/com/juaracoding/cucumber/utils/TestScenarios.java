package com.juaracoding.cucumber.utils;

public enum TestScenarios {
	
	T1("Payment Berhasil");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
