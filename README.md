"# wsb_jpa" 

Michał, nie zrobię Ci tych labów na maxa bo uważam że i tak się nie obronisz z pytań a nie daj bóg dopierdoli wam kolokwium praktyczne i 
będzie ciężko. Zrobiłem 75% tych labów.
W plikach Lab*.md napisałem Ci co zostało zrobione. W plikach **Test.java zrobiłem Ci deskrypcje jak te testy przeprowadzić.
Plik data.sql zawiera zapytania sql według wymagań laba nr. 1 oraz nr.3
Ścieżki Postman:
GET: http://localhost:8091/patient/{id} -> Wyszukaj pacjenta o id. Jest to zadanie dla chętnych z Lab 2(Resty dla PatientEntity). W miejscu
{id} wpisujesz np. 1 PRZYKŁAD: http://localhost:8091/patient/1 . Zadanie 1 z lab 2 oddaje Ci(To pacjenta ma oddawać), jedyne czego nie oddaje
to informacji o doktorze który taką wizytę przeprowadził i to zostawiłem Tobie w celach edukacyjnych.
DELETE: http://localhost:8091/patientDelete/{id} -> Usuń pacjenta o id. Jest to zadanie dla chętnych. PRZYKŁAD: http://localhost:8091/patientDelete/1 . Zrobiłem Ci controller który obsługuje ten proces. Ostatnie zadanie tego laba ma testować czy usuwają się pacjent.
Zostawiłem Ci deskrypcje jak robić te testy + funkcje do przetestowania tego już masz napisaną. Testy zostawiam Ci w celach edukacyjnych.
Jeżeli będziesz miał problemy, bądź uważasz że za mało zrobiłem to pisz na FB zobaczymy co z tego wyjdzie dalej chociaż wolę żebyś sam się pomęczył z dokończeniem bo zostawiłem Ci takie rzeczy które po zrealizowaniu powinny obdarować Ciebie pełnym objawieniem w tym temacie.

GITHUB (obsługa poprzez commandLine):
1. Wchodzisz na repo i najpierw klonujesz repozytorium za pomocą komendy : git clone <link do repo>
2. Inicjalizujesz repozytorium lokalnie(na swoim komputerze) za pomocą komendy : git init
3. Wchodzisz na swoje konto w github i tworzysz repozytorium. Na podstronie konkretnego repozytorium klikasz sobie zielony przycisk code
i stamtąd kopiujesz link repozytorium.
4. Sklonowany link repozytorium wykorzystujesz dodając remote origin w swoim repozytorium lokalnym za pomocą komendy: git remote add origin <sklonowany link>
5. Tworzysz branch master za pomocą komendy: git checkout -b "master".
6. Dodajesz wszystkie pliki lokalne do kolejki commit za pomocą komendy: git add .
7. Commitujesz wszystkie pliki z kolejki za pomocą komendy: git commit -m "Zrobione zadania"
8. Pushujesz commit do zdalnego repozytorium za pomocą komendy: git push origin master
9. Wchodzisz na stronę swojego repozytorium i widzisz że został zrobiony commit i masz pull requesta, na stronie możesz merge branch master do main i GOTOWE.
!!!! JEŻELI BĘDZIESZ MIAŁ PROBLEMY TO PISZ !!!!
