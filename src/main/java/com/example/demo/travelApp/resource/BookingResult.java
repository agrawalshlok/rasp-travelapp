/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package com.example.demo.travelApp.resource;

import platform.defined.resource.Baseresult;
import platform.util.Util;

/*
 ********** This is a generated class Don't modify it.Extend this file for additional functionality **********
 * 
 */
 public class BookingResult extends Baseresult {
	Booking[] resource;

	public Booking[] getResource() {
		return resource;
	}

	public void setResource(Booking[] resource) {
		this.resource = resource;
	}

	public Booking getSingleResource() {
		if (Util.isEmpty(resource))
			return null;
		return (Booking)resource[0];
	}
}