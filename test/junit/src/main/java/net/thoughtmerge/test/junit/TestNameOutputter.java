/*
 * ------------------------------------------------------------------
 *              (C) Copyright 2015, EVAN GATES
 *                      ALL RIGHTS RESERVED
 *              THIS NOTICE DOES NOT IMPLY PUBLICATION
 *  ------------------------------------------------------------------
 */
package net.thoughtmerge.test.junit;

import java.util.Arrays;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 *
 * @author evangates
 */
public abstract class TestNameOutputter extends TestWatcher {

  @Override
  protected void starting(Description description) {
    final String label = description.getMethodName();
    final String message = startingMessage(label);
    final String hyphens = hyphens(message.length());

    output(hyphens);
    output(message);
    output(hyphens);

    super.starting(description);
  }

  @Override
  protected void finished(Description description) {
    super.finished(description);

    final String label = description.getMethodName();
    final String message = finishedMessage(label);
    final String hyphens = hyphens(message.length());

    output(hyphens);
    output(message);
    output(String.format("%s%n", hyphens));
  }

  protected abstract void output(String message);

  private String hyphens(int count) {
    char[] characters = new char[count];
    Arrays.fill(characters, '-');
    return String.valueOf(characters);
  }

  private String startingMessage(String label) {
    return String.format("STARTING: %s", label);
  }

  private String finishedMessage(String label) {
    return String.format("FINISHED: %s", label);
  }
}
