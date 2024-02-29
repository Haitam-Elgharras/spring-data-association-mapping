package ma.enset.jpa.service;


import ma.enset.jpa.entities.Consultation;
import ma.enset.jpa.entities.Medecin;
import ma.enset.jpa.entities.Patient;
import ma.enset.jpa.entities.RendezVous;

import java.util.List;

public interface IHospitalService {
    Patient savePatient(Patient p);
    Medecin saveMedecin(Medecin m);
    RendezVous saveRendezVous(RendezVous r);
    Consultation saveConsultation(Consultation c);

    Medecin findMedecinByName(String name);

    List<Patient> findAllPatients();
}
