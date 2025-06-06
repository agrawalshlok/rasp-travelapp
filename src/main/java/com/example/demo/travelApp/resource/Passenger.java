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
public class Passenger extends BaseResource {
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
	private String email = null;
	private String first_name = null;
	private String last_name = null;
	private String gender = null;
	private String dob = null;
	private String phone_no = null;
	private String user_id = null;
	private String booking_id = null;
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
	public static String FIELD_EMAIL = "email";
	public static String FIELD_FIRST_NAME = "first_name";
	public static String FIELD_LAST_NAME = "last_name";
	public static String FIELD_GENDER = "gender";
	public static String FIELD_DOB = "dob";
	public static String FIELD_PHONE_NO = "phone_no";
	public static String FIELD_USER_ID = "user_id";
	public static String FIELD_BOOKING_ID = "booking_id";
	public static String FIELD_EXTRA_DATA = "extra_data";

	private static final long serialVersionUID = 1L;
	public final static ResourceMetaData metaData = new ResourceMetaData("passenger");

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

		Field emailField = new Field("email", "String");
		emailField.setRequired(true);
		emailField.setLength(128);
		metaData.addField(emailField);

		Field first_nameField = new Field("first_name", "String");
		first_nameField.setRequired(true);
		first_nameField.setLength(128);
		metaData.addField(first_nameField);

		Field last_nameField = new Field("last_name", "String");
		last_nameField.setRequired(true);
		last_nameField.setLength(128);
		metaData.addField(last_nameField);

		Field genderField = new Field("gender", "String");
		genderField.setLength(128);
		metaData.addField(genderField);

		Field dobField = new Field("dob", "String");
		dobField.setLength(128);
		metaData.addField(dobField);

		Field phone_noField = new Field("phone_no", "String");
		phone_noField.setLength(15);
		metaData.addField(phone_noField);

		Field user_idField = new Field("user_id", "String");
		user_idField.setForeign(new Foreign("user"));
		user_idField.setLength(128);
		metaData.addField(user_idField);

		Field booking_idField = new Field("booking_id", "String");
		booking_idField.setForeign(new Foreign("booking"));
		booking_idField.setLength(128);
		metaData.addField(booking_idField);

		Field extra_dataField = new Field("extra_data", "Map");
		extra_dataField.setValueType("Object");
		metaData.addField(extra_dataField);


		metaData.setTableName("passenger");

		metaData.setCluster("DB_PROFILE");
	}

	public Passenger() {this.setId(Util.getUniqueId());}
	public Passenger(String id) {this.setId(id);}

	public Passenger(Passenger obj) {
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
		this.email = obj.email;
		this.first_name = obj.first_name;
		this.last_name = obj.last_name;
		this.gender = obj.gender;
		this.dob = obj.dob;
		this.phone_no = obj.phone_no;
		this.user_id = obj.user_id;
		this.booking_id = obj.booking_id;
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
		if(email != null)
			map.put("email", email);
		if(first_name != null)
			map.put("first_name", first_name);
		if(last_name != null)
			map.put("last_name", last_name);
		if(gender != null)
			map.put("gender", gender);
		if(dob != null)
			map.put("dob", dob);
		if(phone_no != null)
			map.put("phone_no", phone_no);
		if(user_id != null)
			map.put("user_id", user_id);
		if(booking_id != null)
			map.put("booking_id", booking_id);
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
		if(validateEmail(add))
			map.put("email", email);
		if(validateFirst_name(add))
			map.put("first_name", first_name);
		if(validateLast_name(add))
			map.put("last_name", last_name);
		if(gender != null)
			map.put("gender", gender);
		if(dob != null)
			map.put("dob", dob);
		if(phone_no != null)
			map.put("phone_no", phone_no);
		if(user_id != null)
			map.put("user_id", user_id);
		if(booking_id != null)
			map.put("booking_id", booking_id);
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
		email = (String) map.get("email");
		first_name = (String) map.get("first_name");
		last_name = (String) map.get("last_name");
		gender = (String) map.get("gender");
		dob = (String) map.get("dob");
		phone_no = (String) map.get("phone_no");
		user_id = (String) map.get("user_id");
		booking_id = (String) map.get("booking_id");
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

		Object emailObj = map.get("email");
		if(emailObj != null)
			email = emailObj.toString();

		Object first_nameObj = map.get("first_name");
		if(first_nameObj != null)
			first_name = first_nameObj.toString();

		Object last_nameObj = map.get("last_name");
		if(last_nameObj != null)
			last_name = last_nameObj.toString();

		Object genderObj = map.get("gender");
		if(genderObj != null)
			gender = genderObj.toString();

		Object dobObj = map.get("dob");
		if(dobObj != null)
			dob = dobObj.toString();

		Object phone_noObj = map.get("phone_no");
		if(phone_noObj != null)
			phone_no = phone_noObj.toString();

		Object user_idObj = map.get("user_id");
		if(user_idObj != null)
			user_id = user_idObj.toString();

		Object booking_idObj = map.get("booking_id");
		if(booking_idObj != null)
			booking_id = booking_idObj.toString();

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

	public String getEmail() {
		return email;
	}

	public String getEmailEx() {
		return email != null ? email : "";
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void unSetEmail() {
		this.email = null;
	}

	public boolean validateEmail(boolean add) throws ApplicationException {
		if(add && email == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[email]");
		return email != null;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getFirst_nameEx() {
		return first_name != null ? first_name : "";
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void unSetFirst_name() {
		this.first_name = null;
	}

	public boolean validateFirst_name(boolean add) throws ApplicationException {
		if(add && first_name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[first_name]");
		return first_name != null;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getLast_nameEx() {
		return last_name != null ? last_name : "";
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public void unSetLast_name() {
		this.last_name = null;
	}

	public boolean validateLast_name(boolean add) throws ApplicationException {
		if(add && last_name == null)
			throw new ApplicationException(ExceptionSeverity.ERROR, "Requierd validation Failed[last_name]");
		return last_name != null;
	}

	public String getGender() {
		return gender;
	}

	public String getGenderEx() {
		return gender != null ? gender : "";
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void unSetGender() {
		this.gender = null;
	}

	public String getDob() {
		return dob;
	}

	public String getDobEx() {
		return dob != null ? dob : "";
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void unSetDob() {
		this.dob = null;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public String getPhone_noEx() {
		return phone_no != null ? phone_no : "";
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public void unSetPhone_no() {
		this.phone_no = null;
	}

	public String getUser_id() {
		return user_id;
	}

	public String getUser_idEx() {
		return user_id != null ? user_id : "";
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public void unSetUser_id() {
		this.user_id = null;
	}

	public String getBooking_id() {
		return booking_id;
	}

	public String getBooking_idEx() {
		return booking_id != null ? booking_id : "";
	}

	public void setBooking_id(String booking_id) {
		this.booking_id = booking_id;
	}

	public void unSetBooking_id() {
		this.booking_id = null;
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
	public  Class<?> getResultClass() {return PassengerResult.class;};
	public  Class<?> getMessageClass() {return PassengerMessage.class;};
	public  Class<?> getHelperClass() {return PassengerHelper.class;};
	public  Class<?> getServiceClass() {return PassengerService.class;};
}