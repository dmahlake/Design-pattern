package com.design.pattern.proxy;

public class SystemConfiguration {

    static String databaseConnectionUrl;
    static String databaseConnectionUser;
    static String databaseConnectionPassword;

    static {
        SystemConfiguration.databaseConnectionUrl = "jdbc:mysql://localhost:3306/proxydatabase?useSSL=false&serverTimezone=UTC";
        SystemConfiguration.databaseConnectionUser = "root";
        SystemConfiguration.databaseConnectionPassword = "12345";

    }
}
