package Validator;

import domain.ValidationResult;
import model.IAnimal;

public class NoValidator implements IValidator{
    @Override
    public void validate(IAnimal animal, ValidationResult validationResult) {
        return;
    }

    @Override
    public void setNextValidator(IValidator validator) {

    }
}
