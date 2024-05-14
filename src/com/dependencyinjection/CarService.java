package com.dependencyinjection;

public class CarService {
    private CarDAO carDAO;
    private EmailService emailService;
    private MOTService motService;

    // * Constructor Injection
    public CarService(CarDAO carDAO, EmailService emailService, MOTService motService) {
        this.carDAO = carDAO;
        this.emailService = emailService;
        this.motService = motService;
    }

//    ! This is bad because it makes CarService tightly coupled with CarDAO - CarService creates its dependencies by itself :(
    /*
    public CarService() {
        carDAO = new CarDAO();
    }
     */
}
