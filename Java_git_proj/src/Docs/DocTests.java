package Docs;

public class DocTests {
    public static void main(String[] args) {
        Document pdfDocument = new PDFdocument();
        Document excelDocument = new ExcelDocument();

        pdfDocument.getDescription();
        excelDocument.getDescription();
    }
}
