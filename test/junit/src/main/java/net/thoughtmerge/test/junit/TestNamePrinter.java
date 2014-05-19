/*
 * ------------------------------------------------------------------
 *             (C) Copyright 2013, EVAN GATES
 *                     ALL RIGHTS RESERVED
 *             THIS NOTICE DOES NOT IMPLY PUBLICATION
 * ------------------------------------------------------------------
 */

package net.thoughtmerge.test.junit;

import java.util.Arrays;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 *
 * @author evan.gates
 */
public class TestNamePrinter extends TestWatcher {

  @Override
  protected void finished(Description description) {
    super.finished(description);

    final String label = description.getMethodName();

    System.out.println(String.format("FINISHED: %s", label));
    System.out.println(hyphens(String.format("FINISHED: %s", label).length()));
  }

  @Override
  protected void starting(Description description) {
    final String label = description.getMethodName();

    System.out.println(hyphens(String.format("STARTING: %s", label).length()));
    System.out.println(String.format("STARTING: %s", label));

    super.starting(description);
  }

  private String hyphens(int count) {
    char[] characters = new char[count];
    Arrays.fill(characters, '-');

    return String.valueOf(characters);
  }
}
