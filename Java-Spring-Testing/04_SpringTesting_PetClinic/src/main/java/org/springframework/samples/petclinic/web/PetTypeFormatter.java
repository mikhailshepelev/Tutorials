package org.springframework.samples.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.service.ClinicService;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

public class PetTypeFormatter implements Formatter<PetType> {

    private final ClinicService clinicService;


    @Autowired
    public PetTypeFormatter(ClinicService clinicService) {
        this.clinicService = clinicService;
    }

    @Override
    public String print(PetType petType, Locale locale) {
        return petType.getName();
    }

    @Override
    public PetType parse(String text, Locale locale) throws ParseException {
        Collection<PetType> findPetTypes = this.clinicService.findPetTypes();
        for (PetType type : findPetTypes) {
            if (type.getName().equals(text)) {
                return type;
            }
        }
        throw new ParseException("type not found: " + text, 0);
    }
}
