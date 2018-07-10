# Kółko i krzyżyk

## wymagania niefunkcjonalne:
- trzeba wieloosobowo;
- klasa, która pokazuje na boku wynik chwilowy (obserwator)
- układy wzorców też mają swoje nazwy
i są skatalogowane (architektura gwiazda),
a tutaj: MVC
- 3 role:
  - gracz - _kontroler_ , który wydaje polecenia
  - fragment do trzymania danych - _model_
  - obserwator - _widok_

- rozdzielenie klas (model, controller, view)
kontroler nie ma związku z widokiem
widok jest tylko jeden (notyfikacja)

funkcjonuje jako standard programow wieloużytkownikowych



### Notatki

2 klasy Controller:

klasa abstrakcyjna - trochę więcej niż interfejs

```java
abstract class Controller{
    void makeRuch();
}
```

interfejs też był by poprawny

po Controller dziedziczy klasa Man i klasa Ai
(może dziedziczyć ją Ai o określonym stopniu trudności np. AiSilly)

model musi mieć referencję w konstruktorze do widoku (argument View)

zaproponować Main konstruujący klasy


```
public class View {
    void print();
    void event();
}
```

```
public class Model {
    XO [int x][int y];
    final int dim = 3;
    public enum XO {YES, NO, EMPTY}
    boolean isEmpty(x, y);
    void setBoard(x, y, XO);
    XO[][] getBoard();

    XO won();
    XO whoIsWinner();
    void changed(); //powiadomienie do zrobienia setterem - wewnętrzną procedurą

    boolean isPlaying();

    void reset();
}
```


