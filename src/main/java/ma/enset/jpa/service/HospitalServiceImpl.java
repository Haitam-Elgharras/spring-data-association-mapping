package ma.enset.jpa.service;

import jakarta.transaction.Transactional;
import ma.enset.jpa.entities.Consultation;
import ma.enset.jpa.entities.Medecin;
import ma.enset.jpa.entities.Patient;
import ma.enset.jpa.entities.RendezVous;
import ma.enset.jpa.repositories.ConsultationRepository;
import ma.enset.jpa.repositories.MedecinRepository;
import ma.enset.jpa.repositories.PatientRepository;
import ma.enset.jpa.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient p) {
        // service code

        // unique id based on time
        p.setId(UUID.randomUUID().toString());
        return patientRepository.save(p);
    }

    @Override
    public Medecin saveMedecin(Medecin m) {
        return medecinRepository.save(m);
    }

    @Override
    public RendezVous saveRendezVous(RendezVous r) {
        return rendezVousRepository.save(r);
    }

    @Override
    public Consultation saveConsultation(Consultation c) {
        return consultationRepository.save(c);
    }

    @Override
    public Medecin findMedecinByName(String name) {
        return medecinRepository.findByNom(name).orElse(null);
    }

    @Override
    public List<Patient> findAllPatients() {
        return patientRepository.findAll();
    }
}
