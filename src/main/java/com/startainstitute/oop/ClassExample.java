package com.startainstitute.oop;

@SuppressWarnings({"SameParameterValue", "ConstantValue"})
class ClassExample {

    public static void main(String[] args) {


        String name = "1Anton";
        try {
            if (name.charAt(0) == ' ') {
                throw new IllegalArgumentException("Name starts with blank char");
            }
            if (name.charAt(0) == '1') {
                throw new RuntimeException("Name starts with 1");
            }
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return;
        } catch (RuntimeException exception) {
            System.out.println("Got runtime exception");
            return;
        }

        saveToDatabase(name);


        // music Track using class

//        System.out.println(hello());
    }

    private static void saveToDatabase(String name) {
    }

    private static String hello() {
        Integer integer = 128912982;
        return "Hello";
    }

    private void trackProcessor() {

        Track queenTrack = new Track();
        queenTrack.artistName = "Queen";

        queenTrack.setTitle("   We are the champions");
        queenTrack.durationSeconds = 200;

        Track abbaTrack = new Track();
    }
}

class Track {

    // private, public, "default", protected
    private String title;
    String artistName;
    int durationSeconds;

    public void setTitle(String title) {
        if (title.charAt(0) == ' ') {
            throw new IllegalArgumentException();
        }
        this.title = title;
    }

    //    public Track() {
//    }
}
