package com.raml.example.impl;

import com.raml.example.api.BarController;
import com.raml.example.api.model.Bar;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;
import java.util.List;

public class BarControllerImpl extends BarController {

    @Override
    public List<Bar> getBars() {
        return super.getBars();
    }

    @Override
    public ResponseEntity<?> createBar(@Valid Bar bar) {
        return super.createBar(bar);
    }

    @Override
    public Bar getBarByBarId(String barId) {
        return super.getBarByBarId(barId);
    }

    @Override
    public Bar updateBar(String barId, @Valid Bar bar) {
        return super.updateBar(barId, bar);
    }

    @Override
    public ResponseEntity<?> deleteBarByBarId(String barId) {
        return super.deleteBarByBarId(barId);
    }

    @Override
    public List<Bar> getBarsByFooId(String fooId) {
        return super.getBarsByFooId(fooId);
    }
}
