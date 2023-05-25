package folder;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/load-book")
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 10)
public class UpLoad extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        Part filePart = req.getPart("file");
        PrintWriter printWriter = resp.getWriter();
        String name = filePart.getSubmittedFileName();
        filePart.write("D:\\" + name);
        FileInputStream fileInputStream = new FileInputStream("text.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\" + name);
        int i = fileInputStream.read();
        while (i != -1) {
            i = fileInputStream.read();
        }
        printWriter.println("The file uploaded successfully" + LocalDateTime.now());
        fileInputStream.close();
        fileOutputStream.close();
    }
}

