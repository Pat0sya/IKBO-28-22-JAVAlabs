package mirea.javalabs.lab22.idocument;

// Конкретный класс для текстового документа
class TextDocument implements IDocument {
    private String content;

    public TextDocument() {
        this.content = "";
    }

    public TextDocument(String content) {
        this.content = content;
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document");
        if (!content.isEmpty()) {
            System.out.println("Document Content: " + content);
        } else {
            System.out.println("Document is empty.");
        }
    }

    @Override
    public void save() {
        System.out.println("Saving Text Document");
        System.out.println("Document Content Saved: " + content);
    }

    public void setContent(String content) {
        this.content = content;
    }
}
