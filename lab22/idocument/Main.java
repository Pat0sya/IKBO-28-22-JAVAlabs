package mirea.javalabs.lab22.idocument;

public class Main {
    public static void main(String[] args) {
        ICreateDocument textDocumentFactory = new CreateTextDocument();
        EditorApp textEditor = new EditorApp(textDocumentFactory);

        // Создаем новый текстовый документ и устанавливаем его содержимое
        TextDocument newTextDocument = new TextDocument();
        newTextDocument.setContent("Hello, this is a new document!");

        // Устанавливаем созданный документ в каркас приложения
        textEditor.setDocument(newTextDocument);

        // Открываем новый текстовый документ
        textEditor.openDocument();

        // Сохраняем текстовый документ
        textEditor.saveDocument();
    }
}