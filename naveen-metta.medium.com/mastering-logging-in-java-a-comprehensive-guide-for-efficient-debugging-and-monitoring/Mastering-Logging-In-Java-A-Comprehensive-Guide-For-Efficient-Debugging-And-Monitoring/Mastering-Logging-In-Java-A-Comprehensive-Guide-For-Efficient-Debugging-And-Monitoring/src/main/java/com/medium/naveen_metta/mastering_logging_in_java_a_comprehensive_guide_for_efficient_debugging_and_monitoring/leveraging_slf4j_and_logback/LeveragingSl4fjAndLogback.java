package com.medium.naveen_metta.mastering_logging_in_java_a_comprehensive_guide_for_efficient_debugging_and_monitoring.leveraging_slf4j_and_logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeveragingSl4fjAndLogback {
  private static final Logger logger =
    LoggerFactory.getLogger(LeveragingSl4fjAndLogback.class);
  public static void main(String... args) {
      logger.debug("DEBUG");
      logger.info("INFO");
      logger.warn("WARN");
      logger.error("ERROR");
      logger.trace("TRACE");
    return;
  }
}
