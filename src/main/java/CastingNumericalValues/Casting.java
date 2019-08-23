package CastingNumericalValues;

public class Casting {

    public static void main(String[] args) {

        byte byteValue = 20;
        short shortValue = 1222;
        int intValue = 122224444;
        long longValue = 1122334455;

        float floatValue = 9999.0f;
        double doubleValue = 9999.4;

        System.out.println(Long.MAX_VALUE);

        //castowanie z longa na inta - w nawiasach typ na jaki chcesz zmienić:
        intValue = (int)longValue;


        // w przypadku poniżej nie trzeba kastować bo faktyczna wartość się nie zmieniła int był 122224444 a teraz double jest 122224444.0 czyli to samo
        doubleValue = intValue;

        intValue = (int)floatValue; // nie zaokrągle, po prostu odcina to co po przecinku.

        //można też castować liczby, nie muszą być kastowane zmienne. Np.
        intValue = (int) 1234322.0023;
        System.out.println(intValue);

        //z castowaniem trzeba uważać, bo idzie do okoła - max wartość byta to 127 więc 128 - będzie pierwszą minimalna liczbą dla byta czyli -128
        byteValue = (byte)128;

    }
}
