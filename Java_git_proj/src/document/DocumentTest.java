package document;

public class DocumentTest {
    public static void main(String[] args) {
        Document exceelDocument = new ExcelDocument();
        Document pdfDocument = new PDFdocument();

        exceelDocument.getDescrition();
        pdfDocument.getDescrition();
    }
}
