/*
 * This file was automatically generated by EvoSuite
 * Mon May 21 14:07:41 GMT 2018
 */

package microwave;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import microwave.DisplayController;
import microwave.Microwave;
import microwave.ModeController;
import microwave.Preset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Microwave_ESTest extends Microwave_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController(1);
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Preset preset0 = new Preset("", 1308, 1308);
      linkedList0.addFirst(preset0);
      linkedList0.add(preset0);
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      // Undeclared exception!
      try { 
        microwave0.presetPressed(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // power level out of range
         //
         assertThrownBy("microwave.Microwave", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController(863);
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      microwave0.setTickRateInHz((-2608));
      assertEquals(-2608, microwave0.getTickRateInHz());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController((-593));
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      microwave0.clearPressed();
      assertTrue(modeController0.isClearPressed());
      assertTrue(microwave0.isDoorOpen());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController((-593));
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      microwave0.digitPressed((-593));
      assertFalse(microwave0.isCooking());
      assertTrue(microwave0.isDoorOpen());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController(0);
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) null);
      microwave0.getTickRateInHz();
      assertTrue(microwave0.isDoorOpen());
      assertFalse(microwave0.isCooking());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController(9);
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      microwave0.getTickRateInHz();
      assertTrue(microwave0.isDoorOpen());
      assertFalse(microwave0.isCooking());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController((-2102));
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) null);
      microwave0.setPowerLevel(10);
      int int0 = microwave0.getPowerLevel();
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController(863);
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      microwave0.digits();
      assertTrue(microwave0.isDoorOpen());
      assertFalse(microwave0.isCooking());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave((ModeController) null, (DisplayController) null, (List<Preset>) linkedList0);
      // Undeclared exception!
      try { 
        microwave0.tick();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("microwave.Microwave", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DisplayController displayController0 = new DisplayController(2944);
      Microwave microwave0 = new Microwave((ModeController) null, displayController0, (List<Preset>) null);
      // Undeclared exception!
      try { 
        microwave0.startPressed();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("microwave.Microwave", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController(2);
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) null);
      // Undeclared exception!
      try { 
        microwave0.presetPressed(2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("microwave.Microwave", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, (DisplayController) null, (List<Preset>) linkedList0);
      // Undeclared exception!
      try { 
        microwave0.getTickRateInHz();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("microwave.Microwave", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DisplayController displayController0 = new DisplayController(1);
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave((ModeController) null, displayController0, (List<Preset>) linkedList0);
      microwave0.setPowerLevel(1);
      assertEquals(1, microwave0.getPowerLevel());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController((-2627));
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) null);
      // Undeclared exception!
      try { 
        microwave0.setPowerLevel(3347);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // power level out of range
         //
         assertThrownBy("microwave.Microwave", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController(9);
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      displayController0.setTimeToCook(9);
      modeController0.setStartPressed(true);
      microwave0.setDoorOpen(false);
      microwave0.tick();
      assertTrue(modeController0.modeChanged());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController(1251);
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      microwave0.tick();
      assertFalse(microwave0.isCooking());
      assertTrue(microwave0.isDoorOpen());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController(1);
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Preset preset0 = new Preset("", 1308, 1308);
      linkedList0.addFirst(preset0);
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      // Undeclared exception!
      try { 
        microwave0.presetPressed(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // power level out of range
         //
         assertThrownBy("microwave.Microwave", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController((-7));
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      // Undeclared exception!
      try { 
        microwave0.setPowerLevel((-7));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // power level out of range
         //
         assertThrownBy("microwave.Microwave", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController(1251);
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      Preset preset0 = new Preset("microwave.ModeController$Mode", 1, 1);
      linkedList0.add(preset0);
      microwave0.presetPressed(1);
      microwave0.tick();
      assertEquals(1, microwave0.getPowerLevel());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController(1251);
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      // Undeclared exception!
      try { 
        microwave0.presetPressed(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Preset out of range for presetPressed.
         //
         assertThrownBy("microwave.Microwave", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController(0);
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      // Undeclared exception!
      try { 
        microwave0.presetPressed(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Preset out of range for presetPressed.
         //
         assertThrownBy("microwave.Microwave", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController((-2102));
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) null);
      boolean boolean0 = microwave0.isDoorOpen();
      assertFalse(microwave0.isCooking());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController((-1677));
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      microwave0.getTickRateInHz();
      assertTrue(microwave0.isDoorOpen());
      assertFalse(microwave0.isCooking());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController((-2102));
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) null);
      microwave0.startPressed();
      assertTrue(modeController0.isStartPressed());
      assertFalse(microwave0.isCooking());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, (DisplayController) null, (List<Preset>) linkedList0);
      // Undeclared exception!
      try { 
        microwave0.digitPressed(2487);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("microwave.Microwave", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController(0);
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      assertTrue(microwave0.isDoorOpen());
      
      microwave0.setDoorOpen(false);
      boolean boolean0 = microwave0.isDoorOpen();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController(1251);
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      microwave0.getMode();
      assertTrue(microwave0.isDoorOpen());
      assertFalse(microwave0.isCooking());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, (DisplayController) null, (List<Preset>) linkedList0);
      // Undeclared exception!
      try { 
        microwave0.digits();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("microwave.Microwave", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController(1251);
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      int int0 = microwave0.getPowerLevel();
      assertFalse(microwave0.isCooking());
      assertEquals(0, int0);
      assertTrue(microwave0.isDoorOpen());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      DisplayController displayController0 = new DisplayController(1251);
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, displayController0, (List<Preset>) linkedList0);
      boolean boolean0 = microwave0.isCooking();
      assertFalse(boolean0);
      assertTrue(microwave0.isDoorOpen());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, (DisplayController) null, (List<Preset>) linkedList0);
      // Undeclared exception!
      try { 
        microwave0.clearPressed();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("microwave.Microwave", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      LinkedList<Preset> linkedList0 = new LinkedList<Preset>();
      Microwave microwave0 = new Microwave(modeController0, (DisplayController) null, (List<Preset>) linkedList0);
      // Undeclared exception!
      try { 
        microwave0.setTickRateInHz(3854);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("microwave.Microwave", e);
      }
  }
}
