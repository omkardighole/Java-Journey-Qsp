package Principle_Of_Oop;

public class FileManager {

    private String name;
    private String path;
    private int size;
    private String modifiedDate;
    private int drives;

    public FileManager() {
        super();
    }

    public FileManager(String name, String path, int size, String modifiedDate, int drives) {
        super();
        this.name = name;
        this.path = path;
        this.size = size;
        this.modifiedDate = modifiedDate;
        this.drives = drives;
    }

    public void displayFileManager() {
        System.out.println("FileManager Details");
        System.out.println("Name : " + name);
        System.out.println("Path : " + path);
        System.out.println("Size : " + size);
        System.out.println("Modified Date : " + modifiedDate);
        System.out.println("Drives : " + drives);
    }
}

class Drive extends FileManager {
    private String driveName;
    private int totalSpace;
    private int usedSpace;
    private int availableSpace;

    public Drive() {
        super();
    }

    public Drive(String name, String path, int size, String modifiedDate, int drives,
                 String driveName, int totalSpace, int usedSpace, int availableSpace) {
        super(name, path, size, modifiedDate, drives);
        this.driveName = driveName;
        this.totalSpace = totalSpace;
        this.usedSpace = usedSpace;
        this.availableSpace = availableSpace;
    }

    public void displayDrive() {
        System.out.println("Drive Details");
        System.out.println("Drive Name : " + driveName);
        System.out.println("Total Capacity : " + totalSpace);
        System.out.println("Used Space : " + usedSpace);
        System.out.println("Available Space : " + availableSpace);
    }
}

class Folder extends Drive {
    private int numberOfFiles;
    private int numberOfSubFolders;
    private String folderType;
    private String ownerOfFolder;

    public Folder() {
        super();
    }

    public Folder(String name, String path, int size, String modifiedDate, int drives,
                  String driveName, int totalSpace, int usedSpace, int availableSpace,
                  int numberOfFiles, int numberOfSubFolders, String folderType, String ownerOfFolder) {
        super(name, path, size, modifiedDate, drives, driveName, totalSpace, usedSpace, availableSpace);
        this.numberOfFiles = numberOfFiles;
        this.numberOfSubFolders = numberOfSubFolders;
        this.folderType = folderType;
        this.ownerOfFolder = ownerOfFolder;
    }

    public void displayFolder() {
        System.out.println("Folder Details");
        System.out.println("Files : " + numberOfFiles);
        System.out.println("SubFolders: " + numberOfSubFolders);
        System.out.println("Folder Type : " + folderType);
        System.out.println("Owner Of Folder: " + ownerOfFolder);
    }
}

class File extends Folder {
    private String fileName;
    private String type;
    private String readOnly;
    private String visibility;

    public File() {
        super();
    }

    public File(String name, String path, int size, String modifiedDate, int drives,
                String driveName, int totalSpace, int usedSpace, int availableSpace,
                int numberOfFiles, int numberOfSubFolders, String folderType, String ownerOfFolder,
                String fileName, String type, String readOnly, String visibility) {
        super(name, path, size, modifiedDate, drives, driveName, totalSpace, usedSpace, availableSpace,
                numberOfFiles, numberOfSubFolders, folderType, ownerOfFolder);
        this.fileName = fileName;
        this.type = type;
        this.readOnly = readOnly;
        this.visibility = visibility;
    }

    public void displayFile() {
        System.out.println("File Details");
        System.out.println("File Name : " + fileName);
        System.out.println("Type : " + type);
        System.out.println("ReadOnly : " + readOnly);
        System.out.println("Visibility : " + visibility);
    }
}

public class MultiLevelInheritanceFileManager {
    public static void main(String[] args) {
        File f1 = new File(
                "MyFile", "C:/Documents", 512, "2025-04-22", 2,   // FileManager
                "LocalDisk(C:)", 100000, 45000, 55000,             // Drive
                10, 3, "System Folder", "Admin",                   // Folder
                "Java_QSP", "User File", "YES", "Hidden"          // File
        );

        f1.displayFileManager();
        f1.displayDrive();
        f1.displayFolder();
        f1.displayFile();
    }
}
