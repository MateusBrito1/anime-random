package org.anime;


public class Anime {
    private String id;
    private Attributes attributes;

    public String getId() {
        return id;
    }

    public Attributes getAttributes() { //  é usado apenas get para acessar a api.
        return attributes;
    }

    public static class Attributes {
        private String synopsis;
        private String canonicalTitle;
        private String createdAt;

        public String getSynopsis() {
            return synopsis;
        }

        public String getCanonicalTitle() {
            return canonicalTitle;
        }

        public String getCreatedAt() {
            return createdAt;
        }


    }

    @Override
    public String toString() {
        return "Anime{" +
                "id='" + id + '\'' +
                ", title='" + attributes.getCanonicalTitle() + '\'' +
                ", synopsis='" + attributes.getSynopsis() + '\'' +
                ", createdAt='" + attributes.getCreatedAt() + '\'' +
                '}';
}

}
