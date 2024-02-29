package ma.enset.jpa.repositories;


import ma.enset.jpa.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, String> {
    Patient findByNom(String nom);
}
