package sbnz.blisskin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sbnz.blisskin.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
