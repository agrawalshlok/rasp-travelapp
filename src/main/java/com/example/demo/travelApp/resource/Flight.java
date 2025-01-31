/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package com.example.demo.travelApp.resource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import platform.exception.ExceptionEnum;
 import platform.resource.BaseResource;
import platform.util.*;
import platform.db.*;
import java.util.*;
import com.example.demo.travelApp.message.*;
import com.example.demo.travelApp.helper.*;
import com.example.demo.travelApp.service.*;

/*
 ********** This is a generated class Don't modify it.Extend this file for additional functionality **********
 * 
 */
public class Flight extends BaseResource {
	private String id = null;
	private String g_created_by_id = null;
	private String g_created_by_name = null;
	private String g_modified_by_id = null;
	private String g_modified_by_name = null;
	private Long g_creation_time = null;
	private Long g_modify_time = null;
	private String g_soft_delete = null;
	private String g_status = null;
	private String archived = null;
	private Long archived_time = null;
	private String airline_id = null;
	private String airline_name = null;
	private String destination_location_id = null;
	private String departure_location_id = null;
	private Long departure_date_and_time = null;
	private Long arrival_date_and_time = null;
	private String status = null;
	private Long price = null;
	private Long capacity = null;
	private Map<String, Object> extra_data = null;

	public static String FIELD_ID = "id";
	public static String FIELD_G_CREATED_BY_ID = "g_created_by_id";
	public static String FIELD_G_CREATED_BY_NAME = "g_created_by_name";
	public static String FIELD_G_MODIFIED_BY_ID = "g_modified_by_id";
	public static String FIELD_G_MODIFIED_BY_NAME = "g_modified_by_name";
	public static String FIELD_G_CREATION_TIME = "g_creation_time";
	public static String FIELD_G_MODIFY_TIME = "g_modify_time";
	public static String FIELD_G_SOFT_DELETE = "g_soft_delete";
	public static String FIELD_G_STATUS = "g_status";
	public static String FIELD_ARCHIVED = "archived";
	public static String FIELD_ARCHIVED_TIME = "archived_time";
	public static String FIELD_AIRLINE_ID = "airline_id";
	public static String FIELD_AIRLINE_NAME = "airline_name";
	public static String FIELD_DESTINATION_LOCATION_ID = "destination_location_id";
	public static String FIELD_DEPARTURE_LOCATION_ID = "departure_location_id";
	public static String FIELD_DEPARTURE_DATE_AND_TIME = "departure_date_and_time";
	public static String FIELD_ARRIVAL_DATE_AND_TIME = "arrival_date_and_time";
	public static String FIELD_STATUS = "status";
	public static String FIELD_PRICE = "price";
	public static String FIELD_CAPACITY = "capacity";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	public final static ResourceMetaData metaData = new ResourceMetaData("flight");

	static {
		metaData.setCheckBeforeAdd(false);
		metaData.setCheckBeforeUpdate(false);

		metaData.setAllow_duplicate_name(false);
		Field idField = new Field("id", "String");
		idField.setIndexed(true);
		idField.setRequired(true);
		idField.setLength(40);
		metaData.addField(idField);

		Field g_created_by_idField = new Field("g_created_by_id", "String");
		g_created_by_idField.setLength(128);
		metaData.addField(g_created_by_idField);

		Field g_created_by_nameField = new Field("g_created_by_name", "String");
		g_created_by_nameField.setLength(128);
		metaData.addField(g_created_by_nameField);

		Field g_modified_by_idField = new Field("g_modified_by_id", "String");
		g_modified_by_idField.setLength(128);
		metaData.addField(g_modified_by_idField);

		Field g_modified_by_nameField = new Field("g_modified_by_name", "String");
		g_modified_by_nameField.setLength(128);
		metaData.addField(g_modified_by_nameField);

		Field g_creation_timeField = new Field("g_creation_time", "long");
		metaData.addField(g_creation_timeField);

		Field g_modify_timeField = new Field("g_modify_time", "long");
		metaData.addField(g_modify_timeField);

		Field g_soft_deleteField = new Field("g_soft_delete", "String");
		g_soft_deleteField.setDefaultValue("N");
		g_soft_deleteField.setLength(1);
		metaData.addField(g_soft_deleteField);

		Field g_statusField = new Field("g_status", "String");
		g_statusField.setIndexed(true);
		g_statusField.setLength(32);
		metaData.addField(g_statusField);

		Field archivedField = new Field("archived", "String");
		archivedField.setIndexed(true);
		archivedField.setDefaultValue("N");
		archivedField.setLength(1);
		metaData.addField(archivedField);

		Field archived_timeField = new Field("archived_time", "long");
		metaData.addField(archived_timeField);

		Field airline_idField = new Field("airline_id", "String");
		airline_idField.setForeign(new Foreign("airline"));
		airline_idField.setLength(128);
		metaData.addField(airline_idField);

		Field airline_nameField = new Field("airline_name", "String");
		airline_nameField.setForeignDerived(new ForeignDerived("airline_id","airline_name"));
		airline_nameField.setLength(128);
		metaData.addField(airline_nameField);

		Field destination_location_idField = new Field("destination_location_id", "String");
		destination_location_idField.setForeign(new Foreign("location"));
		destination_location_idField.setLength(128);
		metaData.addField(destination_location_idField);

		Field departure_location_idField = new Field("departure_location_id", "String");
		departure_location_idField.setForeign(new Foreign("location"));
		departure_location_idField.setLength(128);
		metaData.addField(departure_location_idField);

		Field departure_date_and_timeField = new Field("departure_date_and_time", "timestamp");
		departure_date_and_timeField.setLength(128);
		metaData.addField(departure_date_and_timeField);

		Field arrival_date_and_timeField = new Field("arrival_date_and_time", "timestamp");
		arrival_date_and_timeField.setLength(128);
		metaData.addField(arrival_date_and_timeField);

		Field statusField = new Field("status", "String");
		statusField.setLength(128);
		metaData.addField(statusField);

		Field priceField = new Field("price", "long");
		metaData.addField(priceField);

		Field capacityField = new Field("capacity", "long");
		metaData.addField(capacityField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("flight");

		metaData.setCluster("DB_PROFILE");
	}

	public Flight() {this.setId(Util.getUniqueId());}
	public Flight(String id) {this.setId(id);}

	public Flight(Flight obj) {
		this.id = obj.id;
		this.g_created_by_id = obj.g_created_by_id;
		this.g_created_by_name = obj.g_created_by_name;
		this.g_modified_by_id = obj.g_modified_by_id;
		this.g_modified_by_name = obj.g_modified_by_name;
		this.g_creation_time = obj.g_creation_time;
		this.g_modify_time = obj.g_modify_time;
		this.g_soft_delete = obj.g_soft_delete;
		this.g_status = obj.g_status;
		this.archived = obj.archived;
		this.archived_time = obj.archived_time;
		this.airline_id = obj.airline_id;
		this.airline_name = obj.airline_name;
		this.destination_location_id = obj.destination_location_id;
		this.departure_location_id = obj.departure_location_id;
		this.departure_date_and_time = obj.departure_date_and_time;
		this.arrival_date_and_time = obj.arrival_date_and_time;
		this.status = obj.status;
		this.price = obj.price;
		this.capacity = obj.capacity;
		this.extra_data = obj.extra_data;
	}

	public ResourceMetaData getMetaData() {
		return metaData;
	}

	private void setDefaultValues() {
		if(g_soft_delete == null)
			g_soft_delete = "N";
		if(archived == null)
			archived = "N";
	}

	public Map<String, Object> convertResourceToMap(HashMap<String, Object> map) {
		if(id != null)
			map.put("id", id);
		if(g_created_by_id != null)
			map.put("g_created_by_id", g_created_by_id);
		if(g_created_by_name != null)
			map.put("g_created_by_name", g_created_by_name);
		if(g_modified_by_id != null)
			map.put("g_modified_by_id", g_modified_by_id);
		if(g_modified_by_name != null)
			map.put("g_modified_by_name", g_modified_by_name);
		if(g_creation_time != null)
			map.put("g_creation_time", g_creation_time);
		if(g_modify_time != null)
			map.put("g_modify_time", g_modify_time);
		if(g_soft_delete != null)
			map.put("g_soft_delete", g_soft_delete);
		if(g_status != null)
			map.put("g_status", g_status);
		if(archived != null)
			map.put("archived", archived);
		if(archived_time != null)
			map.put("archived_time", archived_time);
		if(airline_id != null)
			map.put("airline_id", airline_id);
		if(airline_name != null)
			map.put("airline_name", airline_name);
		if(destination_location_id != null)
			map.put("destination_location_id", destination_location_id);
		if(departure_location_id != null)
			map.put("departure_location_id", departure_location_id);
		if(departure_date_and_time != null)
			map.put("departure_date_and_time", departure_date_and_time);
		if(arrival_date_and_time != null)
			map.put("arrival_date_and_time", arrival_date_and_time);
		if(status != null)
			map.put("status", status);
		if(price != null)
			map.put("price", price);
		if(capacity != null)
			map.put("capacity", capacity);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> validateAndConvertResourceToMap(HashMap<String,Object> map,boolean add) throws ApplicationException {
		if(validateId(add))
			map.put("id", id);
		if(g_created_by_id != null)
			map.put("g_created_by_id", g_created_by_id);
		if(g_created_by_name != null)
			map.put("g_created_by_name", g_created_by_name);
		if(g_modified_by_id != null)
			map.put("g_modified_by_id", g_modified_by_id);
		if(g_modified_by_name != null)
			map.put("g_modified_by_name", g_modified_by_name);
		if(g_creation_time != null)
			map.put("g_creation_time", g_creation_time);
		if(g_modify_time != null)
			map.put("g_modify_time", g_modify_time);
		if(g_soft_delete != null)
			map.put("g_soft_delete", g_soft_delete);
		if(g_status != null)
			map.put("g_status", g_status);
		if(archived != null)
			map.put("archived", archived);
		if(archived_time != null)
			map.put("archived_time", archived_time);
		if(airline_id != null)
			map.put("airline_id", airline_id);
		if(airline_name != null)
			map.put("airline_name", airline_name);
		if(destination_location_id != null)
			map.put("destination_location_id", destination_location_id);
		if(departure_location_id != null)
			map.put("departure_location_id", departure_location_id);
		if(departure_date_and_time != null)
			map.put("departure_date_and_time", departure_date_and_time);
		if(arrival_date_and_time != null)
			map.put("arrival_date_and_time", arrival_date_and_time);
		if(status != null)
			map.put("status", status);
		if(price != null)
			map.put("price", price);
		if(capacity != null)
			map.put("capacity", capacity);
		if(extra_data != null)
			map.put("extra_data", extra_data);
		return map;
	}

	public Map<String, Object> convertResourceToPrimaryMap(HashMap<String, Object> map) {
		return map;
	}

	@SuppressWarnings("unchecked")
	public void convertMapToResource(Map<String, Object> map) {
		id = (String) map.get("id");
		g_created_by_id = (String) map.get("g_created_by_id");
		g_created_by_name = (String) map.get("g_created_by_name");
		g_modified_by_id = (String) map.get("g_modified_by_id");
		g_modified_by_name = (String) map.get("g_modified_by_name");
		g_creation_time = (map.get("g_creation_time") == null ? null : ((Number) map.get("g_creation_time")).longValue());
		g_modify_time = (map.get("g_modify_time") == null ? null : ((Number) map.get("g_modify_time")).longValue());
		g_soft_delete = (String) map.get("g_soft_delete");
		g_status = (String) map.get("g_status");
		archived = (String) map.get("archived");
		archived_time = (map.get("archived_time") == null ? null : ((Number) map.get("archived_time")).longValue());
		airline_id = (String) map.get("airline_id");
		airline_name = (String) map.get("airline_name");
		destination_location_id = (String) map.get("destination_location_id");
		departure_location_id = (String) map.get("departure_location_id");
		departure_date_and_time = (map.get("departure_date_and_time") == null ? null : ((Number) map.get("departure_date_and_time")).longValue());
		arrival_date_and_time = (map.get("arrival_date_and_time") == null ? null : ((Number) map.get("arrival_date_and_time")).longValue());
		status = (String) map.get("status");
		price = (map.get("price") == null ? null : ((Number) map.get("price")).longValue());
		capacity = (map.get("capacity") == null ? null : ((Number) map.get("capacity")).longValue());
		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	@SuppressWarnings("unchecked")
	public void convertTypeUnsafeMapToResource(Map<String, Object> map) {
		Object idObj = map.get("id");
		if(idObj != null)
			id = idObj.toString();

		Object g_created_by_idObj = map.get("g_created_by_id");
		if(g_created_by_idObj != null)
			g_created_by_id = g_created_by_idObj.toString();

		Object g_created_by_nameObj = map.get("g_created_by_name");
		if(g_created_by_nameObj != null)
			g_created_by_name = g_created_by_nameObj.toString();

		Object g_modified_by_idObj = map.get("g_modified_by_id");
		if(g_modified_by_idObj != null)
			g_modified_by_id = g_modified_by_idObj.toString();

		Object g_modified_by_nameObj = map.get("g_modified_by_name");
		if(g_modified_by_nameObj != null)
			g_modified_by_name = g_modified_by_nameObj.toString();

		Object g_creation_timeObj = map.get("g_creation_time");
		if(g_creation_timeObj != null)
			g_creation_time = new Long(g_creation_timeObj.toString());

		Object g_modify_timeObj = map.get("g_modify_time");
		if(g_modify_timeObj != null)
			g_modify_time = new Long(g_modify_timeObj.toString());

		Object g_soft_deleteObj = map.get("g_soft_delete");
		if(g_soft_deleteObj != null)
			g_soft_delete = g_soft_deleteObj.toString();

		Object g_statusObj = map.get("g_status");
		if(g_statusObj != null)
			g_status = g_statusObj.toString();

		Object archivedObj = map.get("archived");
		if(archivedObj != null)
			archived = archivedObj.toString();

		Object archived_timeObj = map.get("archived_time");
		if(archived_timeObj != null)
			archived_time = new Long(archived_timeObj.toString());

		Object airline_idObj = map.get("airline_id");
		if(airline_idObj != null)
			airline_id = airline_idObj.toString();

		Object airline_nameObj = map.get("airline_name");
		if(airline_nameObj != null)
			airline_name = airline_nameObj.toString();

		Object destination_location_idObj = map.get("destination_location_id");
		if(destination_location_idObj != null)
			destination_location_id = destination_location_idObj.toString();

		Object departure_location_idObj = map.get("departure_location_id");
		if(departure_location_idObj != null)
			departure_location_id = departure_location_idObj.toString();

		Object departure_date_and_timeObj = map.get("departure_date_and_time");
		if(departure_date_and_timeObj != null)
			departure_date_and_time = new Long(departure_date_and_timeObj.toString());

		Object arrival_date_and_timeObj = map.get("arrival_date_and_time");
		if(arrival_date_and_timeObj != null)
			arrival_date_and_time = new Long(arrival_date_and_timeObj.toString());

		Object statusObj = map.get("status");
		if(statusObj != null)
			status = statusObj.toString();

		Object priceObj = map.get("price");
		if(priceObj != null)
			price = new Long(priceObj.toString());

		Object capacityObj = map.get("capacity");
		if(capacityObj != null)
			capacity = new Long(capacityObj.toString());

		extra_data = (Map<String, Object>) map.get("extra_data");
	}

	public void convertPrimaryMapToResource(Map<String, Object> map) {
	}

	public void convertTypeUnsafePrimaryMapToResource(Map<String, Object> map) {
	}

	public String getId() {
		return id;
	}

	public String getIdEx() {
		return id != null ? id : "";
	}

	public void setId(String id) {
		this.id = id;
	}

	public void unSetId() {
		this.id = null;
	}

	public boolean validateId(boolean add) throws ApplicationException {
		if(add && id == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[id]");
		return id != null;
	}

	public String getG_created_by_id() {
		return g_created_by_id;
	}

	public String getG_created_by_idEx() {
		return g_created_by_id != null ? g_created_by_id : "";
	}

	public void setG_created_by_id(String g_created_by_id) {
		this.g_created_by_id = g_created_by_id;
	}

	public void unSetG_created_by_id() {
		this.g_created_by_id = null;
	}

	public String getG_created_by_name() {
		return g_created_by_name;
	}

	public String getG_created_by_nameEx() {
		return g_created_by_name != null ? g_created_by_name : "";
	}

	public void setG_created_by_name(String g_created_by_name) {
		this.g_created_by_name = g_created_by_name;
	}

	public void unSetG_created_by_name() {
		this.g_created_by_name = null;
	}

	public String getG_modified_by_id() {
		return g_modified_by_id;
	}

	public String getG_modified_by_idEx() {
		return g_modified_by_id != null ? g_modified_by_id : "";
	}

	public void setG_modified_by_id(String g_modified_by_id) {
		this.g_modified_by_id = g_modified_by_id;
	}

	public void unSetG_modified_by_id() {
		this.g_modified_by_id = null;
	}

	public String getG_modified_by_name() {
		return g_modified_by_name;
	}

	public String getG_modified_by_nameEx() {
		return g_modified_by_name != null ? g_modified_by_name : "";
	}

	public void setG_modified_by_name(String g_modified_by_name) {
		this.g_modified_by_name = g_modified_by_name;
	}

	public void unSetG_modified_by_name() {
		this.g_modified_by_name = null;
	}

	public Long getG_creation_time() {
		return g_creation_time;
	}

	public long getG_creation_timeEx() {
		return g_creation_time != null ? g_creation_time : 0L;
	}

	public void setG_creation_time(long g_creation_time) {
		this.g_creation_time = g_creation_time;
	}

	@JsonIgnore
	public void setG_creation_time(Long g_creation_time) {
		this.g_creation_time = g_creation_time;
	}

	public void unSetG_creation_time() {
		this.g_creation_time = null;
	}

	public Long getG_modify_time() {
		return g_modify_time;
	}

	public long getG_modify_timeEx() {
		return g_modify_time != null ? g_modify_time : 0L;
	}

	public void setG_modify_time(long g_modify_time) {
		this.g_modify_time = g_modify_time;
	}

	@JsonIgnore
	public void setG_modify_time(Long g_modify_time) {
		this.g_modify_time = g_modify_time;
	}

	public void unSetG_modify_time() {
		this.g_modify_time = null;
	}

	public String getG_soft_delete() {
		return g_soft_delete != null ? g_soft_delete : "N";
	}

	public void setG_soft_delete(String g_soft_delete) {
		this.g_soft_delete = g_soft_delete;
	}

	public void unSetG_soft_delete() {
		this.g_soft_delete = "N";
	}

	public String getG_status() {
		return g_status;
	}

	public String getG_statusEx() {
		return g_status != null ? g_status : "";
	}

	public void setG_status(String g_status) {
		this.g_status = g_status;
	}

	public void unSetG_status() {
		this.g_status = null;
	}

	public String getArchived() {
		return archived != null ? archived : "N";
	}

	public void setArchived(String archived) {
		this.archived = archived;
	}

	public void unSetArchived() {
		this.archived = "N";
	}

	public Long getArchived_time() {
		return archived_time;
	}

	public long getArchived_timeEx() {
		return archived_time != null ? archived_time : 0L;
	}

	public void setArchived_time(long archived_time) {
		this.archived_time = archived_time;
	}

	@JsonIgnore
	public void setArchived_time(Long archived_time) {
		this.archived_time = archived_time;
	}

	public void unSetArchived_time() {
		this.archived_time = null;
	}

	public String getAirline_id() {
		return airline_id;
	}

	public String getAirline_idEx() {
		return airline_id != null ? airline_id : "";
	}

	public void setAirline_id(String airline_id) {
		this.airline_id = airline_id;
	}

	public void unSetAirline_id() {
		this.airline_id = null;
	}

	public String getAirline_name() {
		return airline_name;
	}

	public String getAirline_nameEx() {
		return airline_name != null ? airline_name : "";
	}

	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}

	public void unSetAirline_name() {
		this.airline_name = null;
	}

	public String getDestination_location_id() {
		return destination_location_id;
	}

	public String getDestination_location_idEx() {
		return destination_location_id != null ? destination_location_id : "";
	}

	public void setDestination_location_id(String destination_location_id) {
		this.destination_location_id = destination_location_id;
	}

	public void unSetDestination_location_id() {
		this.destination_location_id = null;
	}

	public String getDeparture_location_id() {
		return departure_location_id;
	}

	public String getDeparture_location_idEx() {
		return departure_location_id != null ? departure_location_id : "";
	}

	public void setDeparture_location_id(String departure_location_id) {
		this.departure_location_id = departure_location_id;
	}

	public void unSetDeparture_location_id() {
		this.departure_location_id = null;
	}

	public Long getDeparture_date_and_time() {
		return departure_date_and_time;
	}

	public void setDeparture_date_and_time(Long departure_date_and_time) {
		this.departure_date_and_time = departure_date_and_time;
	}


	public Long getArrival_date_and_time() {
		return arrival_date_and_time;
	}

	public void setArrival_date_and_time(Long arrival_date_and_time) {
		this.arrival_date_and_time = arrival_date_and_time;
	}


	public String getStatus() {
		return status;
	}

	public String getStatusEx() {
		return status != null ? status : "";
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void unSetStatus() {
		this.status = null;
	}

	public Long getPrice() {
		return price;
	}

	public long getPriceEx() {
		return price != null ? price : 0L;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@JsonIgnore
	public void setPrice(Long price) {
		this.price = price;
	}

	public void unSetPrice() {
		this.price = null;
	}

	public Long getCapacity() {
		return capacity;
	}

	public long getCapacityEx() {
		return capacity != null ? capacity : 0L;
	}

	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}

	@JsonIgnore
	public void setCapacity(Long capacity) {
		this.capacity = capacity;
	}

	public void unSetCapacity() {
		this.capacity = null;
	}

	public Map<String, Object> getExtra_data() {
		return extra_data;
	}

	public Object getExtra_data(String key) {
		return extra_data == null ? null : extra_data.get(key);
	}

	public void setExtra_data(Map<String, Object> extra_data) {
		this.extra_data = extra_data;
	}

	public void setExtra_data(String key, Object value) {
		if(extra_data == null)
			extra_data = new HashMap<String, Object>();
		extra_data.put(key, value);
	}

	public void unSetExtra_data() {
		this.extra_data = null;
	}
	public String getCluster() {
		return "DB_PROFILE";
	}
	public String getClusterType() {
		return "REPLICATED";
	}
	public  Class<?> getResultClass() {return FlightResult.class;};
	public  Class<?> getMessageClass() {return FlightMessage.class;};
	public  Class<?> getHelperClass() {return FlightHelper.class;};
	public  Class<?> getServiceClass() {return FlightService.class;};
}