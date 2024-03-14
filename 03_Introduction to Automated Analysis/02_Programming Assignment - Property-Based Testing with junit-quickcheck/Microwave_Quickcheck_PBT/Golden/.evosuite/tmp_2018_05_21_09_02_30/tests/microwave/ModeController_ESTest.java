/*
 * This file was automatically generated by EvoSuite
 * Mon May 21 14:06:24 GMT 2018
 */

package microwave;

import org.junit.Test;
import static org.junit.Assert.*;
import microwave.ModeController;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ModeController_ESTest extends ModeController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      assertFalse(modeController0.isStartPressed());
      
      modeController0.setStartPressed(true);
      boolean boolean0 = modeController0.isStartPressed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      assertFalse(modeController0.isClearPressed());
      
      modeController0.setClearPressed(true);
      boolean boolean0 = modeController0.isClearPressed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      modeController0.setStartPressed(true);
      modeController0.tick(false, true);
      modeController0.getMode();
      assertTrue(modeController0.modeChanged());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      boolean boolean0 = modeController0.inCooking();
      assertFalse(modeController0.isClearPressed());
      assertFalse(boolean0);
      assertFalse(modeController0.isStartPressed());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      modeController0.setStartPressed(true);
      modeController0.tick(false, true);
      boolean boolean0 = modeController0.inCooking();
      assertTrue(modeController0.modeChanged());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      modeController0.setStartPressed(true);
      modeController0.tick(false, true);
      boolean boolean0 = modeController0.modeChanged();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      boolean boolean0 = modeController0.modeChanged();
      assertFalse(modeController0.isClearPressed());
      assertFalse(modeController0.isStartPressed());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      modeController0.setStartPressed(true);
      assertTrue(modeController0.isStartPressed());
      
      modeController0.tick(true, true);
      assertFalse(modeController0.modeChanged());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      modeController0.setStartPressed(true);
      modeController0.tick(false, true);
      modeController0.setClearPressed(true);
      modeController0.tick(false, true);
      assertTrue(modeController0.modeChanged());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      modeController0.setClearPressed(true);
      assertTrue(modeController0.isClearPressed());
      
      modeController0.tick(false, true);
      assertFalse(modeController0.modeChanged());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      modeController0.setStartPressed(true);
      modeController0.tick(false, true);
      modeController0.tick(true, true);
      modeController0.setClearPressed(true);
      assertTrue(modeController0.isClearPressed());
      
      modeController0.tick(false, true);
      assertFalse(modeController0.modeChanged());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      ModeController.Mode modeController_Mode0 = modeController0.tick(true, true);
      assertFalse(modeController0.isStartPressed());
      assertFalse(modeController0.isClearPressed());
      assertEquals(2, modeController_Mode0.ordinal());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      modeController0.tick(false, false);
      assertFalse(modeController0.isClearPressed());
      assertFalse(modeController0.isStartPressed());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      modeController0.getMode();
      assertFalse(modeController0.isClearPressed());
      assertFalse(modeController0.isStartPressed());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      boolean boolean0 = modeController0.isStartPressed();
      assertFalse(modeController0.isClearPressed());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ModeController modeController0 = new ModeController();
      boolean boolean0 = modeController0.isClearPressed();
      assertFalse(boolean0);
      assertFalse(modeController0.isStartPressed());
  }
}
