package mirea.javalabs.lab22.idocument;


class EditorApp {
    private IDocument document;
    private ICreateDocument documentFactory;

    public EditorApp(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;
        this.document = documentFactory.createNew();
    }

    public void setDocument(IDocument document) {
        this.document = document;
    }

    public void newDocument() {
        this.document = documentFactory.createNew();
        document.open();
    }

    public void openDocument() {
        this.document = documentFactory.createOpen();
        document.open();
    }

    public void saveDocument() {
        document.save();
    }
}
