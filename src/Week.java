public enum Week {
    MONDAY("java техникалык сабагы"),
    TUESDAY("java практикалык сабагы жана английский сабагы"),
    WEDNESDAY("java техникалык сабагы"),
    THURSDAY("java практикалык сабагы "),
    FRIDAY("java техникалык сабагы"),
    SATURDAY("java практикалык сабагы"),
    SUNDAY("выходной");
    private String lesson;

    Week( String lesson) {
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Week" +
                "lesson='" + lesson ;
    }
}
