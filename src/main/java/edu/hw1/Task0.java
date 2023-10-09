package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task0 {
  private final static Logger LOGGER = LogManager.getLogger();

  private Task0() {}

  public static void hello() { LOGGER.info("Привет, мир!"); }
}
