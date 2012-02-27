package p1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class C_Test {

  @Test
  public void f() {
    assertEquals(4, new C().sum(1, 3));
  }
}
