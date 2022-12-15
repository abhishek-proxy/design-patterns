package service;

import Validator.CatValidator;
import model.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnimalServiceTest {

    @Test
    public void shouldReturnTrueIfCatIsValid() {
        Cat cat = new Cat(4, false, true);
        CatValidator catValidator = new CatValidator();
        AnimalService animalService = new AnimalService(catValidator, cat);
        assertTrue(animalService.validateAnimal().isValid);
    }

    @Test
    public void shouldReturnFalseIfCatIsValid() {
        Cat cat = new Cat(4, false, true);
        CatValidator catValidator = new CatValidator();
        AnimalService animalService = new AnimalService(catValidator, cat);
        assertFalse(animalService.validateAnimal().isValid);
    }

}