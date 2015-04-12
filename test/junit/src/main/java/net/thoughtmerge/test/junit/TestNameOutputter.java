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
  protected void finished(Description description) {
    super.finished(description);

    final String label = description.getMethodName();
    final String message = finishedMessage(label);

    output(message);
    output(hyphens(message.length()));
  }

  @Override
  protected void starting(Description description) {
    final String label = description.getMethodName();
    final String message = startingMessage(label);

    output(hyphens(message.length()));
    output(message);

    super.starting(description);
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
    return String.format("FINISHED: %s%n", label);
  }
}
