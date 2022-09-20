public class Main {
    public static void main(String[] args) {
        /**
         * Mesaj sağlama sözleşmesi
         * TR yada EN yada ffarklı dillerde sözleşme imz.
         */
        IProvider provider;
        IPrinter printer;
        /**
         * TR olarak mesaj dönüyor.
         */
        provider = new MessageProviderTR();
        printer = new StandartPrinter();
        printer.setProvider(provider);
        printer.print();
        printer = new ErrorPrinter();
        printer.setProvider(provider);
        printer.print();
        provider = new MessageProviderEN();
        printer = new ErrorPrinter();
        printer.setProvider(provider);
        printer.print();

    }
}