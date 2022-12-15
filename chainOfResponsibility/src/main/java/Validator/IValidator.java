package Validator;

import domain.ValidationResult;
import model.IAnimal;

public interface IValidator {
    public void validate(IAnimal animal, ValidationResult validationResult);
}