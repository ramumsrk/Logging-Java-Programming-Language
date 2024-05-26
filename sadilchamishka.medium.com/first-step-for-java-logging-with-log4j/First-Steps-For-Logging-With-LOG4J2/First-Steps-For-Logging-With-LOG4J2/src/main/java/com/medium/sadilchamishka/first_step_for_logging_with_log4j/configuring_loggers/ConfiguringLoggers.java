package com.medium.sadilchamishka.first_step_for_logging_with_log4j.configuring_loggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConfiguringLoggers {
  private static final Logger logger =
    LogManager.getLogger(ConfiguringLoggers.class);
  public static void main(String... args) {
      logger.fatal("FATAL");
      logger.error("ERROR");
      logger.warn("WARNING");
      logger.info("INFO");
      logger.debug("DEBUG");
    return;
  }
}
