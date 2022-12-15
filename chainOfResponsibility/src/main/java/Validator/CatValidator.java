package Validator;

import domain.ValidationResult;
import model.IAnimal;

import java.util.ArrayList;
import java.util.List;

public class CatValidator implements IValidator{

    @Override
    public ValidationResult validate(IAnimal animal, ValidationResult validationResult) {
        return validationResult;
    }
}
