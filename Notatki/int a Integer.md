Jest gdzieś

`class Long {private final long value;}`

każda zmienna reprezentująca klasy generyczne ma w sobie private i final
i ma wbudowane

`public` `getValue();` albo `getLong();`


Boxing i unboxing:

   `Long l = 123L;`
teoretycznie powinno być (Box) `Long l = new Long(123L);`

`Long a = L;` a podstawia się (Unbox): `a = L.getValue();`

z wielkiej jest klasą - może mieć dodatkowo wartość `null`

różnica jest w porównywaniu, na klasie używa się metody, na generyku operatory:
```java
//generic
long a1;
long a2;
if (a1 == a2)
```

```java
//class
Long a1;
Long a2;
if (a1.equals(a2))
```

czasem przejdzie Long `a1 == a2`, bo JVM wygenerował pierwsze 128 wartości, ale tak się nie robi

Do Long wypadałoby dodać jeszcze warunek nie równy null:
```java
//class
Long a1;
Long a2;
if (a1 != null && a1.equals(a2))
```

Poprawniej było by:

`Integer x = new Integer(1500);` niż `Integer x = 1500;` ale domyśla się
co chciałem zrobić.

## porównanie

deep vs. shallow

jak glęboko porównujemy 2 obiekty.

porównanie zwrotne i symetryczne

czy ja jestem jak Kazik, czy Kazik jest jak ja.

Jak dodajemy equals() dodjamy też hash() bo łatwiej porównać hash niż zawsze liczyć equals


_po obiekcie dziedziczy wszystko klasa, enum..._


