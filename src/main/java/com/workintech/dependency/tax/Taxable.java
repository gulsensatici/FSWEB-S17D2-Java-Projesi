package com.workintech.dependency.tax;

public interface Taxable {
    double getSimpleTaxRate();
    double getSMiddleTaxRate();
    double getUpperTaxRate();
}
