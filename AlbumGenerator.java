package org.example;
// How to deal with main method?
public class AlbumGenerator {
    public static void main(String[] args) {
        generateAlbums();
        for (int i = 0; i < generateAlbums().length; i++) {
            // System.out.println(albumGenerator()[i].getArtist() + " ");
            System.out.println(generateAlbums()[i].getName() + " was released in " + generateAlbums()[i].getYear()+ " by " + generateAlbums()[i].getArtist());
        }
    }
    public static Album[] generateAlbums()
    {
    //public static String [] albumGenerator(String[] args) {
        // Album[] albums = new Album[4];
        Album dark = new Album();
        dark.setArtist("Pink Floyd");
        dark.setName("Dark Side of the Moon");
        dark.setYear(1973);
        Album wish = new Album();
        wish.setArtist("Pink Floyd");
        wish.setName("Wish you were here");
        wish.setYear(1975);
        Album animals = new Album();
        animals.setArtist("Pink Floyd");
        animals.setName("Animals");
        animals.setYear(1977);
        Album wall = new Album();
        wall.setArtist("Pink Floyd");
        wall.setName("The Wall");
        wall.setYear(1979);
        // String albums [] = {dark.getArtist()};
        Album[] a = {dark, wish, animals, wall};
        return a;
    }
}
