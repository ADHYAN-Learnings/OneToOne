package com.org.interfRepository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import javax.persistence.Query;
import com.org.modal.CoachingInstitute;

public interface CoachingInstituteInterfaceRepository extends JpaRepository<CoachingInstitute,Long> {
	

}
