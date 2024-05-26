package com.medium.naveen_metta.mastering_logging_in_java_a_comprehensive_guide_for_efficient_debugging_and_monitoring.builtin_logging_in_java;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BuiltInLoggingInJava {
  private static final Logger logger =
    Logger.getLogger(BuiltInLoggingInJava.class.getName());
  static public void main( String... args ) {
      logger.log(
        Level.INFO,
        "INFO"
      );
      logger.log(
        Level.WARNING,
        "WARNING"
      );
      logger.log(
        Level.SEVERE,
        "SEVERE"
      );
      logger.log(
        Level.FINER,
        "FINER"
      );
    return;
  }
}