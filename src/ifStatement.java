public class ifStatement {
    public static void main(String[] args) {
        boolean isBluetooEnabled = false;
        int fileSended = 3;

        if (isBluetooEnabled) {
            fileSended++;
            System.out.println("Archivo enviado");
        } else {
            fileSended--;
            System.out.println("Por favor resetee el Bluetooh");
        }

        System.out.println(isBluetooEnabled);
        System.out.println(fileSended);
    }
}