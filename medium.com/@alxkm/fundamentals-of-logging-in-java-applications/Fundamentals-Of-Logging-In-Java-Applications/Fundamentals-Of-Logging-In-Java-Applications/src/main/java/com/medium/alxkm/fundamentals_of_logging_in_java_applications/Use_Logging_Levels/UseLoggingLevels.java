package com.medium.alxkm.fundamentals_of_logging_in_java_applications.Use_Logging_Levels;

import org.apache.logging.log4j.Level;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class UseLoggingLevels {
  private static final Logger logger =
    LogManager.getLogger(UseLoggingLevels.class);
  public static void main(String[] args) {
      logger.log(
        Level.ALL,
        "ALL"
      );
      logger.log(
        Level.DEBUG,
        "DEBUG"
      );
      logger.log(
        Level.INFO,
        "INFO"
      );
      logger.log(
        Level.ERROR,
        "ERROR"
      );
      logger.log(
        Level.TRACE,
        "TRACE"
      );
      logger.log(
        Level.FATAL,
        "FATAL"
      );
      logger.log(
        Level.ALL,
        "ALL"
      );
    return;
  }
}
