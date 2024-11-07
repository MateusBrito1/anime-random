package org.anime;


public class Anime {
    private String id;
    private Attributes attributes;

    public String getId() {
        return id;
    }

    public Attributes getAttributes() { //
        return attributes;
    }

    public static class Attributes {
        private String synopsis;
        private String canonicalTitle;
        private String createdAt;
        private String youtubeVideoId;

        public String getSynopsis() {
            return synopsis;
        }

        public String getCanonicalTitle() {
            return canonicalTitle;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public String getYoutubeVideoId() {
            return youtubeVideoId;
        }
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id='" + id + '\'' +
                ", title='" + attributes.getCanonicalTitle() + '\'' +
                ", synopsis='" + attributes.getSynopsis() + '\'' +
                ", createdAt='" + attributes.getCreatedAt() + '\'' +
                ", youtubeVideoId='" + attributes.getYoutubeVideoId() + '\'' +
                '}';
}

}
