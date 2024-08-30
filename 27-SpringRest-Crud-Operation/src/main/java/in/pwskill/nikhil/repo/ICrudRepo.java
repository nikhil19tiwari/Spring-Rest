package in.pwskill.nikhil.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskill.nikhil.model.Employee;

public interface ICrudRepo extends JpaRepository<Employee, Integer> {
// C  R  U  D  operation will perform 
}
