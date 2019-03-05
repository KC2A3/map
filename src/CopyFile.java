import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
  public static void main(String[] args) throws Exception {
    copy("file1", "file2");
    System.out.println("文件拷贝完成!");
  }

  public static void copy(String src, String des) throws Exception {
    File file1 = new File(src);
    File[] fs = file1.listFiles();
    File file2 = new File(des);
    if (!file2.exists()) {
      file2.mkdirs();
    }
    for (File f : fs) {
      if (f.isFile()) {
        fileCopy(f.getPath(), des + "\\" + f.getName());
      } else if (f.isDirectory()) {
        copy(f.getPath(), des + "\\" + f.getName());
      }
    }
  }

  private static void fileCopy(String src, String des) throws Exception {
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(des));
    int i = -1;
    byte[] bt = new byte[2014];
    while ((i = bis.read(bt)) != -1) {
      bos.write(bt, 0, i);
    }
    bis.close();
    bos.close();
  }
}
