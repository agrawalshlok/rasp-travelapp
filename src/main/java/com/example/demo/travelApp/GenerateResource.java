package com.example.demo.travelApp;
import platform.defined.ResourceGenerator;
import platform.util.Util;

public class GenerateResource {
    public static void main(String []args) throws Exception {
        String web_app_director = "./src/main/resources/static/ui/json";
        String controller_dir = "./src/main/java/controller";
        String controller_package = "controller";
        if (args.length > 0) {
            web_app_director = args[0];
        }
        if (args.length > 1) {
            controller_dir = args[1];
        }
        if (args.length > 2) {
            controller_package = args[2];
        }
        ResourceGenerator generator = new ResourceGenerator("com.example.demo.travelApp","./src/main/java/com/example/demo/travelApp/");
        if (!Util.isEmpty(web_app_director)) {
            generator.setWeb_app_directory(web_app_director);
        }
        if (!Util.isEmpty(controller_dir)) {
            generator.setController_directory(controller_dir);
            generator.setController_directory_package(controller_package);
        }
        generator.generateCode("./src/main/java/com/example/demo/travelApp/", null);
    }
}
