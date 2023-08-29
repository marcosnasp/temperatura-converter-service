module com.example.temperatura.converter {

    requires spring.beans;
    requires spring.context;
    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    exports com.example.temperatura.converter to spring.beans, spring.context, spring.web, spring.boot, spring.boot.autoconfigure;
    exports com.example.temperatura.converter.controller to spring.beans, spring.context, spring.web, spring.boot, spring.boot.autoconfigure;
}