package Proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Image> photoAlbum = new ArrayList<>();

        photoAlbum.add(new ProxyImage("photo1.jpg"));
        photoAlbum.add(new ProxyImage("photo2.jpg"));
        photoAlbum.add(new ProxyImage("photo3.jpg"));

        System.out.println("Photo album contents:");
        for (Image image : photoAlbum) {
            image.showData();
        }

        System.out.println("\nDisplaying the first photo:");
        photoAlbum.get(0).displayImage();

        System.out.println("\nDisplaying the second photo:");
        photoAlbum.get(1).displayImage();

        System.out.println("\nDisplaying the third photo:");
        photoAlbum.get(2).displayImage();
    }
}