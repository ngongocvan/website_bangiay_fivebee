<<<<<<< HEAD:datn/src/main/java/com/example/bangiay/reponsitory/KichCoRepository.java
package com.example.bangiay.reponsitory;
=======
package com.example.bangiay.repository;
>>>>>>> 3666285da668cb0fd9ffda782c7c89ed94a1b0aa:datn/src/main/java/com/example/bangiay/repository/KichCoRepository.java

import com.example.bangiay.entity.KichCo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface KichCoRepository extends JpaRepository<KichCo, UUID> {
}
