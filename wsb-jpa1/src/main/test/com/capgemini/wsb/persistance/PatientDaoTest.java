import com.capgemini.wsb.persistence.dao.PatientDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientDaoTest
{
    @Autowired
    private PatientDao patientDao;

    @Transactional
    @Test
    public void testShouldFindPatientByLastName() {
        // Zmienna String dla nazwiska którego się spodziewamy
        String expectedLastName = "Smith";

    // Tworzymy nowy Obiekt Patient
    PatientEntity testPatient = new PatientEntity();
    // DAJEMU MU IME
    testPatient.setFirstName("John");
    // DAJEMU MU NAZWISKO
    testPatient.setLastName(expectedLastName);
    // ZAPISUJEMY (TUTAJ CHYBA TRZEBA GO JESZCZE SKONWERSOWAĆ DO TO ? A może nie?)
    patientDao.save(testPatient);
    // TWORZYMY PRZYPADEK TESTOWY KTÓRY MA WYWOŁAĆ FUNKCJE findOneByLastName -> Co oznacza że ta funkcja musi być zaimplementowana żebyśmy mogli
    // Ją wywołać
    PatientEntity foundPatient = patientDao.findOneByLastName(expectedLastName);
    // ZAŁÓŻ że nasze wyszukiwanie nie będą nullem (0)
    assertNotNull(foundPatient);
    // ZAŁÓŻ ŻE NASZ STRING Z SAMEJ GÓRY JEST RÓWNY NAZWISKU NASZEJ ZMIENNEJ FOUNDPATIENT który wywołuje funkcję findOneByLastName!
    assertEquals(expectedLastName, foundPatient.getLastName());
    }
}