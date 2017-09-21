package models;

public class Event {
	
	private String deviceName;
	private String deviceLabel;
	private long time;
	private String type;
	private String id;
	private String deviceId;
	private String deviceTypeId;
	private String deviceNetworkId;
	private String value;
	private String hubName;
	private String locationId;
	private String eventName;
	private String desc;
	
	public Event(String deviceName, String deviceLabel, long time, String type, String id, String deviceId, 
				 String deviceTypeId, String deviceNetworkId, String value, String hubName, String locationId, 
				 String eventName, String desc) {
		
		this.deviceName = deviceName;
		this.deviceLabel = deviceLabel;
		this.time = time;
		this.type = type;
		this.id = id;
		this.deviceId = deviceId;
		this.deviceTypeId = deviceTypeId;
		this.deviceNetworkId = deviceNetworkId;
		this.value = value;
		this.hubName = hubName;
		this.locationId = locationId;
		this.eventName = eventName;
		this.desc = desc;
		
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceLabel() {
		return deviceLabel;
	}

	public void setDeviceLabel(String deviceLabel) {
		this.deviceLabel = deviceLabel;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceTypeId() {
		return deviceTypeId;
	}

	public void setDeviceTypeId(String deviceTypeId) {
		this.deviceTypeId = deviceTypeId;
	}

	public String getDeviceNetworkId() {
		return deviceNetworkId;
	}

	public void setDeviceNetworkId(String deviceNetworkId) {
		this.deviceNetworkId = deviceNetworkId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getHubName() {
		return hubName;
	}

	public void setHubName(String hubName) {
		this.hubName = hubName;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
