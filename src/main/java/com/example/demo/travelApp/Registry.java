package com.example.demo.travelApp;
import platform.helper.HelperManager;
import platform.webservice.ServiceManager;
import com.example.demo.travelApp.helper.*;
import com.example.demo.travelApp.service.*;
public class Registry {
		public static void register(){
				 HelperManager.getInstance().register(UserHelper.getInstance());
				 HelperManager.getInstance().register(PassengerHelper.getInstance());
				 HelperManager.getInstance().register(AirlineAdminHelper.getInstance());
				 HelperManager.getInstance().register(LocationHelper.getInstance());
				 HelperManager.getInstance().register(AirlineHelper.getInstance());
				 HelperManager.getInstance().register(FlightHelper.getInstance());
				 HelperManager.getInstance().register(SuperAdminHelper.getInstance());
				 HelperManager.getInstance().register(DocumentHelper.getInstance());
				 HelperManager.getInstance().register(BookingHelper.getInstance());
				 ServiceManager.getInstance().register(new UserService());
				 ServiceManager.getInstance().register(new PassengerService());
				 ServiceManager.getInstance().register(new AirlineAdminService());
				 ServiceManager.getInstance().register(new LocationService());
				 ServiceManager.getInstance().register(new AirlineService());
				 ServiceManager.getInstance().register(new FlightService());
				 ServiceManager.getInstance().register(new SuperAdminService());
				 ServiceManager.getInstance().register(new DocumentService());
				 ServiceManager.getInstance().register(new BookingService());
		}
}
