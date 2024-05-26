package com.medium.naveen_metta.mastering_logging_in_java_a_comprehensive_guide_for_efficient_debugging_and_monitoring.introducing_log4j;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IntroducingLog4J {
  private static final Logger logger =
    LogManager.getLogger(IntroducingLog4J.class);
  public static void main(String[] args) {
      logger.log(
        Level.ERROR,
        "ERROR"
      );
    return;
  }
}
