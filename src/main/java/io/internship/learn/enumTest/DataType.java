package io.internship.learn.enumTest;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public enum DataType {


    /**
     * DataType Enum will help me to organize the Data Type in Mysql Data Base
     */

    INT('I', 0, 32),
    NUMBER('N', 0, 32),
    DOUBLE('D', 0, 32),
    FLOAT('F', 0, 32),
    VARCHAR('V', 0, 32),
    CHAR('C', 0, 32),
    TEXT('T', 0, 256),
    DATE('T', 0, 1000000),
    BLOB('B', 0, 256);


    private char code;
    private int minValue;
    private int maxValue;

    DataType(char code, int minValue, int maxValue) {
        this.code = code;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public char getCode() {
        return code;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }




}
