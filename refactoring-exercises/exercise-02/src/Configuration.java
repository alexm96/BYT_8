import java.util.*;

public class Configuration {
	public int interval;

	public int duration;

	public int departure;

	public void load(Properties props) throws ConfigurationException {
		String valueString;
		int value;

		valueString = props.getProperty("interval");
		value = getValue(valueString, "monitor interval", "monitor interval > 0");
		interval = value;

		valueString = props.getProperty("duration");
		value = getValueMultiInput(valueString, "duration", "duration > 0", "duration % interval");
		duration = value;

		valueString = props.getProperty("departure");
		value = getValueMultiInput(valueString, "departure offset", "departure > 0", "departure % interval");
		departure = value;
	}

	private int getValueMultiInput(String valueString, String duration, String s, String s2) throws ConfigurationException {
		int value;
		if (valueString == null) {
			throw new ConfigurationException(duration);
		}
		value = Integer.parseInt(valueString);
		if (value <= 0) {
			throw new ConfigurationException(s);
		}
		if ((value % interval) != 0) {
			throw new ConfigurationException(s2);
		}
		return value;
	}

	private int getValue(String valueString, String s, String s2) throws ConfigurationException {
		int value;
		if (valueString == null) {
			throw new ConfigurationException(s);
		}
		value = Integer.parseInt(valueString);
		if (value <= 0) {
			throw new ConfigurationException(s2);
		}
		return value;
	}
}
/*
Duplicated code, extract method
 */