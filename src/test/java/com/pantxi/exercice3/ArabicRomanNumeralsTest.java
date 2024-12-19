package com.pantxi.exercice3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArabicRomanNumeralsTest {
//  @Test
//    void convert_test(){
//      ArabicRomanNumerals a=new ArabicRomanNumerals();
//      String resultat= a.convert(0);
//      assertEquals("NULL",resultat);
//  }


// test 2
//@Test
//void convert_test(){
//  ArabicRomanNumerals a=new ArabicRomanNumerals();
//  String resultat= a.convert(1);
//  assertEquals("I",resultat);
//}
//}

//void convert_test(){
//@Test
//  ArabicRomanNumerals a=new ArabicRomanNumerals();
//  String resultat= a.convert(5);
//  assertEquals("V",resultat);
//}
//}
  //@Test
//void convert_test(){
//  ArabicRomanNumerals a=new ArabicRomanNumerals();
//  String resultat= a.convert(39);
//  assertEquals("XXXIX",resultat);
//}
//}
@Test
void convert_test(){
  ArabicRomanNumerals a=new ArabicRomanNumerals();
  String resultat= a.convert(10);
  assertEquals("X",resultat);
}
}

