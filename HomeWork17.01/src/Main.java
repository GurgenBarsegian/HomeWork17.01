public class Main {
    public static void main(String[] args) {

        // Bit 1 or 0
        // Byte 0000 0000 - 8
        // short 0000 0000 0000 0000 - 16
        // int 0000 0000 0000 0000 0000 0000 0000 0000 -32
        //  и т.д.
        byte byteVar = 1;
        short shortVar = 2000;
        int intVar = 40000;

        shortVar = (short)intVar;

        byteVar = (byte)shortVar;

        System.out.println(byteVar);

        byte byteVar1 = 2;
        short shortVar1 = 3002;
        int intVar1 = 23000;

        shortVar1 = byteVar1;
        intVar1 = shortVar1;
        System.out.println(intVar1);

        // меньшее можно "запихнуть" в большее "без потерь качеств", но большее нельзя в меньшее. За исключением если перед большим указать переменную целевой меньшей.
        








    }
}