package com.pluralsight;

import java.math.BigDecimal;

public abstract class Asset {
    protected String description;
    protected String dateAcquired;
    protected BigDecimal originalCost;

    public Asset(String description, String dateAcquired, BigDecimal originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public abstract BigDecimal getValue();

    public void setOriginalCost(BigDecimal originalCost) {
        this.originalCost = originalCost;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, $%,.2f, $%,.2f", getDescription(), getDateAcquired(), originalCost, getValue());
    }
}
