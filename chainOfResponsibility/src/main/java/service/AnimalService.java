package service;

import Validator.IValidator;
import domain.ValidationResult;
import model.IAnimal;

import java.util.ArrayList;

public class AnimalService {

    private IValidator validator;
    private IAnimal animal;

    public AnimalService(IValidator validator, IAnimal animal) {
        this.validator = validator;
        this.animal = animal;
    }

    public ValidationResult validateAnimal() {
        ValidationResult validationResult = new ValidationResult(true, new ArrayList<>());
        validator.validate(animal, validationResult);
        return validationResult;
    }
}
