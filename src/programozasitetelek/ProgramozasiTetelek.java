

package programozasitetelek;


public class ProgramozasiTetelek {

    
    public static void main(String[] args) {
        
        //Tömb feltöltése
        int random1 = (int)(Math.random()*10)+1;        // véletlen szám 1 és 10 között
        
        int[] tomb12 = new int[10];
        for (int j = 0; j < tomb12.length; j++) {
            tomb12[j] = (int)(Math.random()*10)+1;
            System.out.print(tomb12[j] + ", ");
        }
        System.out.println( "\n" + "----------------------------------------------------");

        // MEGSZÁMLÁLÁS TÉTELE
        // Az alapfeladat az, hogy számoljuk meg, hogy egy adott tömbben hány darab adott tulajdonságú elem van.

        int[] tomb1 = {12,23,34,2,123,45,76,56,82,23};  // tomb1 feltöltése számokkal 
        int szamlalo1 = 0;                              // szamlalo létrejozása, ami számolja a feltételnek megfelelő elemek számát

            for (int i = 0; i < tomb1.length; i++) {    // ciklus, ami végigmegy a tomb1 elemeken
                if ( tomb1[i] > 50 && tomb1[i] < 100) { // ha a vizsgált elem a megedott feltételnek megfelel, belép ebbe a törzsbe
                    szamlalo1++;                        // ha belépett a szamlalo értékét növeli 1-el
                }
            }
        System.out.println("A tömbben " + szamlalo1 + " db 50 és 100 közötti szám van!");   // kiírjuk az eredményt
        
        System.out.println("----------------------------------------------------");

        // ÖSSZEGZÉS TÉTELE
        // A tomb2 tömbben található páros számok összege
        int[] tomb2 = {23,54,23,12,456,78,98,76,45,675,2345};   // tomb2 tömb létrehozása, feltöltése
        int osszegzes = 0;                                      // osszegzes változó létrehozása
        
        for (int i = 0; i < tomb2.length; i++) {                // ciklus, végigmegyünk a tömb elemein
            if ( tomb2[i] % 2 == 0 ) {                          // feltételvizsgálat - páros számok keresése
                osszegzes += tomb2[i];                          // ha a szám páros, az osszegzes változóba tesszük, majd a következőt hozzáadjuk
            }
        }
        System.out.println("A tömbben lévő páros számok összege: " + osszegzes );   // kiírjuk az eredményt
        
        System.out.println("----------------------------------------------------");
        
        // TÖMB ELEMEINEK ÁTLAGA
        
        int[] tomb3 = {34,65,32,11,23,67,98,7,32,1,45,6,89};    // tomb3 tömb létrehozása, feltöltése
        int osszeg = 0;                                         // változó az összeghez
        int db = 0;                                             // változó a darabszámhoz
        for (int i = 0; i < tomb3.length; i++) {                // ciklus, végigmegyünk a tömb elemein
            if ( tomb3[i] % 2 != 0 ) {                          // feltételvizsgálat - páratlan számok keresése
                osszeg += tomb3[i];                             // ha a szám páratlan, az osszegzes változóba tesszük, majd a következőt hozzáadjuk
                db++;                                           // ha a szám páratlan, a db változó értékét 1-el növeljük 
            }
        }
        double atlag = (double) osszeg/db;                                              // változó az átlaghoz
        System.out.println("A tömbben található " + db + " db páratlan szám!");         // kiírjuk az eredményt db szám
        System.out.println("A tömbben található páratlan számok összege: " + osszeg);   // kiírjuk az eredményt összeg
        System.out.println("A tömbben található páros számok átlaga: " + atlag);        // kiírjuk az eredményt átlag
        
        System.out.println("----------------------------------------------------");
        
        // ELDÖNTÉS TÉTELE
        // Ennél a feladattípusnál azt vizsgáljuk, hogy egy tömbben található-e egy bizonyos tulajdonságú elem. 
        int[] tomb4 = {23,567,-34,5,3,56,8765,43,2};                            // tomb tömb létrehozása, feltöltése
        int i = 0;                                                              // változó
        while( i < tomb4.length && tomb4[i] > 0 ){                              // ciklus, végigmegyünk a tömb elemein, és a megadott keresési feltétel ELLENTETTJÉT KERESVE megyünk a tömb elemein végig
            i++;                                                                // ha a fenti feltétel igaz i értékét 1-el növelük
        }
        if ( i < tomb4.length ) {                                               // ha i értéke kisebb volt a tömb elemeinek hosszánál, volt találat
            System.out.println("A tömb tartalmaz negatív számot!");             // a feltétel igaz
        }
        else{
            System.out.println("A tömb nem tartalmaz negatív számot!");         // a feltétel nem igaz
        }
        
        System.out.println("----------------------------------------------------");
        
        
        // KIVÁLASZTÁS TÉTELE
        // egy adott elem pontosan hol szerepel a tömbben
        int[] tomb5 = {23,65,25,34,76};
        int a = 0;
        while( tomb5[a] != 25 ){
            a++;
        }
        System.out.println("A 25 szám indexe: " + a);
        
        
        System.out.println("----------------------------------------------------");
        
        // KERESÉS TÉTELE
        // egy adott elem van-e és pontosan hol szerepel a tömbben
        int[] tomb6 = {23,65,25,34,76};
        int a1 = 0;
        while( a1 < tomb6.length && tomb6[a1] != 25 ){
            a1++;
        }
        if( a1 < tomb6.length ){
            System.out.println("A 25 szám a tömbben " + (a + 1) + ". helyen van.");
        }
        else {
            System.out.println("Nincs ilyen szám!");
        }
        
        System.out.println("----------------------------------------------------");
        
        // MINIMUM/MAXIMUM MEGKERESÉS TÉTELE
        int[] tomb7 = {2,56,34,876,9,87,23,456,5,2,45,78,98,3};
        int max = 0;
        int min = 0;
        for (int j = 1; j < tomb7.length; j++) {
            if( tomb7[j] > tomb7[max] ){
                max = j;
            }
        }
        for (int j = 1; j < tomb7.length; j++) {
            if ( tomb7[j] < tomb7[min] ) {
                min = j;
            }
        }
        System.out.println("A tömbben lévő legnagyobb szám: " + tomb7[max]);
        System.out.println("A tömbben lévő legkisebb szám: " + tomb7[min]);
        
        
        System.out.println("----------------------------------------------------");
        
        // RENDEZÉS TÉTELE
        // sorba kell rendezni egy tömb elemeit
        int[] tomb8 = {4,76,8,234,65,78,23,5,1,55,3};
        int csere;
        for (int j = 0; j < tomb8.length-1; j++) {
            for (int k = j + 1; k < tomb8.length; k++) {
                if ( tomb8[j] > tomb8[k] ) {
                    csere = tomb8[j];
                    tomb8[j] = tomb8[k];
                    tomb8[k] = csere;
                }               
            }
        }       
        for (int j = 0; j < tomb8.length; j++) {
            System.out.print(tomb8[j] + ", ");
        }
        System.out.println("\n"+"----------------------------------------------------");
        // rendezés másik megoldása
        int[] tomb9 = {4,76,8,234,65,78,23,5,1,55,3};
        int csere1;
        int min1;
        for (int j = 0; j < tomb9.length-1; j++) {
            min1 = j;
            for (int k = j + 1; k < tomb9.length; k++) {
                if ( tomb9[k] < tomb9[min1] ) {
                    min1 = k;
                }
            }
            if ( min1 != j ) {
                csere1 = tomb9[j];
                tomb9[j] = tomb9[min1];
                tomb9[min1] = csere1;
            }
        }
        for (int j = 0; j < tomb9.length; j++) {
            System.out.print(tomb9[j] + ", ");
        }
        System.out.println("\n"+"----------------------------------------------------");
        
        // KIVÁLOGÁTÁS TÉTELE
        // bizonyos tulajdonságnak, vagy tulajdonságoknak megfelelő elemeket kell egy tömbből egy másik tömbbe kiválogatni
        int[] tomb10 = {2,44,65,45,32,76,8,953,123,45,32,11,4,6,8,1};
        int[] paratlan = new int[tomb10.length];
        int db2 = 0;
        for (int j = 0; j < tomb10.length; j++) {
            if ( tomb10[j] % 2 != 0 ) {
                paratlan[db2] = tomb10[j];
                db2++;
            }
        }
        for (int j = 0; j < paratlan.length; j++) {
            System.out.print(paratlan[j] + ", ");
        }
        // ezzel az üres helyek az új tömbben maradnak
        
        System.out.println("\n"+"----------------------------------------------------");
        
        
        // itt csak akkora lesz az új tömb, ahány elemet beleteszünk
        int[] tomb11 = {2,44,65,45,32,76,8,953,123,45,32,11,4,6,8,1};
        int db3 = 0;
        for (int j = 0; j < tomb11.length; j++) {
            if ( tomb11[j] % 2 != 0 ) {
                db3++;
            }
        }
        int[] paratlan1 = new int[db3];
        db3 = 0;
        for (int j = 0; j < tomb11.length; j++) {
            if ( tomb11[j] % 2 != 0 ) {
                paratlan1[db3] = tomb11[j];
                db3++;
            }
        }
        for (int j = 0; j < paratlan1.length; j++) {
            System.out.print(paratlan1[j] + ", ");
        }
        
        System.out.println("\n"+"----------------------------------------------------");
        
        // SZÉTVÁLOGATÁS TÉTELE
        // Az alapfeladat az, hogy az eredeti tömb minden elemét két külön tömbbe kell elhelyezni.
        
        // tomb13 létrehozása, darabszám meghatározása egy véletlen szám generátorral
        int[] tomb13 = new int[random1];
        System.out.print("A 13. tömb elemei: ");
        for (int j = 0; j < tomb13.length; j++) {
            tomb13[j] = (int)(Math.random()*50)+1;
            System.out.print(tomb13[j] + ", ");
        }
        
        System.out.println();
        
        // a tomb13 végigjárva ciklussal, a páros elemek megszámlálása
        int parosdb = 0;
        for (int j = 0; j < tomb13.length; j++) {
            if ( tomb13[j] % 2 == 0 ) {
                parosdb++;
            }
        }
        // két új tömb - páros és páratlan számoknak
        int[] paros11 = new int[parosdb];
        int[] paratlan11 = new int[tomb13.length-parosdb];
        
        parosdb = 0;
        int paratlandb = 0;
        for (int j = 0; j < tomb13.length; j++) {
            if ( tomb13[j] % 2 == 0 ) {
                paros11[parosdb] = tomb13[j];
                parosdb++;
            }
            else{
                paratlan11[paratlandb] = tomb13[j];
                paratlandb++;
            }
        }
        // a két tömb kiiratása
        System.out.print("A tömb páratlan számai: ");
        for (int j = 0; j < paratlan11.length; j++) {
            System.out.print(paratlan11[j] + ", ");
        }
        System.out.println();
        System.out.print("A tömb páros számai: ");
        for (int j = 0; j < paros11.length; j++) {
            System.out.print(paros11[j] + ", ");
        }
        System.out.println("\n"+"----------------------------------------------------");
        
        // KOMPLEX FELADAT
        //  Adott egy 10 elemű tömb melyet véletlen számokkal töltöttünk fel a [-9;9] intervallumból. Írjuk ki növekvő sorrendben a tömbben szereplő páros számokat.
        
        // tomb14 feltöltése 10 db -9 és 9 közötti egész számmal
        int[] tomb14 = new int[10];
        for (int j = 0; j < tomb14.length; j++) {
            tomb14[j] = (int)(Math.random()*19)-9;
        }
        // a tomb14 tömbben lévő számok kiiratása
        for (int j = 0; j < tomb14.length; j++) {
            System.out.print(tomb14[j] + " ");
        }
        System.out.println();
        // a tomb14 vizsgálata, a páros számok keresése, a paros5 tömb méretének beállítása
        int parosdb5 = 0;
        for (int j = 0; j < tomb14.length; j++) {
            if ( tomb14[j] % 2 == 0 ) {
                parosdb5++;
            }
        }
        int[] paros5 = new int[parosdb5];
        // a paros5 tömb feltöltése a páros számokkal
        parosdb5 = 0;
        for (int j = 0; j < tomb14.length; j++) {
            if ( tomb14[j] % 2 == 0 ) {
                paros5[parosdb5] = tomb14[j];
                parosdb5++;
            }
        }
        // a paros5 tömb elemei növekvő sorrendbe állítása
        int csere5;
        for (int j = 0; j < parosdb5-1; j++) {
            for (int k = j + 1; k < parosdb5; k++) {
                if ( paros5[j] > paros5[k] ) {
                    csere5 = paros5[j];
                    paros5[j] = paros5[k];
                    paros5[k] = csere5;
                }
            }
        }
        // a páros számok kiiratása növekvő sorrendben
        for (int j = 0; j < parosdb5; j++) {
            System.out.print(paros5[j] + " ");
        }
        System.out.println("\n"+"----------------------------------------------------");
        
        
    }

}
