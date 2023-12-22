package mirea.javalabs.lab22.idocument;

// Конкретная реализация фабрики для текстового документа
class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        return new TextDocument();
    }
}
