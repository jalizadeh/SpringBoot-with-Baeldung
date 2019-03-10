package com.jalizadeh.basa.configuration;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

import com.jalizadeh.basa.configuration.model.Credentials;

@Configuration
@PropertySource("classpath:configprops.properties")
@ConfigurationProperties(prefix = "mail")
@Validated
public class ConfigProperties {

	//@NotBlank is deprecated
	@NotNull
	private String hostName;
	
	@Min(1025)
	@Max(65536)
	private int port;
	
	@Pattern(regexp = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$")
	private String from;

	private List<String> defaulRecipients;
	private Map<String, String> additionalHeader;
	private Credentials credentials;

	public List<String> getDefaulRecipients() {
		return defaulRecipients;
	}

	public void setDefaulRecipients(List<String> defaulRecipients) {
		this.defaulRecipients = defaulRecipients;
	}

	public Map<String, String> getAdditionalHeader() {
		return additionalHeader;
	}

	public void setAdditionalHeader(Map<String, String> additionalHeader) {
		this.additionalHeader = additionalHeader;
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}
}