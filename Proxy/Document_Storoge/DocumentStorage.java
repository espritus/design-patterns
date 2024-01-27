package project.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DocumentStorage implements DocumentStorageLib {
    public DocumentStorage() {
    }

    public List<Document> search(String query) {
        List<Document> documents = this.docStorage();
        List<Document> res = new ArrayList();
        Iterator var4 = documents.iterator();

        while(var4.hasNext()) {
            Document document = (Document)var4.next();
            if (document.matches(query)) {
                res.add(document);
            }
        }

        return res;
    }

    private List<Document> docStorage() {
        List<Document> storage = new ArrayList();
        storage.add(new Document("Document 1", "1"));
        storage.add(new Document("Untitled", "2"));
        storage.add(new Document("Untitled", "3"));
        return storage;
    }

    public void uploadDocument(Document doc) {
        System.out.println("document was uploaded");
    }

    public void updateDocument(String id, Document doc) {
        System.out.println("document was updated");
    }

    public Document getDocument(String id) {
        List<Document> list = this.docStorage();
        Iterator var3 = list.iterator();

        Document document;
        do {
            if (!var3.hasNext()) {
                return null;
            }

            document = (Document)var3.next();
        } while(!document.getId().equals(id));

        return document;
    }

    public void deleteDocument(String id) {
        System.out.println("document was deleted");
    }
}

