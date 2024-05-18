insert into doctor (id, first_name, last_name, telephone_number, email,doctor_number,specialization)
            values (1, 'Kracy', 'Macierewicz', '890999777', 'macierewicz@gmail.com','0700','DERMATOLOGIST');
insert into patient (id,first_name,last_name,telephone_number,email,patient_number,date_of_birth)
            values (1, 'Zbigniew', 'Ziobro', '123456789', 'ziobro@gmail.com','1234', '2007-12-03');
insert into address (id, address_line1, address_line2, city, postal_code, doctor_entity_id)
            values (1, 'xx', 'yy', 'city', '62-030',1);
insert into address (id, address_line1, address_line2, city, postal_code, patient_entity_id)
            values (2, 'aa', 'bb', 'cityL', '62-900',1);
insert into visit (id, description, time, patient_entity_id, doctor_entity_id)
            values (1,'Przyjrzenie sie penisowi','2024-05-03T10:15:30',1,1);
insert into medical_treatment (id, description, type, visit_entity_id)
            values (1,'Wykryto zapalenie trzona fiuta', 'USG',1);
/* JEŻELI CHCESZ WYPEŁNIĆ WIĘCEJ DANYCH PRZYKŁADOWYCH TO POWYŻEJ JE WPIERDOL. PAMIĘTAJ O KOLEJNOŚCI(NAJPIERW OSOBA, POTEM ADRES,POTEM VISIT A NA KONCU TREATMENT) */

/* LAB 3 */
/* QUERY DLA 1 */
SELECT * FROM patient
        WHERE last_name = 'Ziobro';
/* QUERY DLA 2 */
SELECT v.id, v.description, v.time, v.patient_entity_id, v.doctor_entity_id,
       p.id, p.date_of_birth, p.email, p.first_name, p.last_name, p.patient_number, p.telephone_number
FROM visit v
INNER JOIN patient p ON v.patient_entity_id = p.id
WHERE p.id = 1;
/* QUERY DLA 3 || Ostatnia linijka tam gdzie X wpisujemy wartość NP.1 !!! */
SELECT p.*, COUNT(v.id) AS visit_count
FROM patient p
INNER JOIN visit v ON v.patient_entity_id = p.id
GROUP BY p.id, p.date_of_birth, p.email, p.first_name, p.last_name, p.patient_number, p.telephone_number
HAVING COUNT(v.id) > X;
/* QUERY dla 4 || W labie było polecenie o dodaniu innej wartości do Entity i tą wartością jest Lista. To query wyszukuje Pacjenta którego
obsługiwał lekarz o id X. Query oddaje wszystkie informacje o pacjencie, danej wizycie(bądź wszystkich wizytach) oraz pełnych danych lekarza
Ostatnia linijka parametr X zamień na id lekarza!!! */
SELECT p.*, v.*, d.*
FROM patient p
INNER JOIN visit v ON v.patient_entity_id = p.id
INNER JOIN doctor d ON v.doctor_entity_id = d.id
WHERE v.doctor_entity_id = X;
/* Query zastępcze dla 4 || Później doczytałem o tym że zapytanie ma się nie odnosić do konkretnej wartości, dlatego proponuje wyszukanie
pacjentów których czas wizyty był wcześniej bądź równy czasu podanemu dla przykładu naszych danych jest to czas 2024-05-03 10:15:30.
Ostatnia linijka parametr X zamień na czas wizyty!!!! CZAS PODAJEMY W '2024-05-03 10:15:30.' */
SELECT p.*, v.*, d.*
FROM patient p
INNER JOIN visit v ON v.patient_entity_id = p.id
INNER JOIN doctor d ON v.doctor_entity_id = d.id
WHERE v.time <= 'X';

