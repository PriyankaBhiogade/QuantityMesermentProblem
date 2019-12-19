package com.quantitymeasurment;

import java.util.Objects;

public class VolumeMeasurement {

    public VolumesUnits volumeUnits;
    public  Double value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VolumeMeasurement that = (VolumeMeasurement) o;
        return volumeUnits == that.volumeUnits &&
                Objects.equals(value, that.value);
    }

    public VolumeMeasurement(VolumesUnits volumeUnits, Double value) {
        this.volumeUnits = volumeUnits;
        this.value = value;
    }

    public boolean compareVolumeUnits(VolumeMeasurement that) {
        Boolean conversion = VolumesUnits.conversion(that, this);
        return conversion;
    }

    public Double additionOfVolumes(VolumeMeasurement that) {
        Double addition = volumeUnits.addition(that, this);
        return addition;
    }

}
