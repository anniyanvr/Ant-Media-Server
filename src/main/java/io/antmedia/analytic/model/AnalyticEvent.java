package io.antmedia.analytic.model;

public class AnalyticEvent {
	
	public static final String LOG_SOURCE_SERVER = "server";
	public static final String LOG_SOURCE_CLIENT = "client";
	
	private String event;
	/**
	 * Unix TimeStamp Ms
	 */
	private long timeMs;
	private String app;
	private String streamId;
	private String logSource;
		
	/**
	 * Make it public because it's constructed in REST
	 */
	@SuppressWarnings("java:S5993")
	public AnalyticEvent() {
		setTimeMs(System.currentTimeMillis());
	}
		
	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public long getTimeMs() {
		return timeMs;
	}

	public void setTimeMs(long timeMs) {
		this.timeMs = timeMs;
	}

	public String getStreamId() {
		return streamId;
	}

	public void setStreamId(String streamId) {
		this.streamId = streamId;
	}

	public String getLogSource() {
		return logSource;
	}

	public void setLogSource(String logSource) {
		this.logSource = logSource;
	}
}
