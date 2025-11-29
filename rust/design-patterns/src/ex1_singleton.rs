/// Exercise: Singleton Pattern (Creational)
///
/// Implement a Singleton pattern in Rust using lazy initialization.
/// Due to Rust's ownership model, we'll use a simpler pattern with
/// static mutable state (using Once for thread-safety).
///
/// Requirements:
/// 1. Create a Config struct that holds configuration data
/// 2. Ensure only one instance can exist
/// 3. Provide thread-safe access to the instance
/// 4. Use std::sync::Once for one-time initialization
///
/// Example:
/// ```
/// let config1 = Config::get_instance();
/// let config2 = Config::get_instance();
/// // Both should reference the same data
/// ```
///
/// Use Cases: Global configuration, database connections, loggers
///
/// Time Complexity: O(1) for instance retrieval
/// Space Complexity: O(1)

use std::sync::Once;

static INIT: Once = Once::new();
static mut CONFIG: Option<Config> = None;

#[derive(Debug, Clone)]
pub struct Config {
    pub app_name: String,
    pub version: String,
}

impl Config {
    /// Creates a new Config instance (private).
    fn new() -> Self {
        Config {
            app_name: String::from("MyApp"),
            version: String::from("1.0.0"),
        }
    }

    /// Returns a reference to the singleton instance.
    /// Uses Once to ensure thread-safe initialization.
    ///
    /// TODO: Implement singleton pattern using Once
    /// Hint: Use INIT.call_once() to initialize CONFIG
    /// Hint: Return a reference to the unsafe static CONFIG
    pub fn get_instance() -> &'static Config {
        unimplemented!("Not implemented yet")
    }
}

/// A simpler singleton using lazy_static pattern (for reference).
/// For this exercise, you can implement a Logger using a similar approach.
pub struct Logger {
    name: String,
}

impl Logger {
    fn new() -> Self {
        Logger {
            name: String::from("GlobalLogger"),
        }
    }

    /// TODO: Implement get_instance() similar to Config
    pub fn get_instance() -> &'static Logger {
        unimplemented!("Not implemented yet")
    }

    pub fn log(&self, message: &str) {
        println!("[{}] {}", self.name, message);
    }
}

static LOGGER_INIT: Once = Once::new();
static mut LOGGER: Option<Logger> = None;

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_config_singleton() {
        let config1 = Config::get_instance();
        let config2 = Config::get_instance();

        // Both should point to the same memory location
        assert_eq!(
            config1 as *const Config,
            config2 as *const Config,
            "Should return the same instance"
        );
    }

    #[test]
    fn test_config_values() {
        let config = Config::get_instance();
        assert_eq!(config.app_name, "MyApp");
        assert_eq!(config.version, "1.0.0");
    }

    #[test]
    fn test_logger_singleton() {
        let logger1 = Logger::get_instance();
        let logger2 = Logger::get_instance();

        assert_eq!(
            logger1 as *const Logger,
            logger2 as *const Logger,
            "Should return the same Logger instance"
        );
    }

    #[test]
    fn test_logger_functionality() {
        let logger = Logger::get_instance();
        logger.log("Test message");
        // If it doesn't panic, the test passes
    }

    #[test]
    fn test_thread_safety() {
        use std::thread;

        let handles: Vec<_> = (0..10)
            .map(|_| {
                thread::spawn(|| {
                    let config = Config::get_instance();
                    config.app_name.clone()
                })
            })
            .collect();

        let results: Vec<_> = handles.into_iter().map(|h| h.join().unwrap()).collect();

        // All threads should see the same app_name
        assert!(results.iter().all(|name| name == "MyApp"));
    }
}
