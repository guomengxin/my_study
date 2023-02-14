package office;

import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkToPdf {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\test\\workToPdf\\test1.docx");
            XWPFDocument xwpfDocument = new XWPFDocument(fileInputStream);
            PdfOptions pdfOptions = PdfOptions.create();
            FileOutputStream fileOutputStream = null;
            fileOutputStream = new FileOutputStream("D:\\test\\workToPdf\\pdf\\test.pdf");
            PdfConverter.getInstance().convert(xwpfDocument,fileOutputStream,pdfOptions);
            fileInputStream.close();
            fileOutputStream.close();
            System.out.println("结束------------");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
