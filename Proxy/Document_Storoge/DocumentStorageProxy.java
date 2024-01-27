package project.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DocumentStorageProxy implements DocumentStorageLib {
    private DocumentStorage documentStorage;
    private UserSessionManager sessionManager;

    public DocumentStorageProxy(DocumentStorage documentStorage) {
        this.documentStorage = documentStorage;
        this.sessionManager = new UserSessionManager();
    }

    public void authenticateUser(String username, String password) throws AuthenticationException {
        User user = this.sessionManager.searchByUserName(username);
        if (user.getPassword().equals(password)) {
            this.sessionManager.startSession(user);
        } else {
            throw new AuthenticationException("Invalid username or password");
        }
    }

    private void logDocumentAction(User user, String action, String documentId) {
        System.out.println("User " + user.getUsername() + " " + action + " (id:" + documentId + ") document ");
    }

    public List<Document> search(String query) {
        List<Document> results = this.documentStorage.search(query);
        User user = this.sessionManager.getCurrentUser();
        List<Document> filteredResults = new ArrayList();
        Iterator var5 = results.iterator();

        while(var5.hasNext()) {
            Document result = (Document)var5.next();
            if (this.hasAccess(user, result.getId())) {
                filteredResults.add(this.filterDocument(result, user));
            }
        }

        return filteredResults;
    }

    public Document getDocument(String id) {
        User user = this.sessionManager.getCurrentUser();
        if (this.hasAccess(user, id)) {
            Document doc = this.documentStorage.getDocument(id);
            this.logDocumentAction(user, "downloaded", id);
            return this.filterDocument(doc, user);
        } else {
            return null;
        }
    }

    private boolean hasAccess(User user, String documentId) {
        return true;
    }

    public void uploadDocument(Document doc) {
        User user = this.sessionManager.getCurrentUser();
        if (this.hasAccess(user, (String)null)) {
            this.documentStorage.uploadDocument(doc);
            this.logDocumentAction(user, "uploaded", doc.getId());
        }

    }

    public void updateDocument(String id, Document doc) {
        User user = this.sessionManager.getCurrentUser();
        if (this.hasAccess(user, id)) {
            this.documentStorage.updateDocument(id, doc);
            this.logDocumentAction(user, "updated", id);
        }

    }

    public void deleteDocument(String id) {
        User user = this.sessionManager.getCurrentUser();
        if (this.hasAccess(user, id)) {
            this.documentStorage.deleteDocument(id);
            this.logDocumentAction(user, "deleted", id);
        }

    }

    private Document filterDocument(Document document, User user) {
        return document;
    }
}
