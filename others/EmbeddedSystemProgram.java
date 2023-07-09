import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class EmbeddedSystemProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Hedef klasörün yolu
        System.out.println("Hedef klasörün yolunu girin:");
        String targetFolderPath = scanner.nextLine();
        
        // 1. Text Area
        System.out.println("Text Area 1: Dosyaları listeleyin ve yeni dosya ekleyin");
        listFilesInFolder(targetFolderPath);
        System.out.println("Yeni dosya eklemek için dosya yolunu girin:");
        String newFilePath1 = scanner.nextLine();
        copyFile(newFilePath1, targetFolderPath);
        
        // 2. Text Area
        System.out.println("Text Area 2: Klasörü seçin ve dosyaları listeleyin ve yeni dosya ekleyin");
        System.out.println("Klasör yolunu girin:");
        String folderPath2 = scanner.nextLine();
        listFilesInFolder(folderPath2);
        System.out.println("Yeni dosya eklemek için dosya yolunu girin:");
        String newFilePath2 = scanner.nextLine();
        copyFile(newFilePath2, folderPath2);
        
        // 3. Text Area
        System.out.println("Text Area 3: Klasörü seçin ve dosyaları listeleyin ve yeni dosya ekleyin");
        System.out.println("Klasör yolunu girin:");
        String folderPath3 = scanner.nextLine();
        listFilesInFolder(folderPath3);
        System.out.println("Yeni dosya eklemek için dosya yolunu girin:");
        String newFilePath3 = scanner.nextLine();
        copyFile(newFilePath3, folderPath3);
        
        scanner.close();
    }
    
    // Belirtilen klasördeki dosyaları listeleyen metot
    public static void listFilesInFolder(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        
        if (files != null) {
            System.out.println("Klasördeki Dosyalar:");
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Klasör boş veya geçerli değil.");
        }
    }
    
    // Dosyayı hedef klasöre kopyalayan metot
    public static void copyFile(String sourceFilePath, String targetFolderPath) {
        try {
            File sourceFile = new File(sourceFilePath);
            File targetFolder = new File(targetFolderPath);
            
            if (sourceFile.exists() && targetFolder.isDirectory()) {
                Path targetPath = new File(targetFolder, sourceFile.getName()).toPath();
                Files.copy(sourceFile.toPath(), targetPath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Dosya başarıyla kopyalandı.");
            } else {
                System.out.println("Dosya veya hedef klasör geçerli değil.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
