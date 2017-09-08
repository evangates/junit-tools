/*
 * ------------------------------------------------------------------
 *             (C) Copyright 2013, EVAN GATES
 *                     ALL RIGHTS RESERVED
 *             THIS NOTICE DOES NOT IMPLY PUBLICATION
 * ------------------------------------------------------------------
 */

package net.thoughtmerge.test.junit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author evan.gates
 */
public class TestNameLogger extends TestNameOutputter {

  private final Logger logger;

  public TestNameLogger() {
    this(LoggerFactory.getLogger(TestNameLogger.class));
  }

  public TestNameLogger(Logger logger) {
    this.logger = logger;
  }

  @Override
  protected void output(String message) {
    logger.debug(message);
  }
}
