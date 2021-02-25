package test.java.snippets.model;

import main.java.snippets.model.BaseData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class BaseDataTest {

    @Test
   void Constructor(){
        BaseData testClass = new BaseData(33,6356346346l);
        assertEquals(testClass.getcBaseValue(),"33");
        assertEquals(testClass.getId(),6356346346l);
        testClass.setcBaseValue(44);
        assertEquals(44,testClass.getcBaseValue());

   }

}