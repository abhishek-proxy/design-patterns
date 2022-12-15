package domain;

import java.util.ArrayList;
import java.util.List;

public class ValidationResult {
    public Boolean isValid;
    public List<String> errorMessage;

    public ValidationResult(Boolean isValid, List<String> errorMessage) {
        this.isValid = isValid;
        this.errorMessage = errorMessage;
    }
}
