package Validator;

import domain.ValidationResult;
import model.IAnimal;

public interface IValidator {
    ValidationResult validate(IAnimal animal, ValidationResult validationResult);
}