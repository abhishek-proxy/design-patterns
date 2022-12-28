package Validator;

import domain.ValidationResult;
import model.IAnimal;

public class FlyValidator implements IValidator{
    private IValidator validator;
    @Override
    public void validate(IAnimal animal, ValidationResult validationResult) {
        // http
        // validate from db
        if (animal.canFly()) {
            validationResult.isValid = false;
            validationResult.errorMessage.add("Cats can't fly");
            return;
        }
        validator.validate(animal, validationResult);
    }

    @Override
    public void setNextValidator(IValidator validator) {
        this.validator = validator;
    }
}
