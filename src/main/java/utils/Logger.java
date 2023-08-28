package utils;

import org.apache.logging.log4j.LogManager;

public class Logger {

    private static final ThreadLocal<org.apache.logging.log4j.Logger> LOGGER = ThreadLocal.withInitial(() -> LogManager.getLogger(Logger.class));

    private Logger() { }

    public static void info(String message) {
        LOGGER.get().info(message);
    }

    public static void info(String message, Throwable error) {
        LOGGER.get().info(message, error);
    }

    public static void info(Object message) {
        LOGGER.get().info(message);
    }

    public static void info(String message, Object... object) {
        LOGGER.get().info(message, object);
    }

    public static void debug(String message) {
        LOGGER.get().debug(message);
    }

    public static void debug(Object message) {
        LOGGER.get().debug(message);
    }

    public static void debug(String message, Throwable error) {
        LOGGER.get().debug(message, error);
    }

    public static void debug(String message, Object... object) {
        LOGGER.get().debug(message, object);
    }

    public static void warn(String message) {
        LOGGER.get().warn(message);
    }

    public static void warn(String message, Throwable error) {
        LOGGER.get().warn(message, error);
    }

    public static void warn(Object message) {
        LOGGER.get().warn(message);
    }

    public static void warn(String message, Object... object) {
        LOGGER.get().warn(message, object);
    }

    public static void fatal(String message) {
        LOGGER.get().fatal(message);
    }

    public static void fatal(String message, Throwable error) {
        LOGGER.get().fatal(message, error);
    }

    public static void fatal(Object message) {
        LOGGER.get().fatal(message);
    }

    public static void fatal(String message, Object... object) {
        LOGGER.get().fatal(message, object);
    }

    public static void error(String message) {
        LOGGER.get().error(message);
    }

    public static void error(String message, Throwable error) {
        LOGGER.get().error(message, error);
    }

    public static void error(Object message) {
        LOGGER.get().error(message);
    }

    public static void error(String message, Object... object) {
        LOGGER.get().error(message, object);
    }

    public static void trace(String message) {
        LOGGER.get().trace(message);
    }

    public static void trace(String message, Throwable error) {
        LOGGER.get().trace(message, error);
    }

    public static void trace(Object message) {
        LOGGER.get().trace(message);
    }

    public static void trace(String message, Object... object) {
        LOGGER.get().trace(message, object);
    }
}
