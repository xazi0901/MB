Laboratorium II - Architektura warstwowa, EntityManager oraz testy

Uwaga! Do wykonania zadan konieczne jest zaimplementowanie modelu obiektowo-relacyjnego bazy z Laboratorium I !

1. Korzystajac z przykladowego kodu dla encji AddressEntity utworz warstwy dostepu do danych
 (Repository plik PatientDao.java oraz PatientDaoImpl.java , 
  Service plik PatientService.java oraz PatientServiceImpl.java :),
   mappery plik PatientMapper.java:), 
   TOsy plik PatientTO.java:), 
   opcjonalnie RESTy plik PatientController.java - dla chetnych) dla encji PatientEntity. Spelnione maja byc nasteoujace wymagania:
   - TO pacjenta ma miec liste wizyt ktore sie odbyly :)
   - kazda wizyta ma miec informacje o lekarzu oraz pacjencie (Ma tylko o pacjencie, Zachęcam do zaimplementowania danych o Lekarzu)
   - rozszerz encje PatientEntity o jedno dowolne pole innego typu niz String, odwzoruj je w TO. :) Są listy Wizyty oraz informacje z danej wizyty (medical_treatment)
2. Korzystajac z przykladowych insertow w pliku data.sql uzupelnij encje pacjenta, doktorow oraz wizyt danymi testowymi :) -- Napisałem inserty z laba pierwszego, jeżeli chcesz więcej danych to je wpisz w tej samej kolejności :)
3. Korzystajac z przykladoych testow dla encji Address, napisz testy do serwisu (uwaga! serwisu, nie DAO!) pacjenta:
   - test usuwajacy pacjenta sprawdza czy usuniete zostaly wszystkie wizyty (kaskada) i czy nie zostali usunieci doktorzy - NIE USUWA DOKTORÓW ALE TEZ NIE USUWA PACJENTÓW - MOŻE CI SIE BĘDZIE CHCIAŁO(MUSISZ USTAWIĆ ODPOWIEDNIE KASKADY w adnotacjach @ManyToOne i tak dalej
   cascade = CascadeType.*) -> Poczytaj o tym co i jak to dojdziesz do pełnego rozwiązania
   - pobranie pacjenta po ID powinno zwrocic struktore TO-sow odpowiadajaca wczesniejszym zalozeniom. W asercjach sprawdz poprawnosc odczytu dodanego przez Ciebie pola z punktu pierwszego - TE SAME UWAGI CO NA GÓRZE!