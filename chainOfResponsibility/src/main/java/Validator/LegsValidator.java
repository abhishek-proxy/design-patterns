package Validator;

import domain.ValidationResult;
import model.IAnimal;

public class LegsValidator implements IValidator{
    private IValidator validator;
    @Override
    public void validate(IAnimal animal, ValidationResult validationResult) {
        if (animal.getLegs() != 4) {
            validationResult.isValid = false;
            validationResult.errorMessage.add("Cats should have 4 legs");
            return;
        }
        validator.validate(animal, validationResult);
    }

    @Override
    public void setNextValidator(IValidator validator) {
        this.validator = validator;
    }
}
