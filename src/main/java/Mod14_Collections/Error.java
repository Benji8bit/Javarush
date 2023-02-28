package Mod14_Collections;

import java.util.HashMap;
import java.util.Map;

public enum Error {
    NETWORK_ERROR(100), SYSTEM_ERROR(200), COMPILATION_ERROR(300);

    private final int errorCode;
    //напишите тут ваш код

    Error(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public static Error getErrorByID(Integer errorNumber) {
        return errorMap.get(errorNumber);
    }

    public Map<Integer, Error> getErrorMap() { return errorMap; }

    @Override
    public String toString() {
        return String.format("Error{ errorCode = %s }", errorCode);
    }
}
