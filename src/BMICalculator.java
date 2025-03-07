class BMICalculator {
    private double weight;
    private double height;
    private double bodyMassIndex;

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBodyMassIndex() {
        return bodyMassIndex;
    }

    public BMICalculator(double w, double h) {
        this.weight = w;
        height = h;
        bodyMassIndex = weight / (height * height);
    }

    public void setWeight(double w) {
        this.weight = w;
        bodyMassIndex = weight / (height * height);
    }

    public void setHeight(double h) {
        this.height = h;
        bodyMassIndex = weight / (height * height);
    }


    public String calculate() {
        String  result = null;
        if (bodyMassIndex >=18.5 && bodyMassIndex <25) {
            result ="Norm";
        }
        if (bodyMassIndex >=25 && bodyMassIndex <30) {
            result ="Warning! ";
        }
        if (bodyMassIndex >=30) {
            result ="Fat";
        }
        if (bodyMassIndex <18.5) {
            result ="Deficit";
        }
        return result;
    }
}
