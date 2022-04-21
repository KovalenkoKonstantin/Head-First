package ch2.B;

class EpisodeTestDrive {
    public static void main(String[] args) {

        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.play();
        episode.skipIntro();
    }
}

