class Organization {
    protected String name;
    protected String location;

    public Organization(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("Organization Name: " + name);
        System.out.println("Location: " + location);
    }
}

class InsuranceCompany extends Organization {
    private String insuranceType;

    public InsuranceCompany(String name, String location, String insuranceType) {
        super(name, location);
        this.insuranceType = insuranceType;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Insurance Type: " + insuranceType);
    }
}

class OilAndGasCompany extends Organization {
    private double dailyProduction;

    public OilAndGasCompany(String name, String location, double dailyProduction) {
        super(name, location);
        this.dailyProduction = dailyProduction;
    }

    public double getDailyProduction() {
        return dailyProduction;
    }

    public void setDailyProduction(double dailyProduction) {
        this.dailyProduction = dailyProduction;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Daily Production: " + dailyProduction + " barrels");
    }
}

class Factory extends Organization {
    private String productType;

    public Factory(String name, String location, String productType) {
        super(name, location);
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Product Type: " + productType);
    }
}

