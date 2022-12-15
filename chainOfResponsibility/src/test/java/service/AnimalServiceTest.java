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
    public void shouldReturnFalseIfCatCanSwim() {
        Cat cat = new Cat(4, false, true);
        CatValidator catValidator = new CatValidator();
        AnimalService animalService = new AnimalService(catValidator, cat);
        assertFalse(animalService.validateAnimal().isValid);
    }

    @Test
    public void shouldReturnFalseIfCatCanFly() {
        Cat cat = new Cat(4, true, false);
        CatValidator catValidator = new CatValidator();
        AnimalService animalService = new AnimalService(catValidator, cat);
        assertFalse(animalService.validateAnimal().isValid);
    }

    @Test
    public void shouldReturnFalseIfCatHas3Legs() {
        Cat cat = new Cat(3, true, false);
        CatValidator catValidator = new CatValidator();
        AnimalService animalService = new AnimalService(catValidator, cat);
        assertFalse(animalService.validateAnimal().isValid);
    }

}