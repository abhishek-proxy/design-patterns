package service;

import Validator.CatValidator;
import Validator.FlyValidator;
import Validator.LegsValidator;
import Validator.NoValidator;
import Validator.SwimValidator;
import model.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnimalServiceTest {

    @Test
    public void shouldReturnTrueIfCatIsValid() {
        Cat cat = new Cat(4, false, false);
        LegsValidator legsValidator = new LegsValidator();
        SwimValidator swimValidator = new SwimValidator();
        FlyValidator flyValidator = new FlyValidator();
        NoValidator noValidator = new NoValidator();

        legsValidator.setNextValidator(swimValidator);
        swimValidator.setNextValidator(flyValidator);
        flyValidator.setNextValidator(noValidator);



        AnimalService animalService = new AnimalService(legsValidator, cat);
        assertTrue(animalService.validateAnimal().isValid);
    }

    @Test
    public void shouldReturnFalseIfCatCanSwim() {
        Cat cat = new Cat(4, false, true);
        LegsValidator legsValidator = new LegsValidator();
        SwimValidator swimValidator = new SwimValidator();
        FlyValidator flyValidator = new FlyValidator();
        NoValidator noValidator = new NoValidator();
        legsValidator.setNextValidator(swimValidator);
        swimValidator.setNextValidator(flyValidator);
        flyValidator.setNextValidator(noValidator);
        AnimalService animalService = new AnimalService(legsValidator, cat);
        assertFalse(animalService.validateAnimal().isValid);
    }

    @Test
    public void shouldReturnFalseIfCatCanFly() {
        Cat cat = new Cat(4, true, false);
        LegsValidator legsValidator = new LegsValidator();
        SwimValidator swimValidator = new SwimValidator();
        FlyValidator flyValidator = new FlyValidator();
        NoValidator noValidator = new NoValidator();
        legsValidator.setNextValidator(swimValidator);
        swimValidator.setNextValidator(flyValidator);
        flyValidator.setNextValidator(noValidator);
        AnimalService animalService = new AnimalService(legsValidator, cat);
        assertFalse(animalService.validateAnimal().isValid);
    }

    @Test
    public void shouldReturnFalseIfCatHas3Legs() {
        Cat cat = new Cat(3, true, false);
        LegsValidator legsValidator = new LegsValidator();
        SwimValidator swimValidator = new SwimValidator();
        FlyValidator flyValidator = new FlyValidator();
        NoValidator noValidator = new NoValidator();
        legsValidator.setNextValidator(swimValidator);
        swimValidator.setNextValidator(flyValidator);
        flyValidator.setNextValidator(noValidator);
        AnimalService animalService = new AnimalService(legsValidator, cat);
        assertFalse(animalService.validateAnimal().isValid);
    }

}