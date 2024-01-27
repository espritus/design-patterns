package project.com;

import java.util.List;

public interface DocumentStorageLib {
    List<Document> search(String var1);

    Document getDocument(String var1);

    void uploadDocument(Document var1);

    void updateDocument(String var1, Document var2);

    void deleteDocument(String var1);
}
