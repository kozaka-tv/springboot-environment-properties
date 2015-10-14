package xyz.deepzeafish;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class MyConfig {
	private String name;
	private String env;
	private String randomBytes;
	private int randomInt;
	private long randomLong;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	public String getRandomBytes() {
		return randomBytes;
	}

	public void setRandomBytes(String randomBytes) {
		this.randomBytes = randomBytes;
	}

	public int getRandomInt() {
		return randomInt;
	}

	public void setRandomInt(int randomInt) {
		this.randomInt = randomInt;
	}

	public long getRandomLong() {
		return randomLong;
	}

	public void setRandomLong(long randomLong) {
		this.randomLong = randomLong;
	}

}
