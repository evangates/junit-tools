/*
 * ------------------------------------------------------------------
 *             (C) Copyright 2013, EVAN GATES
 *                     ALL RIGHTS RESERVED
 *             THIS NOTICE DOES NOT IMPLY PUBLICATION
 * ------------------------------------------------------------------
 */

package net.thoughtmerge.test.junit;

/**
 *
 * @author evan.gates
 */
public class TestNamePrinter extends TestNameOutputter {

  @Override
  protected void output(String message) {
    System.out.println(message);
  }
}
