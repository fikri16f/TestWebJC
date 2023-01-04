package com.juaracoding.cucumber.drivers.strategies;

import com.juaracoding.cucumber.utils.Constants;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();

            default:
                return null;
        }
    }
}
