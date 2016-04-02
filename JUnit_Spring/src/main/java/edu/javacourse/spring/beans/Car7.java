package edu.javacourse.spring.beans;

import java.util.Date;

public class Car7 {

    private Long id;
    private String model;
    private int year;
    private Date lastService;

    int calls;

    public Car7() {
    }
    public Car7(Long id, String model, int year, Date lastService) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.lastService = lastService;
    }

    public void createCar5(String model) throws IllegalArgumentException {
        if (model == null)
            throw new IllegalArgumentException("Model must be not null");
        System.out.println("Create model...");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getLastService() {
        return lastService;
    }

    public void setLastService(Date lastService) {
        this.lastService = lastService;
    }

    @Override
    public String toString() {
        return "Car7{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", lastService=" + lastService +
                '}';
    }

    /**
     * Счетчик вызова методов класса
     * @return
     */
    public int getCalls() {
        return calls;
    }
}
