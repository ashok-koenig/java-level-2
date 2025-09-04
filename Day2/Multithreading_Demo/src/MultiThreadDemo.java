class FileDownload extends Thread {
    private String fileName;
    public FileDownload(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Downloading "+ fileName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Downloading "+ fileName + " completed");
    }
}

class FileUpload extends Thread{
    private String fileName;
    public FileUpload(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Uploading "+ fileName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Uploading "+ fileName + " completed");
    }
}
public class MultiThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        FileDownload download = new FileDownload("download.txt");
        FileUpload upload = new FileUpload("upload.txt");

        download.start();
        upload.start();

        download.join();
        upload.join();

        System.out.println("Main thread finished");
    }
}
