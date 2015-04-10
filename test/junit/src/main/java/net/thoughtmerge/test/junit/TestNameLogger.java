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

  private static final Logger logger = LoggerFactory.getLogger(TestNameLogger.class);

  @Override
  protected void output(String message) {
    logger.debug(message);
  }
}
