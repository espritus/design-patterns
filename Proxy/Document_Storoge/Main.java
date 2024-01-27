package project.com;

import java.util.List;

public class Main {

    public static void main(String[] args) throws AuthenticationException {
        DocumentStorage ds = new DocumentStorage();
        DocumentStorageProxy proxy = new DocumentStorageProxy(ds);

        proxy.authenticateUser("Alisa", "987654321");
        List<Document> list = proxy.search("Untitled");
       /* for (Document doc : list) {
            System.out.println(doc.getId());
        }*/
        proxy.deleteDocument("2");
    }
}
class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
