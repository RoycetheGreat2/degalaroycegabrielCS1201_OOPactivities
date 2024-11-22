public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Mikhail Baryshnikov", "American", 76, "Dancing", DanceStyle.BALLET);
        dancer.displayInfo();

        System.out.println();
        
        Painter painter = new Painter("David Hockney", "British", 87, "Painting", Medium.ACRYLIC);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Lualhati Bautista", "Filipino", 77, "Writing", WritingStyle.NONFICTION);
        writer.displayInfo();
    }
}