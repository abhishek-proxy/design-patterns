package Validator;

import domain.ValidationResult;
import model.IAnimal;

public class SwimValidator implements IValidator{

    private IValidator validator;
    @Override
    public void validate(IAnimal animal, ValidationResult validationResult) {
        if (animal.canSwim()) {
            validationResult.isValid = false;
            validationResult.errorMessage.add("Cats can't swim");
            return;
        }
        validator.validate(animal, validationResult);
    }

    @Override
    public void setNextValidator(IValidator validator) {
        this.validator = validator;
    }
}
