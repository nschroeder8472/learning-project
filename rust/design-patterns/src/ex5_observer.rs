/// Exercise: Observer Pattern (Behavioral)
///
/// Implement the Observer pattern where multiple display devices observe
/// a weather station and get notified when weather data changes.
///
/// Requirements:
/// 1. Create Observer trait with update() method
/// 2. Create Subject trait with attach(), detach(), and notify_observers() methods
/// 3. Implement WeatherStation as concrete Subject
/// 4. Implement display structs as concrete Observers
/// 5. When weather data changes, all observers should be notified
///
/// Note: In Rust, we use trait objects (Box<dyn Observer>) to store observers.
///
/// Example:
/// ```
/// let mut station = WeatherStation::new();
/// let phone = Box::new(PhoneDisplay::new());
/// station.attach(phone);
/// station.set_weather_data(25.5, 65.0);
/// ```
///
/// Use Cases: Event handling, pub-sub systems
///
/// Time Complexity: O(n) for notifying n observers
/// Space Complexity: O(n) for storing n observers

pub trait Observer {
    fn update(&mut self, temperature: f32, humidity: f32);
}

pub trait Subject {
    fn attach(&mut self, observer: Box<dyn Observer>);
    fn detach(&mut self, index: usize);
    fn notify_observers(&mut self);
}

/// WeatherStation - concrete subject.
pub struct WeatherStation {
    observers: Vec<Box<dyn Observer>>,
    temperature: f32,
    humidity: f32,
}

impl WeatherStation {
    pub fn new() -> Self {
        WeatherStation {
            observers: Vec::new(),
            temperature: 0.0,
            humidity: 0.0,
        }
    }

    /// TODO: Implement set_weather_data
    /// Update temperature and humidity, then notify all observers
    pub fn set_weather_data(&mut self, temperature: f32, humidity: f32) {
        unimplemented!("Not implemented yet")
    }

    pub fn get_observer_count(&self) -> usize {
        self.observers.len()
    }
}

impl Subject for WeatherStation {
    /// TODO: Add observer to the list
    fn attach(&mut self, observer: Box<dyn Observer>) {
        unimplemented!("Not implemented yet")
    }

    /// TODO: Remove observer at given index
    fn detach(&mut self, index: usize) {
        unimplemented!("Not implemented yet")
    }

    /// TODO: Call update() on all observers
    fn notify_observers(&mut self) {
        unimplemented!("Not implemented yet")
    }
}

/// PhoneDisplay - concrete observer.
pub struct PhoneDisplay {
    temperature: f32,
    humidity: f32,
    update_count: u32,
}

impl PhoneDisplay {
    pub fn new() -> Self {
        PhoneDisplay {
            temperature: 0.0,
            humidity: 0.0,
            update_count: 0,
        }
    }

    pub fn display(&self) -> String {
        format!(
            "Phone Display: {:.1}°C, {:.1}% humidity",
            self.temperature, self.humidity
        )
    }

    pub fn get_update_count(&self) -> u32 {
        self.update_count
    }

    pub fn get_temperature(&self) -> f32 {
        self.temperature
    }
}

impl Observer for PhoneDisplay {
    /// TODO: Store temperature and humidity, increment update_count
    fn update(&mut self, temperature: f32, humidity: f32) {
        unimplemented!("Not implemented yet")
    }
}

/// TVDisplay - concrete observer.
pub struct TVDisplay {
    temperature: f32,
    humidity: f32,
    update_count: u32,
}

impl TVDisplay {
    pub fn new() -> Self {
        TVDisplay {
            temperature: 0.0,
            humidity: 0.0,
            update_count: 0,
        }
    }

    pub fn display(&self) -> String {
        format!(
            "TV Display: Temperature {:.1}°C | Humidity {:.1}%",
            self.temperature, self.humidity
        )
    }

    pub fn get_update_count(&self) -> u32 {
        self.update_count
    }
}

impl Observer for TVDisplay {
    /// TODO: Store temperature and humidity, increment update_count
    fn update(&mut self, temperature: f32, humidity: f32) {
        unimplemented!("Not implemented yet")
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_attach_observer() {
        let mut station = WeatherStation::new();
        station.attach(Box::new(PhoneDisplay::new()));
        assert_eq!(station.get_observer_count(), 1);
    }

    #[test]
    fn test_attach_multiple_observers() {
        let mut station = WeatherStation::new();
        station.attach(Box::new(PhoneDisplay::new()));
        station.attach(Box::new(TVDisplay::new()));
        assert_eq!(station.get_observer_count(), 2);
    }

    #[test]
    fn test_detach_observer() {
        let mut station = WeatherStation::new();
        station.attach(Box::new(PhoneDisplay::new()));
        station.attach(Box::new(TVDisplay::new()));
        station.detach(0);
        assert_eq!(station.get_observer_count(), 1);
    }

    #[test]
    fn test_notify_observers() {
        let mut station = WeatherStation::new();
        let phone = Box::new(PhoneDisplay::new());
        station.attach(phone);
        station.set_weather_data(25.5, 65.0);

        // We can't easily test the phone's state after attaching
        // (it's moved into the Vec), but we can verify no panic occurs
        assert_eq!(station.get_observer_count(), 1);
    }

    #[test]
    fn test_display_format() {
        let mut phone = PhoneDisplay::new();
        phone.update(25.0, 65.0);
        assert!(phone.display().contains("25.0"));
        assert!(phone.display().contains("65.0"));
    }

    #[test]
    fn test_update_count() {
        let mut phone = PhoneDisplay::new();
        assert_eq!(phone.get_update_count(), 0);
        phone.update(20.0, 60.0);
        assert_eq!(phone.get_update_count(), 1);
        phone.update(25.0, 65.0);
        assert_eq!(phone.get_update_count(), 2);
    }
}
