package test;

import java.io.*;

public class MyClass {
    public void readFileText(String filePath) {
        try {
            // Đọc file theo đường dẫn
            File file = new File(filePath);

            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            // Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }


}
