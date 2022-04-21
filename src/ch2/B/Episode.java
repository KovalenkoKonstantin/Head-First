package ch2.B;

class Episode {

    int seriesNumber;
    int episodeNumber;

    void skipIntro() {
        System.out.println("Skipping intro...");
    }

    void skipToNext() {
        System.out.println("Loading next episode...");
    }

    public void play() {
        skipToNext();
        System.out.println("Playing episode number "+ episodeNumber);
        System.out.println("Series number is "+ seriesNumber);
    }
}

