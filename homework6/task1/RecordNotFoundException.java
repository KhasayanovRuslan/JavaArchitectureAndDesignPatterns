public class RecordNotFoundException extends Exception {

    public RecordNotFoundException(int id) {
        System.out.println("Record with " + id + " not found");
    }
}
