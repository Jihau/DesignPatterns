package facade;

public class Memory {
    private final char[] data;
    public Memory(int size) {
        data = new char[size];
    }

    public void load(long position, char[] dataToLoad) {
        System.out.println("Loading data to memory at position " + position);
        // kopioidaan data muistiin
        for (int i = 0; i < dataToLoad.length; i++) {
            // täytetään data a-kirjaimilla
            data[(int) position + i] = dataToLoad[i];
        }
    }

    public char[] read(long position, int size) {
        // simuloidaan lukemista
        System.out.println("Reading " + size + " bytes from memory at position " + position);
        char[] dataToRead = new char[size];
        // kopioidaan data muistista
        for (int i = 0; i < size; i++) {
            // täytetään data a-kirjaimilla
            dataToRead[i] = data[(int) position + i];
        }
        // tulostetaan lopuksi rivinvaihto
        return dataToRead;
    }
}
