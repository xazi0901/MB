// Do wskazania odpowiednie lokalizacje klasy Java
import com.capgemini.wsb.persistence.dao.AddressDao;
import com.capgemini.wsb.persistence.entity.AddressEntity;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.service.PatientService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientServiceTest {
    
    @Autowired
    private PatientService patientService;
    

    @Transactional
    @Test
    public void testShouldRemovePatient() {

        // Tworzymy pacjenta
        PatientEntity createPatientEntity = new PatientEntity();
        // Nadajemy mu id
        createPatientEntity.setId(1);
        // Przypadek testowy jego wyszukania
        PatientEntity patientEntity = patientService.findById(1);

        // when we search then we remove
        final AddressEntity removed = patientService.deleteById(1);
        // Załóż że jeżeli usunięty to wynik null (Czyli jeżeli faktycznie nie istnieje to wynik powyższej zmiennej powinien być null)
        assertThat(removed).isNull();

    }


    
}
